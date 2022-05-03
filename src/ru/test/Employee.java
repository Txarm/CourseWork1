package ru.test;

import java.util.Objects;

public class Employee {
    private String name;
    public int department;
    private int salary;

    private static int id;

    public Employee(String name, int department, int salary) {
        this.name = name;
        this.department = department;
        this.salary = salary;
        id++;
    }
    public static int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public int getDepartment() {
        return department;
    }
    public int getSalary() {
        return salary;
    }
    public void setDepartment(int department) {
        this.department = department;
    }
    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int findDepartment(int department) {
        this.department = department;
        return department;
    }
    @Override
    public String toString() {
        return "ФИО " + name + ", отдел " + department + ", зарплата " + salary;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return Objects.equals(name, employee.name);
    }
    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
