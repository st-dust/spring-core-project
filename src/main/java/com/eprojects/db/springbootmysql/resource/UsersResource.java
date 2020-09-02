package com.eprojects.db.springbootmysql.resource;

import com.eprojects.db.springbootmysql.model.User;
import com.eprojects.db.springbootmysql.repository.UsersRepository;
import com.eprojects.db.springbootmysql.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.vaadin.flow.router.PageTitle;

import java.util.List;

@RestController
@RequestMapping(value = "/users")
@PageTitle("User ID checker")
public class UsersResource {

    @Autowired
    UsersRepository usersRepository;

    @Autowired
    UserService userService;

    @GetMapping(value = "/all")
    public List<User> getAll(){
        return usersRepository.findAll();
    }

    @GetMapping(value = "/{id}")
    public User getUser(@PathVariable int id) {
        return this.userService.getUserById(id);
    }
}
