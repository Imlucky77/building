package com.example.demo.model;

import javax.persistence.*;

@Entity
public class BankAccountBuilding {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String bankName;
    private long creditCard;
    private long accountNumber;

    @ManyToOne
    private Building building;

    public BankAccountBuilding() {
    }

    public BankAccountBuilding(String bankName, long creditCard, long accountNumber, Building building) {
        this.bankName = bankName;
        this.creditCard = creditCard;
        this.accountNumber = accountNumber;
        this.building = building;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public long getCreditCard() {
        return creditCard;
    }

    public void setCreditCard(long creditCard) {
        this.creditCard = creditCard;
    }

    public long getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(long accountNumber) {
        this.accountNumber = accountNumber;
    }

    public Building getBuilding() {
        return building;
    }

    public void setBuilding(Building building) {
        this.building = building;
    }
}
