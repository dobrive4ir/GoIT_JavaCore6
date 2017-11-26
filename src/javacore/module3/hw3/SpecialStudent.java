package javacore.module3.hw3;

/**
 * Created by Dobryvechir on 16.02.2017.
 * Class SpecialStudent унаследован от CollegeStudent.
 * Дополнительные поля long secretKey, String email.
 * Создайте 3 конструктора: 2 таких же, как и в CollegeStudent и один с аргументом secretKey.
 * Создайте get-, set-методы для всех полей и сделайте их private согласно принципам ООП.
 */

public class SpecialStudent extends CollegeStudent {

    private long secretKey;
    private String email;

    public SpecialStudent(String firstName, String lastName, int group) {
        super(firstName, lastName, group);
    }

    public SpecialStudent(String lastName, Course[] coursesTaken) {
        super(lastName, coursesTaken);
    }

    public SpecialStudent(long secretKey) {
        this.secretKey = secretKey;
    }

    public long getSecretKey() {
        return secretKey;
    }

    public void setSecretKey(long secretKey) {
        this.secretKey = secretKey;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

}
