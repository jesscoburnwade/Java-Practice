package com.company;

public class two {

    public static void main(String[] args){
        int salary;
        float tax = 0, net = 0;
        salary = 2500;
        if (salary < 1000)
            tax = salary*5/100;
        else if (salary >= 1000 & salary < 2000)
            tax = salary*15/100;
        else if (salary >= 2000 & salary < 3000)
            tax = salary*17/100;
        else if (salary >= 3000 & salary < 4000)
            tax = salary*21/100;
        else if (salary >= 4000)
            tax = salary*25/100;
        net = salary-tax;

        System.out.println("Salary = £" + salary);
        System.out.println("Tax = £" + tax);
        System.out.println("Net Salary = £" + net);
    }
}
