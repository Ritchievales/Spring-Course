package com.curso.curso.controllers;

import com.curso.curso.dao.UserDAO;
import com.curso.curso.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class UserController {
    @Autowired
    private UserDAO userDao;
    @RequestMapping(value = "api/user/{id}", method = RequestMethod.GET)
    public User getUser(@PathVariable int id){
        User user = new User();
        user.setId(id);
        user.setName("Ricardo");
        user.setLastName("Rios");
        user.setEmail("ric@rdo.com");
        user.setPhone("3131313134");
        return user;
    }

    @RequestMapping(value = "user1")
    public User modifyUser(){
        User user = new User();
        user.setName("Ricardo");
        //user.setLastName("Rios");
        user.setEmail("ric@rdo.com");
        user.setPhone("3131313134");
        return user;
    }

    @RequestMapping(value = "api/users/{id}", method = RequestMethod.DELETE)
    public void deleteUser(@PathVariable int id){
        userDao.delete(id);
    }

    @RequestMapping(value = "user3")
    public User searchUser(){
        User user = new User();
        user.setName("Ricardo");
        //user.setLastName("Rios");
        user.setEmail("ric@rdo.com");
        user.setPhone("3131313134");
        return user;
    }

    @RequestMapping(value = "api/users",method = RequestMethod.GET)
    public List<User> getUsers(){
        return userDao.getUsers();
    }

    @RequestMapping(value = "api/users",method = RequestMethod.POST)
    public void registerUser(@RequestBody User user){
        userDao.registerUser(user);
    }
}
