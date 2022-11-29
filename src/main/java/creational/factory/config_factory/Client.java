package creational.factory.config_factory;

public class Client {
    public static void main(String[] args) {
        Coffee coffee = CoffeeFactory.orderCoffee("americanCoffee");
        System.out.println(coffee.getName());

        coffee = CoffeeFactory.orderCoffee("latteCoffee");
        System.out.println(coffee.getName());
    }
}
