package creational.prototype.demo;

public class Client {
    public static void main(String[] args) throws CloneNotSupportedException {
        ExamCertification cert = new ExamCertification();

        ExamCertification clonedCert = cert.clone();
        cert.setName("张三");
        clonedCert.setName("李四");

        cert.showCertificationText();
        clonedCert.showCertificationText();

    }
}
