package com.example.hotel2.services;

import com.example.hotel2.entities.Department;
import com.example.hotel2.entities.Room;
import com.example.hotel2.repositories.RoomRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class RoomService {
    @Autowired
    private RoomRepo repo;

   public List<Room> viewAll(){return repo.findAll();}
    public Room create(Room room){
        return repo.save(room);
    }


}
