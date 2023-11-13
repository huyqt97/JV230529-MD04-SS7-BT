package com.ra.model;

public class Employee {
    private String eplId;
    private String fullName;
    private int age;
    private double salary;

    public Employee() {
    }

    public Employee(String eplId, String fullName, int age, double salary) {
        this.eplId = eplId;
        this.fullName = fullName;
        this.age = age;
        this.salary = salary;
    }

    public String getEplId() {
        return eplId;
    }

    public void setEplId(String eplId) {
        this.eplId = eplId;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }


}
