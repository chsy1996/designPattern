package structural.proxy.jdk_dynamic_proxy;

import java.lang.reflect.Proxy;

public class ProxyFactory {

    public void setStation(TrainStation station) {
        this.station = station;
    }

    private TrainStation station;

    public SellTicket getProxyObject() {
        return (SellTicket) Proxy.newProxyInstance(
                station.getClass().getClassLoader(),
                station.getClass().getInterfaces(),
                (proxy, method, args) -> {
                    System.out.println("使用了动态代理");
                    return method.invoke(station, args);
                }
        );
    }

}
