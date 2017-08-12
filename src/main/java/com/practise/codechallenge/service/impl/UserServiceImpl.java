package com.practise.codechallenge.service.impl;

import com.practise.codechallenge.dbmodel.User;
import com.practise.codechallenge.repository.UserRepository;
import com.practise.codechallenge.representationdto.ExpenseRequest;
import com.practise.codechallenge.representationdto.UserRequest;
import com.practise.codechallenge.service.ExpenseService;
import com.practise.codechallenge.service.UserService;
import org.joda.time.DateTime;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.UUID;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    public User addUser(UserRequest userRequest){
        UUID userId = UUID.randomUUID();
        User user = new User(userId.toString(),userRequest.getFirstName(),userRequest.getLastName(),userRequest.getEmail(),new Date());
        userRepository.save(user);
        return user;
    }

}
