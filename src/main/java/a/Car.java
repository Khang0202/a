package a;

public class Car extends Vehicle {
    public Car(int speed){
        super(speed);
    }
    public Car(){
        this.speed = 50;
    }
    @Override
    public void speedUp() {
        this.speed += 120;
        System.out.println("a.Car speeding up !!!!!!!");
        System.out.println("Now speed is " + this.speed);
    }
}
