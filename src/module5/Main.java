package module5;

import module5.domain.Room;

import java.util.Arrays;
import java.util.GregorianCalendar;

public class Main {

    public static void main(String[] args) {
        Model model = new Model();
        Controller controller = new Controller(model);

        System.out.println("REQUEST TEST");
        System.out.println(Arrays.toString(controller.requestRooms(50, 1, "Kyiv")));
        System.out.println(Arrays.toString(controller.requestRooms(52, 2, "Lviv")));
        System.out.println(Arrays.toString(controller.requestRooms(54, 3, "Odesa")));

        System.out.println("\nCHECK METHOD TEST");
        System.out.println(Arrays.toString(controller.check(APIType.BookingCom, APIType.TripAdvisor)));

        System.out.println("\nCONTROLLER'S METHODS TEST");
        APIType serviceType = null;
        Room testRoom = new Room(1111, 30, 1, new GregorianCalendar(2017, 3, 18).getTime(),
                "Hotel Salyut", "Kyiv");
        Room updatedTestRoom = new Room(1111, 40, 2, new GregorianCalendar(2017, 3, 17).getTime(),
                "Hotel Salyut", "Kyiv");
        for (int i = 0; i < 3; i++) {
            switch (i) {
                case 0:
                    serviceType = APIType.BookingCom;
                    break;
                case 1:
                    serviceType = APIType.TripAdvisor;
                    break;
                case 2:
                    serviceType = APIType.Google;
                    break;
            }
            System.out.println(serviceType + " database before operations \n" + controller.getAPIByType(serviceType).getDAO()
                    .getDataBase().getRooms());
            controller.save(testRoom, serviceType);
            controller.update(updatedTestRoom, serviceType);
            System.out.println(serviceType + " database after operations \n" + controller.getAPIByType(serviceType).getDAO()
                    .getDataBase().getRooms() + "\n");
            controller.delete(updatedTestRoom, serviceType);
        }
    }

}