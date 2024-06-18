package d;

import java.util.Date;

public class Motorcycle extends Vehicle {

    public Motorcycle(String brand, Date releaseAt, String fuelType) {
        super(brand, releaseAt, fuelType);
        this.model = "Motorcycle";
    }
}
