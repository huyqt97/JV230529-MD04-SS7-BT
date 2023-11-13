package com.baitap.bai1;

public class Customer {
    private int id;
    private String fullName;
    private String address;
    private String birthDay;
    private String image;

    public Customer(int id, String fullName, String address, String birthDay, String image) {
        this.id = id;
        this.fullName = fullName;
        this.address = address;
        this.birthDay = birthDay;
        this.image = image;
    }

    public int getId() {
        return id;
    }
    public String getBirthDay() {
        return birthDay;
    }
    public void setId(int id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }


}
