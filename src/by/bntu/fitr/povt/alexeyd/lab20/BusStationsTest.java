package by.bntu.fitr.povt.alexeyd.lab20;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class BusStationsTest {
    private static final int MAX_NUMBER_OF_BUSES = 4;
    private static final int MAX_NUMBER_OF_BUS_STATIONS = 2;

    public static void main(String[] args) {

        List<ExecutorService> executorServicelist = new ArrayList<>();
        for (int i = 0; i < MAX_NUMBER_OF_BUS_STATIONS; i++) {
            ExecutorService executor = Executors.newCachedThreadPool();
            executorServicelist.add(executor);
        }

        for (int i = 0; i < executorServicelist.size(); i++) {
            BusStation busStation = new BusStation(Integer.toString(i + 1));
            final int finalI = i;
            executorServicelist.get(i).execute(() -> {
                for (int j = 0; j < MAX_NUMBER_OF_BUSES; j++) {
                    int occupyingTime = Utils.generateRandomOccupyingTimeOfParking();
                    String backPlateNumber = Utils.generateCarBackplateNumber();
                    new Bus(occupyingTime, busStation, backPlateNumber, executorServicelist.get(finalI));
                }
            });
        }

    }
}
