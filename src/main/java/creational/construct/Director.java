package creational.construct;

public class Director {

    private BikeBuilder builder;

    public Director(BikeBuilder builder) {
        this.builder = builder;
    }

    public Bike construct() {
        builder.buildSeat();
        builder.buildFrame();
        return builder.createBike();
    }
}
