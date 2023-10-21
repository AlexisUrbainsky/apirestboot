package com.alexurba.apirestboot.repository;

import com.alexurba.apirestboot.model.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import java.util.ArrayList;

@Repository
public interface UserRepositoryCustom extends CrudRepository <User, Integer>{
    ArrayList<User> findByAge (int age);
}
