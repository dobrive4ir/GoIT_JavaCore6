package module5.api;

import module5.dao.DAOImpl;
import module5.database.TripAdvisorDatabase;

public class TripAdvisorAPI extends AbstractAPI {

    {
        dao = new DAOImpl(new TripAdvisorDatabase());
    }

}