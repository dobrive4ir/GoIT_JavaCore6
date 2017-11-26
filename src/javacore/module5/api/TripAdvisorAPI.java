package javacore.module5.api;

import javacore.module5.dao.DAOImpl;
import javacore.module5.database.TripAdvisorDatabase;

public class TripAdvisorAPI extends AbstractAPI {

    {
        dao = new DAOImpl(new TripAdvisorDatabase());
    }

}