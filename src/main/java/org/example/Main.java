package org.example;

import org.example.enums.Plan;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Employee employee = new Employee(585293123, "Şevval Aksoy",
                "sevvala17@gmail.com", "a123Bc", new String[]{"Bülent", "Aysel", "Dilek", ""});
        System.out.println(employee.toString());

        Healthplan healthplan = new Healthplan(585293123, "Şevval", Plan.BASIC);
        System.out.println(healthplan.toString());

        Company company = new Company(585293123, "Şevval", 1500000.00, new String[]{"Melih", "Metin"});
        System.out.println(company.toString());
    }
}