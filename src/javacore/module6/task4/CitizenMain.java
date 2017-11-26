package javacore.module6.task4;

public class CitizenMain {

    public static void main(String[] args) {

        Citizen eng = CitizenFactory.getCitizen(Nations.ENGLISHMAN);
        Citizen chi = CitizenFactory.getCitizen(Nations.CHINESE);
        Citizen rus = CitizenFactory.getCitizen(Nations.RUSSIAN);
        Citizen it = CitizenFactory.getCitizen(Nations.ITALIAN);

        eng.sayHello();
        chi.sayHello();
        rus.sayHello();
        it.sayHello();
    }
}