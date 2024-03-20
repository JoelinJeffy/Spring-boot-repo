package com.example.user.Controller;

import com.example.user.Entity.UserEntity;
import com.example.user.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class UserController {
    UserRepository userRepository;
    @Autowired
    public UserController(UserRepository userRepository)
    {
        this.userRepository=userRepository;
    }
    @PostMapping("/createUser")
    public UserEntity createUser(@RequestBody UserEntity userEntity)
    {
        UserEntity user=userEntity;
        return userRepository.save(user);

    }
    @GetMapping("/getUser")
    public List<UserEntity> getUser()
    {
        return userRepository.findAll();
    }
    @GetMapping("/getUser/{id}")
    public UserEntity getUserById(@PathVariable int id)
    {
        return userRepository.findById(id).orElse(null);
    }
    @GetMapping("/findUser/{userName}")
    public Optional<UserEntity> findUser(@PathVariable String userName)
    {
        Optional<UserEntity> user= userRepository.findByuserName(userName);
        return user;




    }


}
