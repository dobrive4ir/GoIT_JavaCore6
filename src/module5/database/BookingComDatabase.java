package module5.database;

import module5.domain.Room;

import java.util.GregorianCalendar;

public class BookingComDatabase extends Database {

    {
        rooms.add(new Room(1001, 50, 1, new GregorianCalendar(2017, 3, 16).getTime(),
                "Hotel Khreschatyk", "Kyiv"));
        rooms.add(new Room(1002, 60, 2, new GregorianCalendar(2017, 3, 15).getTime(),
                "Premier Palats", "Kyiv"));
        rooms.add(new Room(1003, 55, 2, new GregorianCalendar(2017, 3, 16).getTime(),
                "Taurus", "Lviv"));
        rooms.add(new Room(1004, 40, 1, new GregorianCalendar(2017, 3, 14).getTime(),
                "Gagarinn", "Odesa"));
        rooms.add(new Room(1005, 45, 1, new GregorianCalendar(2017, 3, 14).getTime(),
                "Odeskiy Dvorik", "Odesa"));
    }

}