package com.pvzer.pojo;

import com.pvzer.exception.AssistanceException;

public class Assistance {
    private int age = 50;
    private int salary = 5000;
    private int bonus = 200;

    public Assistance(){}

    public Assistance(int age,int salary) {
        this.age = age;
        this.salary = salary;
    }

    public void calculateAge() throws AssistanceException {
        if(age < 50)
        {
            throw new AssistanceException("你的年龄"+age+"不到补发工资年龄！");
        }

        salary += bonus;
        System.out.println("达到年龄,发放"+bonus+"元补贴，你的退休工资为"+salary);
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}
