package creational.factory.abstract_method;

public class Client {
    public static void main(String[] args) {
//        DessertFactory factory = new AmericanDessertFactory();
        DessertFactory factory = new ItalyDessertFactory();
        Coffee coffee = factory.createCoffee();
        Dessert dessert = factory.createDessert();
        System.out.println(coffee.getName());
        dessert.show();

    }
}
