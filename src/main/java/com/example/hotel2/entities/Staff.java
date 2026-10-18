package com.example.hotel2.entities;

public class Staff {

    private int id;
    private int phonenum;
    private String address;
    private String fname;
    private String lname;
    private String department;

    public Staff(int id, int phonenum, String address, String fname, String lname, String department) {
        this.id = id;
        this.phonenum = phonenum;
        this.address = address;
        this.fname = fname;
        this.lname = lname;
        this.department = department;
    }

    public Staff() {
    }



    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPhonenum() {
        return phonenum;
    }

    public void setPhonenum(int phonenum) {
        this.phonenum = phonenum;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
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

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return "Staff{" +
                "id=" + id +
                ", phonenum=" + phonenum +
                ", address='" + address + '\'' +
                ", fname='" + fname + '\'' +
                ", lname='" + lname + '\'' +
                ", department='" + department + '\'' +
                '}';
    }
}
