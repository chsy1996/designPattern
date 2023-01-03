package structural.bridge;

public class SmallSizePen extends Pen {

    public SmallSizePen(PenRefill penRefill) {
        super(penRefill);
    }

    @Override
    public void write(String sentence) {
        System.out.println("用小号笔写下了" + penRefill.getColor() + "的句子: " + sentence);
    }
}
