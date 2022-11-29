package creational.factory.factory_method;

public class Client {
    public static void main(String[] args) {
        CoffeeStore coffeeStore = new CoffeeStore();

        coffeeStore.setCoffeeFactory(new AmericanCoffeeFactory());
        coffeeStore.orderCoffee();

        coffeeStore.setCoffeeFactory(new LatteCoffeeFactory());
        coffeeStore.orderCoffee();
    }
}
