package com.example.demo.model;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Test {


    public static void main(String[] args) {

        Set<Address> addresses = new HashSet<>();
        addresses.add(new Address("tehran", "tehran", "pastor", "street 12 farvardin", 6461156969l));

        List<Managers> managers = new ArrayList<>();
        managers.add(new Managers(9365929638l, new Building()));


        List<Flat> flats = new ArrayList<>();
        flats.add(new Flat(new FlatOwnerInfo(), new Tenant(), "north", 2562, 1200, 5, 50000, new Building()));

        List<BankAccountBuilding> bankAccountBuildings = new ArrayList<>();
        bankAccountBuildings.add(new BankAccountBuilding("melat", 6104l, 3757l, new Building()));


        Building building = new Building("negar town", addresses, managers, bankAccountBuildings, 5623, flats);
    }
}
