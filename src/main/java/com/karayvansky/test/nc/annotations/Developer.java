package com.karayvansky.test.nc.annotations;

import javax.persistence.*;

@Entity
@Table(name = "DEVELOPERS")
public class Developer {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private int id;
    @Column(name = "FIRST_NAME")
    private String firstName;
    @Column(name = "LAST_NAME")
    private String lastName;

    public Developer() {
    }

    public Developer(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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


    @Override
    public String toString() {
        return "Developer:\n" +
                "id: " + id +
                "\nFirst Name: " + firstName + "\n" +
                "Last Name: " + lastName + "\n";
    }
}
