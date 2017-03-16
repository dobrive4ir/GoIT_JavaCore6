package module5.database;

import module5.domain.Room;

import java.util.GregorianCalendar;

public class TripAdvisorDatabase extends Database {

    {
        rooms.add(new Room(2001, 50, 1, new GregorianCalendar(2017, 3, 16).getTime(),
                "Hotel Khreschatyk", "Kyiv"));
        rooms.add(new Room(2002, 60, 2, new GregorianCalendar(2017, 3, 15).getTime(),
                "Premier Palats", "Kyiv"));
        rooms.add(new Room(2003, 52, 2, new GregorianCalendar(2017, 3, 13).getTime(),
                "George Hotel", "Lviv"));
        rooms.add(new Room(2004, 54, 3, new GregorianCalendar(2017, 3, 15).getTime(),
                "Hotel Arcadia", "Odesa"));
        rooms.add(new Room(2005, 52, 3, new GregorianCalendar(2017, 3, 14).getTime(),
                "Hermes Hotel", "Odesa"));
    }

}