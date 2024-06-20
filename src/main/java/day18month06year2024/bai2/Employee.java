package day18month06year2024.bai2;

public class Employee {

    public int salary;

    public Employee(int salary) {
        this.salary = salary;
    }

    public Employee() {
        this.salary = 40000;
    }

    public void work(){
        System.out.println("Working as an employee!");
    }

    public void getSalary(){
        System.out.println("b.Employee salary: " + this.salary);
    }
}
