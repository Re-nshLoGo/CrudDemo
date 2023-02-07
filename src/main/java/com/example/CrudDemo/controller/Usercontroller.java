package com.example.CrudDemo.controller;

import com.example.CrudDemo.model.User;
import com.example.CrudDemo.service.Userservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/ums")
public class Usercontroller {

    @Autowired
    private Userservice userservice;

    @PostMapping("/addUser")
    public void addUser(@RequestBody User user){
        userservice.add(user);
    }
    @GetMapping("/getUser/{userid}")
    public User getUserbyid(@PathVariable int userid) {
        return userservice.findbyid(userid);

    }
    @GetMapping("/getAllUser")
    public List<User> getAll() {
        return userservice.findAll();

    }
    @PutMapping("/updateUserInfo/id/{id}")
    public void updateUser(@PathVariable int id , @RequestBody User user){
        userservice.updateuser(id,user);

    }
    @DeleteMapping("deleteUser/id/{id}")
    public void deletebyId(@PathVariable int id){
        userservice.delete(id);
    }


}
