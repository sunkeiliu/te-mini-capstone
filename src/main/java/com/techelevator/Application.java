package com.techelevator;

import java.util.ArrayList;
import java.util.List;
public class Application {

    /**
     * The main entry point in the application
     * @param args
     */
    public static void main(String[] args) {
        Application app = new Application();
        app.run();
    }

    List<Department> departments = new ArrayList<>();
    List<Employee> employees = new ArrayList<>();

    private void run() {
        // create some departments
        createDepartments();

        // print each department by name
        printDepartments();

        // create employees
        createEmployees();

        // give Angie a 10% raise, she is doing a great job!

        // print all employees
        printEmployees();

        // create the TEams project
        createTeamsProject();
        // create the Marketing Landing Page Project
        createLandingPageProject();

        // print each project name and the total number of employees on the project
        printProjectsReport();
    }

    /**
     * Create departments and add them to the collection of departments
     */
    private void createDepartments() {
        Department marketing = new Department(1, "Marketing");
        Department sales = new Department(2, "Sales");
        Department engineering = new Department(3, "Engineering");
        departments.add(marketing);
        departments.add(sales);
        departments.add(engineering);
    }

    /**
     * Print out each department in the collection.
     */
    private void printDepartments() {
        System.out.println("------------- DEPARTMENTS ------------------------------");
        for (Department object : departments) {
            System.out.println(object.getName());
        }
    }

    /**
     * Create employees and add them to the collection of employees
     */
    private void createEmployees() {
        Employee employee1 = new Employee();
        employee1.setFirstName("Dean");
        employee1.setLastName("Johnson");
        employee1.setEmployeeId(1);
        employee1.setEmail("djohnson@teams.com");
        employee1.setSalary(60000);
        employee1.setDepartment(departments.get(2));
        employee1.setHireDate("08/21/2020");


        Employee employee2 = new Employee(2, "Angie", "Smith", "asmith@teams.com", departments.get(2), "08/21/2020");

        Employee employee3 = new Employee(3, "Margaret", "Thompson", "mthompson@teams.com", departments.get(0), "08/21/2020");

        employee2.setSalary(employee2.getSalary() + (employee2.getSalary() * .1));
        

        employees.add(employee1);
        employees.add(employee2);
        employees.add(employee3);
    }

    /**
     * Print out each employee in the collection.
     */
    private void printEmployees() {
        System.out.println("\n------------- EMPLOYEES ------------------------------");
        for (Employee employee : employees) {
            System.out.println(employee.getFullName() + " (" + employee.getSalary() + ") " + (employee.getDepartment()).getName());
        }
    }

    /**
     * Create the 'TEams' project.
     */
    private void createTeamsProject() {

    }

    /**
     * Create the 'Marketing Landing Page' project.
     */
    private void createLandingPageProject() {

    }

    /**
     * Print out each project in the collection.
     */
    private void printProjectsReport() {
        System.out.println("\n------------- PROJECTS ------------------------------");

    }

}
