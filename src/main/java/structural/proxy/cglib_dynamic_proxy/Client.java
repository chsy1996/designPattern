package structural.proxy.cglib_dynamic_proxy;

public class Client {
    public static void main(String[] args) {
        ProxyFactory proxyFactory = new ProxyFactory(new TrainStation());

        TrainStation proxyObject = proxyFactory.getProxyObject();
        proxyObject.sell();
    }
}
