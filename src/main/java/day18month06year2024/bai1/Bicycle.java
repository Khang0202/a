package day18month06year2024.bai1;

public class Bicycle extends Vehicle {
    public Bicycle(int speed){
        super(speed);
    }
    public Bicycle() {
        this.speed = 15;
    }
    @Override
    public void speedUp() {
        this.speed += 2;
        System.out.println("a.Bicycle speeding up !!!!!!!");
        System.out.println("Now speed is " + this.speed);
    }
}
