package by.bntu.fitr.povt.alexeyd.lab20.concurency;

import java.util.concurrent.Semaphore;

import static by.bntu.fitr.povt.alexeyd.lectureThreads.exercise2.BusStation.MAX_CAPACITY_NUMBER_OF_BUSES_IN_THE_ONE_STATION;

public class Bus implements Runnable {

    private int occupyingTime;
    private BusStation busStation;//Объект синхронизации
    private Thread thread;
    private static final Semaphore SEMAPHORE = new Semaphore(2 * MAX_CAPACITY_NUMBER_OF_BUSES_IN_THE_ONE_STATION, false);
    private String backPlateNumber;

    public Bus(int occupyingTime, BusStation busStation, String backPlateNumber) {
        this.occupyingTime = occupyingTime;
        this.busStation = busStation;
        this.backPlateNumber = backPlateNumber;
        thread = new Thread(this);
        thread.start();
    }

    @Override
    public void run() {
        try {
            for (int i = 0; i < 2; i++) {
                SEMAPHORE.acquire();
                busStation.takePlace(occupyingTime, backPlateNumber);
                SEMAPHORE.release();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
