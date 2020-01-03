package by.bntu.fitr.povt.alexeyd.lab20;

import by.bntu.fitr.povt.alexeyd.lab20.utils.BusStationUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * https://habr.com/ru/post/277669/
 * Number of laboratory work is №20. Java Threads. Synchronization. The Singleton Pattern.
 * This programme was created by Alexey Nikolaevich Druzik in 01.03.2020, v1.1. Number of group is 30701117.
 * MainTask №5. Bus stops. There are several stops on the route. On the one stop can stop on several buses at the same
 * time, but no more than a given number.
 */
public class Lab20MainTask {

    public static final int MAX_CAPACITY_NUMBER_OF_BUSES_IN_THE_ONE_STATION = 2;
    private static final int NUMBER_OF_BUSES = 4;

    public static void main(String[] args) {

        List<ExecutorService> executorServicelist = new ArrayList<>();
        for (int i = 0; i < MAX_CAPACITY_NUMBER_OF_BUSES_IN_THE_ONE_STATION; i++) {
            ExecutorService executor = Executors.newCachedThreadPool();
            executorServicelist.add(executor);
        }

        for (int i = 0; i < executorServicelist.size(); i++) {
            BusStation busStation = new BusStation(Integer.toString(i + 1));
            final int finalI = i;
            executorServicelist.get(i).execute(() -> {
                for (int j = 0; j < NUMBER_OF_BUSES; j++) {
                    int occupyingTime = BusStationUtils.generateRandomOccupyingTimeOfParking();
                    String backPlateNumber = BusStationUtils.generateCarBackplateNumber();
                    new Bus(occupyingTime, busStation, backPlateNumber, executorServicelist.get(finalI));
                }
            });
        }

    }
}
