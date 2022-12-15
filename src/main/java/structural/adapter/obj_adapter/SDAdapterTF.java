package structural.adapter.obj_adapter;

public class SDAdapterTF implements SDCard {

    private TFCard tfCard;

    public SDAdapterTF(TFCard tfCard) {
        this.tfCard = tfCard;
    }

    public void readSDCard() {
        tfCard.readTFCard();
    }

    public void writeSDCard() {
        tfCard.writeTFCard();
    }
}
