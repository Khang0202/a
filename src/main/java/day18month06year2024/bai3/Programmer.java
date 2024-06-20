package day18month06year2024.bai3;

public class Programmer extends Employee{
    public Programmer(String name, String address) {
        super(name, address);
        this.title = "Programmer";
        this.bonus = 9120;
        this.doingWhat = "debugging code in Python";
    }
}
