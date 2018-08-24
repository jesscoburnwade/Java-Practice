package com.company;

class Accounts {
    public void CalculateSalary(int salary, int absents) throws Boom {
        float Net = 0;
        if (absents >= 8) {
            Boom ABC = new Boom();
            throw ABC;
        }
    }
}
