package com.practise.codechallenge.service;

import com.practise.codechallenge.representationdto.ExpenseRequest;

/**
 * Created by sowmyaparameshwara on 8/12/17.
 */
public interface ExpenseService {

    ExpenseRequest addExpense(ExpenseRequest expenseRequest, String userId);

}
