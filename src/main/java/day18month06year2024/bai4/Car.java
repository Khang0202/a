package day18month06year2024.bai4;

import java.util.Date;

public class Car extends Vehicle {
    public Car(String brand, Date releaseAt, String fuelType) {
        super(brand, releaseAt, fuelType);
        this.model = "Car";
    }
}
