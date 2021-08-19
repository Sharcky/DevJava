package com.soft.DevJava.dao;

import com.soft.DevJava.models.User;

import java.util.List;

public interface UserDao {

    List<User> getUsers();

    void delete(Long id);

    void registrar(User user);


}

