package creational.factory.simple_factory;

import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        Scanner sin = new Scanner(System.in);

        CoffeeStore store = new CoffeeStore();
        Coffee coffee = store.orderCoffee(sin.nextLine());
        System.out.println(coffee.getName());
        System.out.println(coffee.toString());
    }
}
