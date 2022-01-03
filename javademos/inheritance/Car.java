package javademos.inheritance;

public class Car extends Vehicle{
    
    private String carType;

    public Car() {
        super();
        System.out.println("car zero argument constructor");
        this.carType = "";
    }

    public Car(String brand, String fuelType, String vehicleType, String carType) {
        super(brand, fuelType, vehicleType);
        System.out.println("car three argument constructor");
        this.carType = carType;
    }

    public String getCarType() {
        return carType;
    }

    public void setCarType(String carType) {
        this.carType = carType;
    }

    @Override
    public void fuelEffciency() {
        System.out.println("Fuel efficeincy of the Car....");
    }
}
