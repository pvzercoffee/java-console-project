package com.pvzer;

public class Main {

    public static void main(String[] args)
    {
        Employee[] emps = new Employee[5];

        emps[0] = new FullTimeEmployee("001", "张三", "技术部", 8000);
        emps[1] = new FullTimeEmployee("002", "李四", "市场部", 7000);
        emps[2] = new FullTimeEmployee("003", "王五", "人事部", 6000);
        emps[3] = new PartTimeEmployee("004", "赵六", "技术部", 50, 80);
        emps[4] = new PartTimeEmployee("005", "钱七", "市场部", 40, 60);

        double salaryTotal = 0.0;

        for( Employee emp : emps)
        {
            double salary = emp.calculateSalary();

            System.out.println("id:"+emp.getId()+"  姓名:"+emp.getName()+"  部门："+emp.getDepartment()+"  月薪："+salary);

            salaryTotal += salary;
        }

        System.out.println("工资总和："+salaryTotal);
    }
}