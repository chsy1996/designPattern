package creational.factory.static_factory;

public class SimpleCoffeeFactory {
    public static Coffee createCoffee(String arg) {
        if ("latta".equalsIgnoreCase(arg)) {
            return new LatteCoffee();
        } else if ("american".equalsIgnoreCase(arg)) {
            return new AmericanCoffee();
        } else {
            throw new RuntimeException("没有该类型咖啡");
        }
    }
}
