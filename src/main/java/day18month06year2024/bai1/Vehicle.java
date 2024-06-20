package day18month06year2024.bai1;

public class Vehicle {
    public int speed;

    public Vehicle(int speed) {
        this.speed = speed;
    }

    public Vehicle() {
        this.speed = 0;
    }

    public void speedUp() {
        this.speed += 60;
        System.out.println("a.Vehicle speeding up");
        System.out.println("Now speed is " + this.speed);
    }
}
