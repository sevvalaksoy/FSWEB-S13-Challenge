package org.example;

import java.util.Arrays;
import java.util.Objects;

public class Employee {
    private long id;
    private String fullName;
    private String email;
    private String password;
    private String[] healthPlans;

    public Employee(long id, String fullName, String email, String password, String[] healthPlans){
        this.id = id;
        this.fullName = fullName;
        this.email = email;
        this.password = password;
        this.healthPlans = healthPlans;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", fullName='" + fullName + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", healthPlans=" + Arrays.toString(healthPlans) +
                '}';
    }

    public long getId() {
        return id;
    }
    public String getFullName(){
        return fullName;
    }
    public String getEmail(){
        return email;
    }
    public String getPassword(){
        return password;
    }
    public String[] getHealthPlans(){
        return healthPlans;
    }
    public void setId(long id){
        this.id = id;
    }
    public void setFullName(String fullName){
        this.fullName = fullName;
    }
    public void setEmail(String email){
        this.email = email;
    }
    public void setPassword(String password){
        this.password = password;
    }
    public void setHealthPlans(String[] healthPlans){
        this.healthPlans = healthPlans;
    }

    public boolean addHealthPlan(int index, String name){
        if (healthPlans == null) {
            System.out.println("Health plans array is not initialized.");
            return false;
        }
        if (healthPlans.length <= index || index < 0) {
            System.out.println("Cannot operate.");
            return false;
        }
        if (healthPlans[index] == null) {
            healthPlans[index] = name;
            return true;
        } else {
            System.out.println("The given index is not empty.");
            return false;
        }
    }
}
