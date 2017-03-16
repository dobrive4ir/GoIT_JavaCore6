package module5.api;

import module5.dao.DAOImpl;
import module5.database.BookingComDatabase;

public class BookingComAPI extends AbstractAPI {

    {
        dao = new DAOImpl(new BookingComDatabase());
    }

}