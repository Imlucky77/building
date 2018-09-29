package com.example.demo.model;

import javax.persistence.Embeddable;
import java.util.Objects;

@Embeddable
public class Address {

    private String province;
    private String city;
    private String zone;
    private String postAddress;
    private long zipCode;

    public Address() {
    }

    public Address(String province, String city, String zone, String postAddress, long zipCode) {
        this.province = province;
        this.city = city;
        this.zone = zone;
        this.postAddress = postAddress;
        this.zipCode = zipCode;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getZone() {
        return zone;
    }

    public void setZone(String zone) {
        this.zone = zone;
    }

    public String getPostAddress() {
        return postAddress;
    }

    public void setPostAddress(String postAddress) {
        this.postAddress = postAddress;
    }

    public long getZipCode() {
        return zipCode;
    }

    public void setZipCode(long zipCode) {
        this.zipCode = zipCode;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Address address = (Address) o;
        return zipCode == address.zipCode &&
                Objects.equals(province, address.province) &&
                Objects.equals(city, address.city) &&
                Objects.equals(zone, address.zone) &&
                Objects.equals(postAddress, address.postAddress);
    }

    @Override
    public int hashCode() {
        return Objects.hash(province, city, zone, postAddress, zipCode);
    }
}
