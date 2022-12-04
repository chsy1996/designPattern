package structural.proxy.static_proxy;

public class TrainStation implements SellTicket {
    @Override
    public void sell() {
        System.out.println("收钱，给票");
    }
}
