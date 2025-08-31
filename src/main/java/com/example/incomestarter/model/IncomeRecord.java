package com.example.incomestarter.model;

public class IncomeRecord {
    private Integer id;
    private Integer income;

    public IncomeRecord() {}

    public IncomeRecord(Integer id, Integer income) {
        this.id = id;
        this.income = income;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIncome() {
        return income;
    }

    public void setIncome(Integer income) {
        this.income = income;
    }
}

