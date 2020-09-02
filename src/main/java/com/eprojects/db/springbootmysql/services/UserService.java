package com.eprojects.db.springbootmysql.services;


import com.eprojects.db.springbootmysql.model.User;
import com.eprojects.db.springbootmysql.repository.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.Serializable;

@Service
public class UserService implements Serializable {

    @Autowired
    private UsersRepository userRepository;

    public User getUserById(int id) {
        return userRepository.findById(id).orElse(null);
    }

}
