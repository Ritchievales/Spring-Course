package com.curso.curso.controllers;

import com.curso.curso.models.User;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class UserController {

    @RequestMapping(value = "user/{id}")
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
        user.setLastName("Rios");
        user.setEmail("ric@rdo.com");
        user.setPhone("3131313134");
        return user;
    }

    @RequestMapping(value = "user2")
    public User deleteUser(){
        User user = new User();
        user.setName("Ricardo");
        user.setLastName("Rios");
        user.setEmail("ric@rdo.com");
        user.setPhone("3131313134");
        return user;
    }

    @RequestMapping(value = "user3")
    public User searchUser(){
        User user = new User();
        user.setName("Ricardo");
        user.setLastName("Rios");
        user.setEmail("ric@rdo.com");
        user.setPhone("3131313134");
        return user;
    }

    @RequestMapping(value = "users")
    public List<User> getUsers(){

        List<User> users = new ArrayList<>();

        User user = new User();
        user.setId(1);
        user.setName("Ricardo");
        user.setLastName("Rios");
        user.setEmail("ric@rdo.com");
        user.setPhone("3131313134");

        User user2 = new User();
        user2.setId(2);
        user2.setName("Jova");
        user2.setLastName("Sahagun");
        user2.setEmail("js@gmail.com");
        user2.setPhone("13213131344");

        User user3 = new User();
        user3.setId(3);
        user3.setName("Bala");
        user3.setLastName("Bonnie");
        user3.setEmail("bb@gmail.com");
        user3.setPhone("12331233");

        users.add(user);
        users.add(user2);
        users.add(user3);

        return users;
    }

}
