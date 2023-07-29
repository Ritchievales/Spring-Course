package com.curso.curso.dao;

import com.curso.curso.models.User;

import java.util.List;

public interface UserDAO {
    List<User> getUsers();

    void delete(int id);

    void registerUser(User user);
}
