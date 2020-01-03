package by.bntu.fitr.povt.alexeyd.lab20.concurency;

import java.util.ArrayList;
import java.util.List;

public class BusStationsTest {
    private static final int MAX_NUMBER_OF_BUSES = 8;
    private static final int MAX_NUMBER_OF_BUS_STATIONS = 2;

    public static void main(String[] args) {

        List<BusStation> busStationlist = new ArrayList<>();

        for (int i = 0; i < MAX_NUMBER_OF_BUS_STATIONS; i++) {
            BusStation busStation = new BusStation(Integer.toString(i + 1));

            for (int j = 0; j < MAX_NUMBER_OF_BUS_STATIONS * MAX_NUMBER_OF_BUSES; j++) {
                int occupyingTime = Utils.generateRandomOccupyingTimeOfParking();
                String backPlateNumber = Utils.generateCarBackplateNumber();
                new Bus(occupyingTime, busStation, backPlateNumber);
            }
        }




    }
}
