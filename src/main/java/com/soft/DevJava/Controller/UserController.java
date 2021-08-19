package com.soft.DevJava.Controller;


import com.soft.DevJava.dao.UserDao;
import com.soft.DevJava.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserDao userDao;

    @RequestMapping(value = "api/usersList", method = RequestMethod.GET)
    public List<User> getUsers() {
//        if (!validarToken(token)) { return null; }

        return userDao.getUsers();
    }



}


//    @RequestHeader(value="Authorization") String token