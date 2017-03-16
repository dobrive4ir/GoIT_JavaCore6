package module5;

import module5.database.Database;

public class Model {

    private Database database = new Database();

    public Database getDatabase() {
        return database;
    }

}