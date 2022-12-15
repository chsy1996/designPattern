package structural.adapter.obj_adapter;

public class Client {
    public static void main(String[] args) {
        Computer computer = new Computer();

        computer.readCard(new SDCardImpl());

        SDAdapterTF sdAdapterTF = new SDAdapterTF(new TFCardImpl());
        sdAdapterTF.readSDCard();
    }
}
