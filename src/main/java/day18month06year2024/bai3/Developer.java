package day18month06year2024.bai3;

public class Developer extends Employee{
    public Developer(String name, String address) {
        super(name, address);
        this.title = "Developer";
        this.bonus = 7200;
        this.doingWhat = "writing code in Java";
    }
}
