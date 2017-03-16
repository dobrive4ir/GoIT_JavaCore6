package module5.api;

import module5.dao.DAOImpl;
import module5.domain.Room;

public interface API {

    Room[] findRooms(int price, int persons, String city);

    DAOImpl getDAO();

}