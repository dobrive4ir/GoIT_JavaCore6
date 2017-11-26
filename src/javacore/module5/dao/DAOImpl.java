package javacore.module5.dao;

import javacore.module5.database.Database;
import javacore.module5.domain.Room;

import java.util.List;

public class DAOImpl implements DAO {

    private Database dataBase;

    public DAOImpl(Database dataBase) {
        this.dataBase = dataBase;
    }

    public Database getDataBase() {
        return dataBase;
    }

    @Override
    public Room save(Room room) {
        if (findById(room.getId()) == null) {
            dataBase.getRooms().add(room);
            return room;
        }
        return null;
    }

    @Override
    public boolean delete(Room room) {
        return (findById(room.getId()) != null) && (dataBase.getRooms().remove(room));
    }

    @Override
    public Room update(Room room) {
        for (int i = 0; i < dataBase.getRooms().size(); i++) {
            Room iteratedRoom = dataBase.getRooms().get(i);
            if (iteratedRoom.getId() == room.getId()) {
                dataBase.getRooms().set(i, room);
                return iteratedRoom;
            }
        }
        return null;
    }

    @Override
    public Room findById(long id) {
        for (int i = 0; i < dataBase.getRooms().size(); i++) {
            Room iteratedRoom = dataBase.getRooms().get(i);
            if (iteratedRoom.getId() == id) {
                return iteratedRoom;
            }
        }
        return null;
    }

    @Override
    public Room[] getAll() {
        List<Room> rooms = dataBase.getRooms();
        return rooms.toArray(new Room[rooms.size()]);
    }

}