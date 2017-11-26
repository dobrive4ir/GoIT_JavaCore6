package javacore.module5;

import javacore.module5.database.Database;

public class Model {

    private Database database = new Database();

    public Database getDatabase() {
        return database;
    }

}