package javacore.module6.task4;

public final class CitizenFactory {

    private static CitizenFactory citizenFactory;

    private CitizenFactory() {
    }

    private static CitizenFactory getInstance() {
        if (citizenFactory == null) {
            citizenFactory = new CitizenFactory();
        }
        return citizenFactory;
    }

    public static Citizen getCitizen(Nations nation) {

        switch (nation) {
            case ENGLISHMAN:
                return getInstance().new Englishman();
            case CHINESE:
                return getInstance().new Chinese();
            case RUSSIAN:
                return getInstance().new Russian();
            case ITALIAN:
                return getInstance().new Italian();
        }
        return null;
    }

    private class Englishman implements Citizen {
        @Override
        public void sayHello() {
            System.out.println("Hello!");
        }
    }

    private class Chinese implements Citizen {
        @Override
        public void sayHello() {
            System.out.println("Ni Hao!");
        }
    }

    private class Russian implements Citizen {
        @Override
        public void sayHello() {
            System.out.println("Privet!");
        }
    }

    private class Italian implements Citizen {
        @Override
        public void sayHello() {
            System.out.println("Salve!");
        }
    }

}