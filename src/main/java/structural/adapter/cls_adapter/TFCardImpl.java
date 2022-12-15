package structural.adapter.cls_adapter;

public class TFCardImpl implements TFCard {
    @Override
    public void readTFCard() {
        System.out.println("读取TFCard内容...");
    }

    @Override
    public void writeTFCard() {
        System.out.println("写入TFCard内容...");
    }
}
