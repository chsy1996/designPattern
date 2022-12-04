package structural.proxy.jdk_dynamic_proxy;

public class TrainStation implements SellTicket {
    @Override
    public void sell() {
        System.out.println("收钱，给票");
    }
}
