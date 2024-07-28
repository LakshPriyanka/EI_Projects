package Exercise1.creational.factory;

public abstract class VehicleFactory {
    public abstract Vehicle createVehicle();

    public void manufactureVehicle() {
        Vehicle vehicle = createVehicle();
        vehicle.manufacture();
    }
}