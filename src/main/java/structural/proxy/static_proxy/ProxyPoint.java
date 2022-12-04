package structural.proxy.static_proxy;

public class ProxyPoint implements SellTicket {

    private TrainStation trainStation = new TrainStation();

    @Override
    public void sell() {
        System.out.println("收取代理费用");
        trainStation.sell();
    }
}
