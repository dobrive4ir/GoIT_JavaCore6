package module5.dao;

import module5.domain.Room;

public interface DAO {

    Room save(Room room);

    boolean delete(Room room);

    Room update(Room room);

    Room findById(long id);

    Room[] getAll();

}