package com.project;

/**
 * Created by localadmin on 02/01/17.
 */
public class Client {
    private String name;
    private int age ;
    private String gender ;
    private int cashBalance = 0;

    public Client(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }


    public int getCashBalance() {
        return cashBalance;
    }

    public String getGender() {
        return gender;
    }
    public void deposit(int cash){
        this.cashBalance += cash;
    }

    public void withdraw(int cash){
        this.cashBalance -= cash;
    }
}
