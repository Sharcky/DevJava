package com.soft.DevJava.dao;

import com.soft.DevJava.models.User;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
@Transactional
public class UserDaoImp implements UserDao{

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    @Transactional
    public List<User> getUsers() {
        String query = "FROM User";
        return entityManager.createQuery(query).getResultList();
    }

    @Override
    public void delete(Long id) {

    }

    @Override
    public void registrar(User user) {

    }
}
