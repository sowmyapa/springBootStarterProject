package com.practise.codechallenge.service;

import com.practise.codechallenge.dbmodel.User;
import com.practise.codechallenge.representationdto.ExpenseRequest;
import com.practise.codechallenge.representationdto.UserRequest;

/**
 * Created by sowmyaparameshwara on 8/12/17.
 */
public interface UserService {

    User addUser(UserRequest userRequest);

}
