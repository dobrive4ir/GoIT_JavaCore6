package javacore.module5.api;

import javacore.module5.dao.DAOImpl;
import javacore.module5.database.GoogleDatabase;

public class GoogleAPI extends AbstractAPI {

    {
        dao = new DAOImpl(new GoogleDatabase());
    }

}