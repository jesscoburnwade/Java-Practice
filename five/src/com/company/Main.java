package com.company;

public class Main {

    public static void main(String[] args) {
        String name;
        double salary, tax, net_salary;

        name = "Bob";
        salary = 2356.48;

        System.out.println("Name: " + name);
        System.out.println("Salary = £" + salary);

        if (salary>=2000) {
            tax = salary*21/100;
            net_salary = salary - tax;

            System.out.println("Tax = £" + String.format("%.2f", tax));
            System.out.println("Net salary = £" + String.format("%.2f", net_salary));}

        if (salary < 2000) {
            tax = salary*19/100;
            net_salary = salary - tax;

            System.out.println("Tax = £" + String.format("%.2f", tax));
            System.out.println("Net salary = £" + String.format("%.2f", net_salary));}
    }
}
