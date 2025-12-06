package homework9;

import java.util.List;

public class User {
    private String name;
    private int age;
    private List<BorrowRecord> borrowHistory;

    User(String name, int age, List<BorrowRecord> borrowHistory) {
        this.name = name;
        this.age = age;
        this.borrowHistory = borrowHistory;
    }

    //    Getters
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public List<BorrowRecord> getBorrowHistory() {
        return borrowHistory;
    }

    //    Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setBorrowHistory(List<BorrowRecord> borrowHistory) {
        this.borrowHistory = borrowHistory;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}