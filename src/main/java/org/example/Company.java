package org.example;

import java.util.Arrays;

public class Company {
    private long id;
    private String name;
    private double giro;
    private String[] developerNames;

    public Company(long id, String name, double giro, String[] developerNames) {
        this.id = id;
        this.name = name;
        this.giro = giro<0?0:giro;
        this.developerNames = developerNames;
    }

    @Override
    public String toString() {
        return "Company{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", giro=" + giro +
                ", developerNames=" + Arrays.toString(developerNames) +
                '}';
    }

    public long getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    public double getGiro(){
        return giro;
    }
    public String[] getDeveloperNames(){
        return developerNames;
    }
    public void setId(long id){
        this.id=id;
    }
    public void setName(String name){
        this.name = name;
    }
    public void  setGiro(double giro){
        if(giro<0){
            this.giro = 0;
        } else {
            this.giro = giro;
        }
    }
    public void setDeveloperNames(String[] developerNames){
        this.developerNames = developerNames;
    }

    public boolean addEmployee(int index, String name){
        if ( developerNames == null){
            System.out.println("developerNames is not initialized");
            return false;
        } else if (developerNames.length<=index || index <0){
            System.out.println("Cannot operate");
            return false;
        } else if (developerNames[index]==null){
            developerNames[index] = name;
            return true;
        } else {
            System.out.println("Given index is not empty.");
            return false;
        }
    }
}
