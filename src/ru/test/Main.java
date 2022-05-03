package ru.test;

import java.util.Arrays;

public class Main {

    public static void printSpace() {
        System.out.println("---------------------");
    }
    public static void printAllEmployers(Employee[] bookEmployee){
        System.out.println(Arrays.toString(bookEmployee));
        for (int i = 0; i < bookEmployee.length; i++) {
            System.out.println(bookEmployee[i]);
        }
    }
    public static int sumSalary (Employee[] sum) {
        int sumCosts = 0;
        for (int i = 0; i < sum.length; i++) {
            sumCosts = sumCosts + sum[i].getSalary();
        }
        return sumCosts;
    }
    public static int middleSalary (Employee[] middleSum) {
        int middle = 0;
        for (int i = 0; i < middleSum.length; i++) {
            middle = middle + middleSum[i].getSalary();
        }
        middle /= 2;
        return middle;
    }
    public static int maxSalary(Employee[] maxSalary) {
        int max = 0;
        for (int i = 0; i < maxSalary.length; i++) {
            if (max < maxSalary[i].getSalary()) {
                max = maxSalary[i].getSalary();
            }
        }
        return max;
    }
    public static int minSalary(Employee[] minSalary) {
        int min = 1_000_000;
        for (int i = minSalary.length - 1; i >= 0; i--) {
            if (min > minSalary[i].getSalary()) {
                min = minSalary[i].getSalary();
            }
        }
        return min;
    }
    public static void getAllNames(Employee[] allNames) {
        for (int i = 0; i < allNames.length; i++) {
            System.out.println(allNames[i].getName());
        }
    }
    public static Employee increaseSalary(Employee[] setSalary, int increase) {
        int i;
        for (i = 0; i < setSalary.length; i++) {
            setSalary[i].setSalary(setSalary[i].getSalary() + (setSalary[i].getSalary() / 100 * increase));
            System.out.println(setSalary[i]);
        }
        return setSalary[i - 1];
    }
    public static void wantSalary(Employee[] employees, int salary) {
        for (int i = 0; i < employees.length; i++) {
            if (salary <= employees[i].getSalary()) {
                System.out.println(employees[i].getName() + " зарплата - " + employees[i].getSalary() + " доволен");
            }  else {
                System.out.println(employees[i].getName() + " зарплата - " + employees[i].getSalary() + " недоволен");
            }
        }
    }
    public static int checkDepartment(int d) {
        if (d > 0 && d < 6) {
            return d;
        } else {
            throw new RuntimeException("Такого отдела не существует");
        }
    }
    public static int sumSalaryForDepartment (Employee[] sum, int d) {
        int sumCostsForDepartment = 0;
        for (int i = 0; i < sum.length; i++) {
            if (d == sum[i].getDepartment()) {
                sumCostsForDepartment = sumCostsForDepartment + sum[i].getSalary();
            }
        }
        return sumCostsForDepartment;
    }
    public static int middleSalaryForDepartment (Employee[] middleSum, int d) {
        int middleForDepartment = 0;
        int personInDepartment = 0;
        for (int i = 0; i < middleSum.length; i++) {
            if (d == middleSum[i].getDepartment()) {
                middleForDepartment = middleForDepartment + middleSum[i].getSalary();
                personInDepartment++;
            }
        }
        middleForDepartment = middleForDepartment / personInDepartment;
        return middleForDepartment;
    }
    public static int maxSalaryForDepartment(Employee[] maxSalary, int d) {
        int maxForDepartment = 0;
        for (int i = 0; i < maxSalary.length; i++) {
            if (d == maxSalary[i].getDepartment()) {
                if (maxForDepartment < maxSalary[i].getSalary()) {
                    maxForDepartment = maxSalary[i].getSalary();
                }
            }
        }
        return maxForDepartment;
    }
    public static int minSalaryForDepartment(Employee[] minSalary, int d) {
        int minForDepartment = 1_000_000;
        for (int i = minSalary.length - 1; i >= 0; i--) {
            if (d == minSalary[i].getDepartment()) {
                if (minForDepartment > minSalary[i].getSalary()) {
                    minForDepartment = minSalary[i].getSalary();
                }
            }
        }
        return minForDepartment;
    }
    public static Employee increaseSalaryForDepartment (Employee[] setSalaryForDepartment, int d, int increaseForDepartment) {
        int i;
        for (i = 0; i < setSalaryForDepartment.length; i++) {
            if (d == setSalaryForDepartment[i].getDepartment()) {
                setSalaryForDepartment[i].setSalary(setSalaryForDepartment[i].getSalary() +
                        (setSalaryForDepartment[i].getSalary() / 100 * increaseForDepartment));
                System.out.println(setSalaryForDepartment[i]);
            }
        }
        return setSalaryForDepartment[i - 1];
    }
    public static void printDepartmentsEmployers(Employee[] employees, int d) {
        for (int i = 0; i < employees.length; i++) {
            if (d == employees[i].getDepartment()) {
                System.out.println("ФИО " + employees[i].getName() + " зарплата " + employees[i].getSalary());
            }
        }
    }

    public static void main(String [] args) {
        Employee[] bookEmployee = new Employee[10];
        bookEmployee[0] = new Employee("Виктор Ан", 1, 10000);
        bookEmployee[1] = new Employee("Сергей Пипуткин", 4, 50000);
        bookEmployee[2] = new Employee("Василий Павлов", 4, 60000);
        bookEmployee[3] = new Employee("Сергей Петров", 3, 36000);
        bookEmployee[4] = new Employee("Андрей Великанов", 2, 22000);
        bookEmployee[5] = new Employee("Ирина Капитанова", 5, 90000);
        bookEmployee[6] = new Employee("Ольга Минорова", 1, 11000);
        bookEmployee[7] = new Employee("Петр Романов", 1, 16000);
        bookEmployee[8] = new Employee("Игорь Степанов", 5, 51000);
        bookEmployee[9] = new Employee("Жанна Уханова", 3, 38000);
        int increaseSalary = 5;
        int wantedSalary = 50000;
        int department = 3;
        int increaseSalaryForDepartment = 3;
        printAllEmployers(bookEmployee);
        printSpace();
        System.out.println("Затраты на зарплату в месяц - " + sumSalary(bookEmployee));
        printSpace();
        System.out.println("Средняя зарплата в месяц составляет " + middleSalary(bookEmployee));
        printSpace();
        System.out.println("Максимальная зарплата в месяц составляет " + maxSalary(bookEmployee));
        printSpace();
        System.out.println("Минимальная зарплата в месяц составляет " + minSalary(bookEmployee));
        printSpace();
        getAllNames(bookEmployee);
        printSpace();
        increaseSalary(bookEmployee, increaseSalary);
        printSpace();
        wantSalary(bookEmployee, wantedSalary);
        printSpace();
        checkDepartment(department);
        System.out.println("Сумма затрат на зарплату на отдел " + department + " - " + sumSalaryForDepartment(bookEmployee, department));
        printSpace();
        System.out.println("Средняя зарплата отдела " + department + " - " + middleSalaryForDepartment(bookEmployee, department));
        printSpace();
        System.out.println("Максимальная зарплата отдела " + department + " - " + maxSalaryForDepartment(bookEmployee, department));
        printSpace();
        System.out.println("Минимальная зарплата отдела " + department + " - " + minSalaryForDepartment(bookEmployee, department));
        printSpace();
        increaseSalaryForDepartment(bookEmployee, department, increaseSalaryForDepartment);
        printSpace();
        printDepartmentsEmployers(bookEmployee, department);

    }
}
