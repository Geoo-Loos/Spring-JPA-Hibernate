package com.educandoweb.springpahibernate.Resoucers;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.educandoweb.springpahibernate.entities.User;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
@RequestMapping(value = "/users")
public class UserResouce {
    
    @GetMapping
    public ResponseEntity<User> findAll(){
        User user = new User(1L, "Maria Brown", "maria@gmail.com", "999999999", "123456");
        return ResponseEntity.ok().body(user);
    }

}
