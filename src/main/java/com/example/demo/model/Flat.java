package com.example.demo.model;

import javax.persistence.*;

@Entity
public class Flat {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @OneToOne
    private FlatOwnerInfo ownerName;

    @OneToOne
    private Tenant tenantName;
    private String flatLocation;
    private double cashAmount;
    private double metraj;
    private long personAmount;
    private double monthChargeAmount;

    @ManyToOne
    private Building building;

    public Flat() {
    }

    public Flat(FlatOwnerInfo ownerName, Tenant tenantName, String flatLocation, double cashAmount, double metraj, long personAmount, double monthChargeAmount, Building building) {
        this.ownerName = ownerName;
        this.tenantName = tenantName;
        this.flatLocation = flatLocation;
        this.cashAmount = cashAmount;
        this.metraj = metraj;
        this.personAmount = personAmount;
        this.monthChargeAmount = monthChargeAmount;
        this.building = building;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public FlatOwnerInfo getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(FlatOwnerInfo ownerName) {
        this.ownerName = ownerName;
    }

    public Tenant getTenantName() {
        return tenantName;
    }

    public void setTenantName(Tenant tenantName) {
        this.tenantName = tenantName;
    }

    public String getFlatLocation() {
        return flatLocation;
    }

    public void setFlatLocation(String flatLocation) {
        this.flatLocation = flatLocation;
    }

    public double getCashAmount() {
        return cashAmount;
    }

    public void setCashAmount(double cashAmount) {
        this.cashAmount = cashAmount;
    }

    public double getMetraj() {
        return metraj;
    }

    public void setMetraj(double metraj) {
        this.metraj = metraj;
    }

    public long getPersonAmount() {
        return personAmount;
    }

    public void setPersonAmount(long personAmount) {
        this.personAmount = personAmount;
    }

    public double getMonthChargeAmount() {
        return monthChargeAmount;
    }

    public void setMonthChargeAmount(double monthChargeAmount) {
        this.monthChargeAmount = monthChargeAmount;
    }

    public Building getBuilding() {
        return building;
    }

    public void setBuilding(Building building) {
        this.building = building;
    }
}
