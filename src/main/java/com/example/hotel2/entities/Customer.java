package com.example.hotel2.entities;

public class Customer {
    private int id;
    private String fname;
    private String lname;
    private String address;
    private int phonenum;

    public Customer(int id, String fname, String lname, String address, int phonenum) {
        this.id = id;
        this.fname = fname;
        this.lname = lname;
        this.address = address;
        this.phonenum = phonenum;
    }

    public Customer() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getPhonenum() {
        return phonenum;
    }

    public void setPhonenum(int phonenum) {
        this.phonenum = phonenum;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", fname='" + fname + '\'' +
                ", lname='" + lname + '\'' +
                ", address='" + address + '\'' +
                ", phonenum=" + phonenum +
                '}';
    }
}
