package structural.adapter.obj_adapter;

public class SDCardImpl implements SDCard {
    @Override
    public void readSDCard() {
        System.out.println("读取SDCard内容...");
    }

    @Override
    public void writeSDCard() {
        System.out.println("写入SDCard内容...");
    }
}
