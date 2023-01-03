package structural.bridge;

public class LargeSizePen extends Pen {

    public LargeSizePen(PenRefill penRefill) {
        super(penRefill);
    }

    @Override
    public void write(String sentence) {
        System.out.println("用大号笔写下了" + penRefill.getColor() + "句子: " + sentence);
    }
}
