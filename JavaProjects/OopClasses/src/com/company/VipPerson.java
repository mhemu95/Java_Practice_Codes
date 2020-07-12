package com.company;

public class VipPerson {

    private String name;
    private double accountLimit;
    private String email;

    public VipPerson() {
        this("default name", 10000.0, "default@email.com");
    }

    public VipPerson(String name, double accountLimit) {
        this.name = name;
        this.accountLimit = accountLimit;
    }

    public VipPerson(String name, double accountLimit, String email) {
        this.name = name;
        this.accountLimit = accountLimit;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public double getAccountLimit() {
        return accountLimit;
    }

    public String getEmail() {
        return email;
    }
}
