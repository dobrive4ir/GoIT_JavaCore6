package javacore.module3.hw3;

import java.util.Date;

/**
 * Created by Dobryvechir on 16.02.2017.
 * Создайте get-, set-методы для всех полей и сделайте их private согласно принципам ООП.
 * Создайте 5 объектов класса Course.
 * Создайте объекты других классов, используя все конструкторы.
 * У вас должно быть 13 объектов в классе Solution.
 */

public class Solution {

    public static void main(String[] args) {
        Course course1 = new Course(new Date(), "GoJava");
        Course course2 = new Course(new Date(), "GoFrontend");
        Course course3 = new Course("GoJava", 500, "Andrew");
        Course course4 = new Course("GoFrontend", 250, "Alex");
        Course course5 = new Course("GoAndroid", 500, "Sam");

        Course[] courses1 = {course3, course4, course5};
        Course[] courses2 = {course1, course2, course5};
        Course[] courses3 = {course1, course5};

        Student student1 = new Student("Vitalii", "Dobryvechir", 6);
        Student student2 = new Student("Botanikov", courses1);

        CollegeStudent student3 = new CollegeStudent("Vasilyev", courses2);
        CollegeStudent student4 = new CollegeStudent("Oleg", "Chovpan", 4);
        CollegeStudent Student5 = new CollegeStudent("NTU college", 85, 2167768);

        SpecialStudent student6 = new SpecialStudent("Selin", courses3);
        SpecialStudent student7 = new SpecialStudent("Evgeny", "Tishenko", 3);
        SpecialStudent student8 = new SpecialStudent(1126398);
    }

}
