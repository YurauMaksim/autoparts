package com.autoparts.general.service;

import com.autoparts.general.entity.User;

import java.util.List;

public interface UserService {

    List<User> findAll();

    User findById(int id);

    void saveUser(User user);

    void deleteById(int id);


}
