package structural.adapter.cls_adapter;

public class SDAdapterTF extends TFCardImpl implements SDCard {

    public void readSDCard() {
        readTFCard();
    }

    public void writeSDCard() {
        writeTFCard();
    }
}
