package by.bntu.fitr.povt.alexeyd.lab20;

import org.apache.log4j.Logger;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Semaphore;

import static by.bntu.fitr.povt.alexeyd.lab20.Lab20MainTask.MAX_CAPACITY_NUMBER_OF_BUSES_IN_THE_ONE_STATION;


public class Bus implements Runnable {

    private int occupyingTime;
    private BusStation busStation;//Объект синхронизации
    private Thread thread;
    private static final Semaphore SEMAPHORE = new Semaphore(MAX_CAPACITY_NUMBER_OF_BUSES_IN_THE_ONE_STATION, false);
    private String backPlateNumber;
    public static final String MY_SUPER_LOGGER = "MySuperLogger";
    private static final Logger LOG = Logger.getLogger(MY_SUPER_LOGGER);
    private final ExecutorService executor;

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
        } catch (InterruptedException exception) {
            exception.printStackTrace();
            LOG.error(exception);
        }
        busStation.takePlace(occupyingTime, backPlateNumber);
        SEMAPHORE.release();

    }
}
