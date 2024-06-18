package b;

public class HRManager extends Employee{

    public HRManager(int salary) {
        super(salary);
    }

    public HRManager() {
        this.salary += 30000;
    }

    @Override
    public void work() {
        System.out.println("Managing employees");
    }

    @Override
    public void getSalary() {
        System.out.println("Manager Salary: " + this.salary);
    }

    public void addEmployee() {
        System.out.println("Adding new employee!");
    }
}
