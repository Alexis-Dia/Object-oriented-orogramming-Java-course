package by.bntu.fitr.povt.alexeyd.lab20;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Semaphore;

import static by.bntu.fitr.povt.alexeyd.lab20.concurency.BusStation.MAX_CAPACITY_NUMBER_OF_BUSES_IN_THE_ONE_STATION;

public class Bus implements Runnable {

    private int occupyingTime;
    private BusStation busStation;//Объект синхронизации
    private Thread thread;
    private static final Semaphore SEMAPHORE = new Semaphore(MAX_CAPACITY_NUMBER_OF_BUSES_IN_THE_ONE_STATION, false);
    private String backPlateNumber;
    public final ExecutorService executor;

    public Bus(int occupyingTime, BusStation busStation, String backPlateNumber, ExecutorService executor) {
        this.occupyingTime = occupyingTime;
        this.busStation = busStation;
        this.backPlateNumber = backPlateNumber;
        thread = new Thread(this);
        this.executor = executor;
        thread.start();
    }

    @Override
    public void run() {
        try {
            SEMAPHORE.acquire();
            busStation.takePlace(occupyingTime, backPlateNumber);
            SEMAPHORE.release();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
