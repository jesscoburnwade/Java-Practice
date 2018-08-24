package com.company;

public class Main {

    public static void main(String[] args) {
        float salary, tax = 0, net = 0;

        salary = 2500.93f;

        if (salary < 1000)
            tax = salary*5/100f;
        else if (salary >= 1000 & salary < 2000)
            tax = salary*15/100f;
        else if (salary >= 2000 & salary < 3000)
            tax = salary*17/100f;
        else if (salary >= 3000 & salary < 4000)
            tax = salary*21/100f;
        else if (salary >= 4000)
            tax = salary*25/100f;

        net = salary-tax;

        System.out.println("Salary = £" + salary);
        System.out.println("Tax = £" + String.format("%.2f",tax));
        System.out.println("Net Salary = £" + net);
    }
}
