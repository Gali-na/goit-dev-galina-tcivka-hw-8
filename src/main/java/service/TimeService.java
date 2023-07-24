package service;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Set;

public class TimeService {

    public static String getTimeDateTimeZoneByZoneId(String zoneId) {
        ZoneId zone = ZoneId.of(zoneId);
        ZonedDateTime time = ZonedDateTime.now(zone);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss  'UTC'xxx");
        String formattedDateTime = time.format(formatter);
        return formattedDateTime;
    }

    public static String getTimeDateByUTC() {
        ZoneId zone = ZoneId.of("GMT0");
        ZonedDateTime time = ZonedDateTime.now(zone);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss  'UTC'xxx");
        String formattedDateTime = time.format(formatter);
        return formattedDateTime;
    }

    public static boolean checkTimeZoneValidity(String nameZone) {
        Set<String> availableZoneIds = ZoneId.getAvailableZoneIds();
        for (String s : availableZoneIds) {
            System.out.println(s);
        }
        return availableZoneIds.contains(nameZone);
    }
}
