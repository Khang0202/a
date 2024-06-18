package d;

import java.util.Date;

public class Vehicle {
    String brand;
    String model;
    Date releaseAt;
    String fuelType;
    Double maxSpeed;
    Double fuelConsumption;
    Date boughtDate;
    int averageTimeUsedADay;

    public Vehicle(String brand, Date releaseAt, String fuelType) {
        this.brand = brand;
        this.model = "Vehicle";
        this.releaseAt = releaseAt;
        this.fuelType = fuelType;

    }

    public void getSumary(Double fuelConsumption, Double maxSpeed, Date boughtDate, int averageTimeUsedADay){
        this.fuelConsumption = fuelConsumption;
        this.maxSpeed = maxSpeed;
        this.boughtDate = boughtDate;
        this.averageTimeUsedADay = averageTimeUsedADay;
        System.out.println(this.model + " Model: " + this.brand);
        getFuelEfficiency(this.fuelConsumption);
        getDistanceTraveled(this.maxSpeed, this.boughtDate, this.averageTimeUsedADay);
    }

    public void getFuelEfficiency(Double fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
        System.out.println("Fuel Efficiency: " + this.fuelConsumption * Math.random() + " mpg");
    }

    public void getDistanceTraveled(Double maxSpeed, Date boughtDate, int averageTimeUsedADay) {
        this.maxSpeed = maxSpeed;
        this.boughtDate = boughtDate;
        this.averageTimeUsedADay = averageTimeUsedADay;

        System.out.println("Distance Traveled: " + countDateUsed() * this.averageTimeUsedADay * this.maxSpeed + " miles");
        System.out.println("Max Speed: " + this.maxSpeed + " mph");
    }

    public int countDateUsed() {
        Date currentDate = new Date();
        return currentDate.getDate() - this.boughtDate.getDate();
    }
}
