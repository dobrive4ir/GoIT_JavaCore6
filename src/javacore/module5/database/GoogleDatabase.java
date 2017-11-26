package javacore.module5.database;

import javacore.module5.domain.Room;

import java.util.GregorianCalendar;

public class GoogleDatabase extends Database {

    {
        rooms.add(new Room(3001, 70, 4, new GregorianCalendar(2017, 3, 16).getTime(),
                "Hotel Ukraina", "Kyiv"));
        rooms.add(new Room(3002, 65, 4, new GregorianCalendar(2017, 3, 15).getTime(),
                "Hotel Bratyslava", "Kyiv"));
        rooms.add(new Room(3003, 55, 2, new GregorianCalendar(2017, 3, 16).getTime(),
                "Taurus", "Lviv"));
        rooms.add(new Room(3004, 54, 3, new GregorianCalendar(2017, 3, 15).getTime(),
                "Hotel Arcadia", "Odesa"));
        rooms.add(new Room(3005, 52, 3, new GregorianCalendar(2017, 3, 14).getTime(),
                "Hermes Hotel", "Odesa"));
    }

}