package module5;

import module5.api.API;
import module5.api.BookingComAPI;
import module5.api.GoogleAPI;
import module5.api.TripAdvisorAPI;
import module5.domain.Room;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Controller {

    private Model model;
    private API[] apis = new API[3];

    {
        apis[0] = new BookingComAPI();
        apis[1] = new TripAdvisorAPI();
        apis[2] = new GoogleAPI();
    }

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
            case BookingCom:
                return apis[0];
            case TripAdvisor:
                return apis[1];
            case Google:
                return apis[2];
        }
        throw new IllegalArgumentException();
    }

}

