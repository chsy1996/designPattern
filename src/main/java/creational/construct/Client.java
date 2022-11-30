package creational.construct;

public class Client {
    public static void main(String[] args) {
        Director mountainDirector = new Director(new MountainBikeBikeBuilder());
        Bike mountainBike = mountainDirector.construct();

        Director roadDirector = new Director(new RoadBikeBikeBuilder());
        Bike roadBike = roadDirector.construct();

        System.out.println(mountainBike.getSeat());
        System.out.println(mountainBike.getFrame());

        System.out.println(roadBike.getSeat());
        System.out.println(roadBike.getFrame());
    }
}
