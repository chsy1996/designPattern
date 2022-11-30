package creational.prototype.demo;

public class ExamCertification implements Cloneable{

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void showCertificationText() {
        System.out.printf("%s因表现良好，成绩优异，获得期末奖状一张。\n", getName());
    }

    @Override
    protected ExamCertification clone() throws CloneNotSupportedException {
        return (ExamCertification) super.clone();
    }
}
