package com.example.hotel2.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Room {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String type;
    private int roomNum;
    private boolean isAvailable = true;
    private int price;

    public Room(int id, String type, int roomNum, boolean isAvailable, int price) {
        this.id = id;
        this.type = type;
        this.roomNum = roomNum;
        this.isAvailable = isAvailable;
        this.price = price;
    }

    public Room() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getRoomNum() {
        return roomNum;
    }

    public void setRoomNum(int roomNum) {
        this.roomNum = roomNum;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Room{" +
                "id=" + id +
                ", type='" + type + '\'' +
                ", roomNum=" + roomNum +
                ", isAvailable=" + isAvailable +
                ", price=" + price +
                '}';
    }
}