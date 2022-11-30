package creational.construct;

public class RoadBikeBikeBuilder extends BikeBuilder {
    @Override
    void buildFrame() {
        bike.setFrame("road frame");
    }

    @Override
    void buildSeat() {
        bike.setSeat("raod seat");
    }

    @Override
    Bike createBike() {
        return bike;
    }
}
