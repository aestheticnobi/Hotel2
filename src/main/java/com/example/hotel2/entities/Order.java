package com.example.hotel2.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity

public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;;
    private String fname;
    private String lname;
    private int phonenum;
    private String email;
    private String roomnum;


    public Order(int id, String fname, String lname, int phonenum, String email, String roomnum) {
        this.id = id;
        this.fname = fname;
        this.lname = lname;
        this.phonenum = phonenum;
        this.email = email;
        this.roomnum = roomnum;
    }

    public Order() {
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

    public int getPhonenum() {
        return phonenum;
    }

    public void setPhonenum(int phonenum) {
        this.phonenum = phonenum;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = this.email;
    }

    public String getRoomnum() {
        return roomnum;
    }

    public void setRoomnum(String roomnum) {
        this.roomnum = roomnum;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", fname='" + fname + '\'' +
                ", lname='" + lname + '\'' +
                ", phonenum=" + phonenum +
                ", email='" + email + '\'' +
                ", roomnum='" + roomnum + '\'' +
                '}';
    }
}
