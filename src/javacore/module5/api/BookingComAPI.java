package javacore.module5.api;

import javacore.module5.dao.DAOImpl;
import javacore.module5.database.BookingComDatabase;

public class BookingComAPI extends AbstractAPI {

    {
        dao = new DAOImpl(new BookingComDatabase());
    }

}