package creational.prototype;

public class Client {
    public static void main(String[] args) throws CloneNotSupportedException {
        RealizeType obj = new RealizeType();
        RealizeType clonedObj = obj.clone();

        System.out.printf("原型对象和浅克隆对象对比结果: %s\n", obj == clonedObj);
        System.out.printf("原型对象和浅克隆对象对应属性对比结果: %s\n", obj.getStr() == clonedObj.getStr());
    }
}
