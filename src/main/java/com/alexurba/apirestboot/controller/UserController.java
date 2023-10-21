package com.alexurba.apirestboot.controller;

import com.alexurba.apirestboot.model.User;
import com.alexurba.apirestboot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.ArrayList;
import java.util.Optional;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping()
    public ArrayList<User> GetUsers(){
        return userService.GetUsers();
    }

    @GetMapping(path = "/{id}")
    public Optional<User> GetUser(@PathVariable Integer id){
        return userService.GetUser(id);
    }

    @PostMapping()
    public User SaveUser(@RequestBody User user){
        return userService.Save(user);
    }

    @GetMapping(path = "/query")
    public ArrayList<User> FindByAge(@RequestParam("age") int age){
        return userService.FindByAge(age);
    }

    @DeleteMapping(path = "{id}")
    public boolean DeleteUser(@PathVariable Integer id){
        return userService.Delete(id);
    }

}
