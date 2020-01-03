package by.bntu.fitr.povt.alexeyd.lab20;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Random;
import java.util.concurrent.TimeUnit;

public class BusStation {

    public static final String DOT = ". ";
    public static final String THE_STATION_NUMBER = "The bus station number ";
    public String busStationNumber;

    private static final int LIMIT = 1000;
    private static Random random = new Random();
    private static final String YYYY_MM_DD_HH_MM_SS = "yyyy-MM-dd HH:mm:ss";
    private static final String NEW_LINE_CHARACTER = "\n";
    private static final String CAR_CAME_TO_THE_PARKING_MSG = " - Bus with the back plate number = %s arrived to the station";
    private static final String CAR_IS_IN_THE_PARKING_MSG = " - Bus with the with back plate number = %s is in the station";
    private static final String CAR_LEFT_THE_PARKING_MSG = " - Bus with the with back plate number = %s left the station";

    public BusStation(String busStationNumber) {
        this.busStationNumber = busStationNumber;
    }

    public void takePlace(int occupyingTime, String backPlateNumber) {

        for (int i = 0; i < occupyingTime; i++) {
            String now = DateTimeFormatter.ofPattern(YYYY_MM_DD_HH_MM_SS).format(LocalDateTime.now());
            String line = THE_STATION_NUMBER + busStationNumber + DOT;
            line += now;
            try {
                TimeUnit.MILLISECONDS.sleep(random.nextInt(LIMIT));
                if (i == 0) {
                    line += CAR_CAME_TO_THE_PARKING_MSG;
                } else if (i < occupyingTime && (i != occupyingTime - 1) && i != 0) {
                    line += CAR_IS_IN_THE_PARKING_MSG;
                } else if (i == occupyingTime - 1) {
                    line += CAR_LEFT_THE_PARKING_MSG;
                }
                line += DOT;
                line += NEW_LINE_CHARACTER;
                System.out.printf(line, backPlateNumber);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
