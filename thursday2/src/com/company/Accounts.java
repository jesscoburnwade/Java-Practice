package com.company;

public class Accounts {

    private float Tax(int Salary) {
        float T = 0;
        if (Salary < 1000)
            T = 0;
        else if (Salary >= 1000 && Salary < 2000)
            T = Salary * 15 / 100;
        else
            T = Salary * 21 / 100;
        return T;
    }

    public void NetSalary(int Salary) {
        System.out.println("Salary = £" + Salary);
        System.out.println("Tax = £" + String.format("%.2f", Tax(Salary)));
        System.out.println("Net Salary = £" + String.format("%.2f", (Salary - Tax(Salary))));
    }
}
