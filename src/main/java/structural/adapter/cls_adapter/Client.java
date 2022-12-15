package structural.adapter.cls_adapter;

public class Client {
    public static void main(String[] args) {
        Computer computer = new Computer();

        computer.readCard(new SDCardImpl());

        computer.readCard(new SDAdapterTF());
    }
}
