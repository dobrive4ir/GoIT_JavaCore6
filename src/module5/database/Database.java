package module5.database;

import module5.domain.Room;

import java.util.ArrayList;
import java.util.List;

public class Database {

    protected List<Room> rooms = new ArrayList<>();

    public List<Room> getRooms() {
        return rooms;
    }

}