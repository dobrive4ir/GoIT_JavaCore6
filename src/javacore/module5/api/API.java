package javacore.module5.api;

import javacore.module5.dao.DAOImpl;
import javacore.module5.domain.Room;

public interface API {

    Room[] findRooms(int price, int persons, String city);

    DAOImpl getDAO();

}