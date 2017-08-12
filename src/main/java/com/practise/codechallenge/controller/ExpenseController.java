package com.practise.codechallenge.controller;

import com.practise.codechallenge.representationdto.ExpenseRequest;
import com.practise.codechallenge.service.ExpenseService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Api(basePath = "/challenge", description = "API for code challenge", produces = "application/json")
@Controller
@RequestMapping(value = "/challenge",produces= MediaType.APPLICATION_JSON_VALUE)
public class ExpenseController {

    @Autowired
    private ExpenseService expenseService;

    @RequestMapping(method = RequestMethod.GET,path="/resource")
    @ApiOperation(value = "Get Resource", notes = "")
    public ResponseEntity getResource(){
        return ResponseEntity.ok().build();
    }

    @RequestMapping(method = RequestMethod.PUT,path="/resource")
    @ApiOperation(value = "Update Resource", notes = "")
    public ResponseEntity updateResource(){
        return ResponseEntity.ok().build();
    }

    @RequestMapping(method = RequestMethod.POST,path="/expense/{userId}")
    @ApiOperation(value = "Add Resource", notes = "")
    public ResponseEntity addResource(@PathVariable(value = "userId") String userId,
            @RequestBody ExpenseRequest expenseRequest){
        expenseService.addExpense(expenseRequest,userId);
        return ResponseEntity.ok().build();
    }

    @RequestMapping(method = RequestMethod.DELETE,path="/resource")
    @ApiOperation(value = "Remove Resource", notes = "")
    public ResponseEntity removeResource() {
        return ResponseEntity.ok().build();
    }

}
