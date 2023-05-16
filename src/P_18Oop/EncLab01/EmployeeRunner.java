package P_18Oop.EncLab01;

import java.util.Date;

public class EmployeeRunner {
    public static void main(String[] args) {
        Employee emp=new Employee();
        emp.setName("Ali");
        emp.setSalary(23456);
        emp.setStartDateOfWork(new Date());

        System.out.println(emp.getName());
        System.out.println(emp.getSalary());
        System.out.println(emp.getStartDateOfWork());
    }
}
