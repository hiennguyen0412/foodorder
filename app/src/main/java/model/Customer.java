package model;

/**
 * Created by hiennv on 21/03/2018.
 */

public class Customer extends Person {
    private String email;

    public Customer(String email) {
        this.email = email;
    }

    public Customer(int id, String fullName, int age, String email) {
        super(id, fullName, age);
        this.email = email;
    }

    public Customer() {
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
