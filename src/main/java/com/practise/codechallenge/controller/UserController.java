package com.practise.codechallenge.controller;

import com.practise.codechallenge.dbmodel.User;
import com.practise.codechallenge.representationdto.ExpenseRequest;
import com.practise.codechallenge.representationdto.UserRequest;
import com.practise.codechallenge.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Api(basePath = "/user", description = "API for code challenge", produces = "application/json")
@Controller
@RequestMapping(value = "/user",produces= MediaType.APPLICATION_JSON_VALUE,consumes = MediaType.APPLICATION_JSON_VALUE)
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(method = RequestMethod.POST)
    @ApiOperation(value = "Add User", notes = "")
    public ResponseEntity addUser(@RequestBody UserRequest userRequest){
        User user = userService.addUser(userRequest);
        if(user==null)
            return new ResponseEntity(HttpStatus.INTERNAL_SERVER_ERROR);
        return new ResponseEntity(user,HttpStatus.CREATED);
    }


}
