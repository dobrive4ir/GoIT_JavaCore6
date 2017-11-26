package javacore.module3.hw3;

/**
 * Created by  Dobryvechir on 16.02.2017.
 * Класс Student с полями:
 * String firstName,
 * String lastName,
 * int group,
 * Course[] coursesTaken,
 * int age.
 * С 2 конструкторами с аргументами
 * firstName, lastName, group;
 * lastName, coursesTaken.
 * Создайте get-, set-методы для всех полей и сделайте их private согласно принципам ООП.
 */

public class Student {

    private String firstName;
    private String lastName;
    private int group;
    private Course[] coursesTaken;
    private int age;

    public Student(String firstName, String lastName, int group) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.group = group;
    }

    public Student(String lastName, Course[] coursesTaken) {
        this.lastName = lastName;
        this.coursesTaken = coursesTaken;
    }

    public Student() {
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getGroup() {
        return group;
    }

    public void setGroup(int group) {
        this.group = group;
    }

    public Course[] getCoursesTaken() {
        return coursesTaken;
    }

    public void setCoursesTaken(Course[] coursesTaken) {
        this.coursesTaken = coursesTaken;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

}
