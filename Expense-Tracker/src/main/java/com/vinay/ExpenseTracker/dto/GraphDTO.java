package com.vinay.ExpenseTracker.dto;

import com.vinay.ExpenseTracker.entity.Expense;
import com.vinay.ExpenseTracker.entity.Income;
import lombok.Data;

import java.util.List;

@Data
public class GraphDTO {


    private List<Expense> expenseList;

    private List<Income> incomeList;
}
