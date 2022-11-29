package creational.factory.simple_factory;

public abstract class Coffee {
    public void addMilk() {
        System.out.println("加奶");
    }
    public void addSugar() {
        System.out.println("加糖");
    }
    public abstract String getName();
}
