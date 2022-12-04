package structural.proxy.jdk_dynamic_proxy;

public class Client {
    public static void main(String[] args) {
        ProxyFactory proxyFactory = new ProxyFactory();
        proxyFactory.setStation(new TrainStation());
        proxyFactory.getProxyObject().sell();
    }
}
