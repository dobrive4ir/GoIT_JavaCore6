package javacore.module8;

public class IManageSystemTest {

    public static void main(String[] args) {

        Food beer1 = new Food("Chernigivske", Country.UKRAINE, 90);
        Food beer2 = new Food("Baltika", Country.RUSSIA, 150);
        Food beer3 = new Food("Taler", Country.BELARUS, 70);
        Food beer4 = new Food("Becks", Country.GERMANY, 75);
        Food beer5 = new Food("Cronenbourg", Country.FRANCE, 80);
        Food beer1Changed = new Food(beer1.getId(),beer1.getName() + " light", beer1.getCountry(),
                beer1.getExpiration()-5);

        IManageSystemImpl manageSystem = new IManageSystemImpl();
        manageSystem.save(beer1, 16.0);
        manageSystem.save(beer2, 18.0);
        manageSystem.save(beer3, 20.0);
        manageSystem.save(beer4,30.0);
        manageSystem.save(beer5, 25.0);
        System.out.println("BEER CATALOG: ");
        System.out.println(manageSystem.getDatabase());
        System.out.println("\nBREWERY HAS CHANGED " + beer1.getName() + " IN CATALOG ");
        manageSystem.save(beer1Changed);
        System.out.println("NOW IT HAS NEXT CHARACTERISTICS" + beer1);
        System.out.println("\nGETTING BEER FROM CATALOG BY ID = 3 : " + manageSystem.get(3));
        System.out.println("\nGETTING PRICE OF " + beer4.getName() + ": \n" + manageSystem.getPrice(beer4));
        System.out.println("\nONLY BEER CHARACTERISTICS:\n" + manageSystem.getProducts());
        System.out.println("\nPRICES OF BEER:");
        for (Double currentPrice : manageSystem.getPrices()) {
            System.out.println(currentPrice);
        }
        System.out.println("\n" + beer3.getName() + " WILL BE DELETED FROM CATALOG");
        manageSystem.delete(beer3);
        System.out.println("\nBEER WITH ID = 5 WILL BE DELETED FROM CATALOG");
        manageSystem.deleteById(5);
        System.out.println("\nNOW OUR CATALOG HAS NEXT BEER BRAND: \n" + manageSystem.getDatabase());

    }

}