package d;

import java.util.Date;

public class Car extends Vehicle {
    public Car(String brand, Date releaseAt, String fuelType) {
        super(brand, releaseAt, fuelType);
        this.model = "Car";
    }
}
