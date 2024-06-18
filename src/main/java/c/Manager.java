package c;

public class Manager extends Employee{

    public Manager(String name, String address) {
        super(name, address);
        this.title = "Manager";
        this.bonus = 12000;
        this.doingWhat = "managing a project";
    }
}
