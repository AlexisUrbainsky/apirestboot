package com.alexurba.apirestboot.service;

import com.alexurba.apirestboot.model.User;
import com.alexurba.apirestboot.repository.UserRepositoryCustom;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepositoryCustom userRepository;

    public  Optional<User>  GetUser(Integer id) {
        return userRepository.findById(id);
    }

    public ArrayList<User> GetUsers(){
        return (ArrayList<User>) userRepository.findAll();
    }

    public User Save(User user){
        return (User) userRepository.save(user);
    }

    public ArrayList<User> FindByAge(int age){
        return (ArrayList<User>) userRepository.findByAge(age);
    }

    public boolean Delete(int id){
        try {
            userRepository.deleteById(id);
            return true;
        }catch (Exception e){
            return false;
        }
    }

}
