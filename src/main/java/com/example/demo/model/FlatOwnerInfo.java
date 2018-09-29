package com.example.demo.model;

import javax.persistence.*;

@Entity
public class FlatOwnerInfo {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String firstName;
    private String lastName;
    private long phone;

    @OneToOne
    private Flat flat;

    public FlatOwnerInfo() {
    }

    public FlatOwnerInfo(String firstName, String lastName, long phone, Flat flat) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.phone = phone;
        this.flat = flat;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
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

    public long getPhone() {
        return phone;
    }

    public void setPhone(long phone) {
        this.phone = phone;
    }

    public Flat getFlat() {
        return flat;
    }

    public void setFlat(Flat flat) {
        this.flat = flat;
    }
}
