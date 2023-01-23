package com.bridgelabs.hashmap;

import java.util.HashMap;
import java.util.Scanner;
public class DemoHashMap {
    static int id;
    static String name;
    static double salary;
    static Employee employee;
    public static void main(String[] args) {
        HashMap<Integer, Employee> employeeHashMap = new HashMap<>();
        System.out.println("Enter the number of employee details would like to add");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for(int i = 0; i < n; i++) {
            System.out.println("Enter the employee id");
            id =scanner.nextInt();
            System.out.println("Enter the name of the employee");
            name = scanner.next();
            System.out.println("Enter the salary of the employee");
            salary = scanner.nextDouble();
            employee = new Employee(id, name, salary);
            employeeHashMap.put(id, employee);
        }
        System.out.println("Enter the employee id to get information");
        int value1 = scanner.nextInt();
        System.out.println(employeeHashMap.get(value1));
        System.out.println("Enter the employee id to delete the information");
        int value2 = scanner.nextInt();
        employeeHashMap.remove(value2);
        System.out.println("value of the key "+value2+"has been removed successfully");
        System.out.println("Enter the key and values to be replaced");
        System.out.println("ket as id");
        int value3 = scanner.nextInt();
        System.out.println("Enter the employee id");
        int updateId =scanner.nextInt();
        System.out.println("Enter the name of the employee");
        String updateName = scanner.next();
        System.out.println("Enter the salary of the employee");
        double updateSalary = scanner.nextDouble();
        Employee updatedEmployee = new Employee(updateId, updateName, updateSalary);
        employeeHashMap.replace(value3, updatedEmployee);
        System.out.println(employeeHashMap.get(value3));
    }
}
