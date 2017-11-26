package javacore.module5;

import javacore.module5.api.API;
import javacore.module5.api.BookingComAPI;
import javacore.module5.api.GoogleAPI;
import javacore.module5.api.TripAdvisorAPI;
import javacore.module5.domain.Room;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Controller {

    private Model model;
    private API[] apis = {new BookingComAPI(), new TripAdvisorAPI(), new GoogleAPI()};

    public Controller(Model model) {
        this.model = model;
    }

    public Room[] requestRooms(int price, int persons, String city) {
        List<Room> modelDatabase = model.getDatabase().getRooms();
        modelDatabase.clear();
        for (API iteratedAPI : apis) {
            Room[] roomsFromIteratedAPI = iteratedAPI.findRooms(price, persons, city);
            if (roomsFromIteratedAPI.length != 0) {
                modelDatabase.addAll(Arrays.asList(roomsFromIteratedAPI));
            }
        }

        return modelDatabase.toArray(new Room[modelDatabase.size()]);
    }

    public Room[] check(APIType apiType1, APIType apiType2){
         List<Room> roomsFromAPI1 = new ArrayList<>();
         List<Room> roomsFromAPI2 = new ArrayList<>();
         roomsFromAPI1.addAll(getAPIByType(apiType1).getDAO().getDataBase().getRooms());
         roomsFromAPI2.addAll(getAPIByType(apiType2).getDAO().getDataBase().getRooms());
        roomsFromAPI1.retainAll(roomsFromAPI2);
        return roomsFromAPI1.toArray(new Room[roomsFromAPI1.size()]);
    }

    public Room save(Room room, APIType apiType) {
        API api = getAPIByType(apiType);
        api.getDAO().save(room);
        return room;
    }

    public boolean delete(Room room, APIType apiType) {
        API api = getAPIByType(apiType);
        return api.getDAO().delete(room);
    }

    public Room update(Room room, APIType apiType) {
        API api = getAPIByType(apiType);
        return api.getDAO().update(room);
    }

    public Room findById(long id, APIType apiType) {
        API api = getAPIByType(apiType);
        return api.getDAO().findById(id);
    }

    public API getAPIByType(APIType apiType) {
        switch (apiType) {
            case BOOKING_COM:
                return apis[0];
            case TRIP_ADVISOR:
                return apis[1];
            case GOOGLE:
                return apis[2];
        }
        throw new IllegalArgumentException();
    }

}

