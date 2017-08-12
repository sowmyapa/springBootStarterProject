package com.practise.codechallenge.dbmodel;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.joda.time.DateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Data
@Entity
@Table(name="expense")
@NoArgsConstructor
@AllArgsConstructor
public class Expense {

    @Column(name="user_id")
    private String userId;

    @Id
    @Column(name="expense_id")
    private String expenseId;

    @Column(name="expense_date")
    private Date exepenseDate;

    @Column(name="expense_total")
    private String expenseTotal;

    @Column(name="expense_vat")
    private String expenseVat;

    @Column(name="expense_reason")
    private String expenseReason;

}
