package Exercise1.creational.factory;

public class Main {
    public static void main(String[] args) {
        VehicleFactory carFactory = new CarFactory();
        carFactory.manufactureVehicle();

        VehicleFactory bikeFactory = new BikeFactory();
        bikeFactory.manufactureVehicle();

        VehicleFactory truckFactory = new TruckFactory();
        truckFactory.manufactureVehicle();
    }
}