package creational.prototype;

public class RealizeType implements Cloneable{

    public String getStr() {
        return str;
    }

    private String str = new String("具体原型对象属性");

    @Override
    protected RealizeType clone() throws CloneNotSupportedException {
        return (RealizeType) super.clone();
    }
}
