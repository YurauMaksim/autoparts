package com.autoparts.general.service;

import com.autoparts.general.dao.UserRepository;
import com.autoparts.general.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService{

    private UserRepository userRepository;

    @Autowired
    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }



    @Override
    public List<User> findAll() {
        return userRepository.findAll();
    }

    @Override
    public User findById(int id) {
        Optional<User> byId = userRepository.findById(id);
        User user;
        if (byId.isPresent()){
            user = byId.get();
        } else {
            throw new RuntimeException("Did not find the user by id = " + id);
        }
        return user;
    }

    @Override
    public void saveUser(User user) {
        userRepository.save(user);
    }

    @Override
    public void deleteById(int id) {
        userRepository.deleteById(id);
    }


}
