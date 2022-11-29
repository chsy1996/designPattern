package creational.factory.factory_method;

public class CoffeeStore {

    private CoffeeFactory coffeeFactory = null;

    public void setCoffeeFactory(CoffeeFactory coffeeFactory) {
        this.coffeeFactory = coffeeFactory;
    }

    public void orderCoffee() {
        Coffee coffee = coffeeFactory.createCoffee();
        coffee.addMilk();
        coffee.addSugar();
        System.out.println(coffee.getName());
    }



}
