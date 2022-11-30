package creational.construct;

public abstract class BikeBuilder {

    protected Bike bike = new Bike();

    abstract void buildFrame();

    abstract void buildSeat();

    abstract Bike createBike();
}
