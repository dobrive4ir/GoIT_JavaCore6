package module5.api;

import module5.dao.DAOImpl;
import module5.database.GoogleDatabase;

public class GoogleAPI extends AbstractAPI {

    {
        dao = new DAOImpl(new GoogleDatabase());
    }

}