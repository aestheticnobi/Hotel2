package com.example.hotel2.controllers;

import com.example.hotel2.entities.Room;
import com.example.hotel2.services.RoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/room")
public class RoomController {

    @Autowired
    private RoomService service;

    @GetMapping("/add_room")
    public String addRoom(Model model){
    model.addAttribute("room" ,new Room());
    return "room_reg";
}

 @PostMapping("/return")
    public String saveRoom(Room room , Model model){
    service.create(room);
    return "redirect:/room/view";
 }

  @GetMapping("/view")
    public String viewRoom(Model model){
    model.addAttribute("room",service.viewAll());
    return "roomView";
  }
}
