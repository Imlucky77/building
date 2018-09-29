package com.example.demo.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.*;

@Entity

// for handle 'id' in method 'get' into buildingController class
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Building {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String buildingName;

    @ElementCollection
    private Set<Address> addresses = new HashSet<>();

    @OneToMany
    private List<Managers> managers = new ArrayList<>();

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "building")
    private List<BankAccountBuilding> bankAccountBuildings = new ArrayList<>();

    private double cashAmount;

    @OneToMany
    private List<Flat> flats = new ArrayList<>();

    public Building() {
    }

    public Building(String buildingName, Set<Address> addresses,
                    List<Managers> managers, List<BankAccountBuilding> bankAccountBuildings,
                    double cashAmount, List<Flat> flats) {
        this.buildingName = buildingName;
        this.addresses = addresses;
        this.managers = managers;
        this.bankAccountBuildings = bankAccountBuildings;
        this.cashAmount = cashAmount;
        this.flats = flats;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getBuildingName() {
        return buildingName;
    }

    public void setBuildingName(String buildingName) {
        this.buildingName = buildingName;
    }

    public Set<Address> getAddresses() {
        return addresses;
    }

    public void setAddresses(Set<Address> addresses) {
        this.addresses = addresses;
    }

    public double getCashAmount() {
        return cashAmount;
    }

    public void setCashAmount(double cashAmount) {
        this.cashAmount = cashAmount;
    }

    public List<BankAccountBuilding> getBankAccountBuildings() {
        return bankAccountBuildings;
    }

    public void setBankAccountBuildings(List<BankAccountBuilding> bankAccountBuildings) {
        this.bankAccountBuildings = bankAccountBuildings;
    }

    public List<Managers> getManagers() {
        return managers;
    }

    public void setManagers(List<Managers> managers) {
        this.managers = managers;
    }

    public List<Flat> getFlats() {
        return flats;
    }

    public void setFlats(List<Flat> flats) {
        this.flats = flats;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Building building = (Building) o;
        return id == building.id &&
                Double.compare(building.cashAmount, cashAmount) == 0 &&
                Objects.equals(buildingName, building.buildingName) &&
                Objects.equals(addresses, building.addresses) &&
                Objects.equals(managers, building.managers) &&
                Objects.equals(bankAccountBuildings, building.bankAccountBuildings) &&
                Objects.equals(flats, building.flats);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, buildingName, addresses, managers, bankAccountBuildings, cashAmount, flats);
    }
}


