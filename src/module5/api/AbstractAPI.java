package module5.api;

import module5.dao.DAOImpl;
import module5.domain.Room;

import java.util.ArrayList;
import java.util.List;

public abstract class AbstractAPI implements API {

    protected DAOImpl dao;

    @Override
    public Room[] findRooms(int price, int persons, String city) {
        List<Room> foundRooms = new ArrayList<>();
        Room searchingRoom = new Room(price, persons, city);
        Room[] rooms = dao.getAll();

        for (Room iteratedRoom : rooms) {
            if (iteratedRoom.equals(searchingRoom)) {
                foundRooms.add(iteratedRoom);
            }
        }
        return foundRooms.toArray(new Room[foundRooms.size()]);
    }

    @Override
    public DAOImpl getDAO() {
        return this.dao;
    }

}