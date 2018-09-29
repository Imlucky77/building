package com.example.demo.model;

import javax.persistence.*;

@Entity
public class Managers {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private long mobileNumber;

    @ManyToOne
    private Building building;

    public Managers() {
    }

    public Managers(long mobileNumber, Building building) {
        this.mobileNumber = mobileNumber;
        this.building = building;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(long mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public Building getBuilding() {
        return building;
    }

    public void setBuilding(Building building) {
        this.building = building;
    }
}
