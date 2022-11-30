package creational.prototype.deepcopy;

import java.io.Serializable;

public class ExamCertification implements Cloneable, Serializable {

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    private Student student;


    public void showCertificationText() {
        System.out.printf("%s因表现良好，成绩优异，获得期末奖状一张。\n", student.getName());
    }

    @Override
    protected ExamCertification clone() throws CloneNotSupportedException {
        return (ExamCertification) super.clone();
    }
}
