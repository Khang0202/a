package day18month06year2024.bai3;

public class Employee {
    String name;
    String address;
    String title;
    double salary;
    double bonus;
    String doingWhat;

    public Employee(String name, String address) {
        this.name = name;
        this.address = address;
        this.title = "b.Employee";
        this.salary = 40000;
        this.bonus = 0;
    }

    public void bonus() {
        if (this.bonus == 0) {
            System.out.println(this.title + "'s" + " don't have bonus");
        } else {
            System.out.println(this.title + "'s" + " Bonus: $" + this.bonus);
        }
    }

    public void report(String efficiency) {
        System.out.print("Performance report for " + this.title + " " + this.name + ": " + efficiency);
    }

    public void doing() {
        System.out.println(this.title + " " + this.name + " is " + this.doingWhat);
    }
}
