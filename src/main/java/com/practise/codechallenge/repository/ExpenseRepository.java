package com.practise.codechallenge.repository;

import com.practise.codechallenge.dbmodel.Expense;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by sowmyaparameshwara on 8/12/17.
 */
public interface ExpenseRepository extends JpaRepository<Expense,String> {

}
