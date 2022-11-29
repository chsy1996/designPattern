package creational.factory.simple_factory;

public class SimpleCoffeeFactory {
    public Coffee createCoffee(String arg) {
        if ("latta".equalsIgnoreCase(arg)) {
            return new LatteCoffee();
        } else if ("american".equalsIgnoreCase(arg)) {
            return new AmericanCoffee();
        } else {
            throw new RuntimeException("没有该类型咖啡");
        }
    }
}
