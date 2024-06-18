package d;


import java.util.Date;

public class Truck extends Vehicle {

    public Truck(String brand, Date releaseAt, String fuelType) {
        super(brand, releaseAt, fuelType);
        this.model = "Truck";
    }
}
