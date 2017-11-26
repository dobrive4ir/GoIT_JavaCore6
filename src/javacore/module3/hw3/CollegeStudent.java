package javacore.module3.hw3;

/**
 * Created by Dobryvechir on 16.02.2017.
 * CollegeStudent унаследован от Student.
 * Дополнительные поля: String collegeName, int rating, long id.
 * Создайте 3 конструктора: 2 таких же, как и в Student and один с аргументами - всеми полями класса.
 * Создайте get-, set-методы для всех полей и сделайте их private согласно принципам ООП.
 */

public class CollegeStudent extends Student {

    private String collegeName;
    private int rating;
    private long id;

    public CollegeStudent(String firstName, String lastName, int group) {
        super(firstName, lastName, group);
    }

    public CollegeStudent(String lastName, Course[] coursesTaken) {
        super(lastName, coursesTaken);
    }

    public CollegeStudent(String collegeName, int rating, long id) {
        this.collegeName = collegeName;
        this.rating = rating;
        this.id = id;
    }

    public CollegeStudent() {
    }

    public String getCollegeName() {
        return collegeName;
    }

    public void setCollegeName(String collegeName) {
        this.collegeName = collegeName;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

}
