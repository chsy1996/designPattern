package structural.bridge;

/**
 * 笔类
 * @author
 * @since 2023/01/14
 */
public abstract class Pen {

    protected PenRefill penRefill;

    public Pen(PenRefill penRefill) {
        this.penRefill = penRefill;
    }

    public abstract void write(String sentence);
}
