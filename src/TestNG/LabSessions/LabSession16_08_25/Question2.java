package com.wipro.testng.LabSession16_08_25;

import org.testng.annotations.Test;

public class Question2 {

    @Test(groups = {"Sanity"})
    public void createUser() {
        System.out.println("Create User executed");
    }

    @Test(groups = {"Regression"})
    public void updateUser() {
        System.out.println("Update User executed");
    }

    @Test(groups = {"Sanity", "Regression"})
    public void deleteUser() {
        System.out.println("Delete User executed");
    }

    @Test(groups = {"Smoke"})
    public void viewUser() {
        System.out.println("View User executed");
    }
}
