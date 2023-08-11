package Student;

import java.io.Serializable;

class StudentStream implements Serializable{
    private String name;
    private int age;
    private String major;

    public StudentStream(String name, int age, String major) {
        this.name = name;
        this.age = age;
        this.major = major;
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public String getMajor() {
        return this.major;
    }
}