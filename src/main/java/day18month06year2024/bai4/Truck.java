package day18month06year2024.bai4;


import java.util.Date;

public class Truck extends Vehicle {

    public Truck(String brand, Date releaseAt, String fuelType) {
        super(brand, releaseAt, fuelType);
        this.model = "Truck";
    }
}
