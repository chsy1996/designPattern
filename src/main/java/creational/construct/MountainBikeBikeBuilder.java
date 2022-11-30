package creational.construct;

public class MountainBikeBikeBuilder extends BikeBuilder {
    @Override
    void buildFrame() {
        bike.setFrame("mountain frame");
    }

    @Override
    void buildSeat() {
        bike.setSeat("mountain seat");
    }

    @Override
    Bike createBike() {
        return bike;
    }
}
