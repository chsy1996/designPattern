package creational.prototype.deepcopy;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Client {
    public static void main(String[] args) throws CloneNotSupportedException, IOException, ClassNotFoundException {
        ExamCertification certification1 = new ExamCertification();
        Student stu = new Student();
        certification1.setStudent(stu);

        Path path = Paths.get("/Users/chengshuaiyang/IdeaProjects/designPattern/src/main/resources/examCertification.txt");
        ObjectOutputStream os = new ObjectOutputStream(Files.newOutputStream(path));
        os.writeObject(certification1);
        os.close();

        ObjectInputStream is = new ObjectInputStream(Files.newInputStream(path));
        ExamCertification certification2 = (ExamCertification) is.readObject();
        is.close();

        certification1.getStudent().setName("张三");
        certification2.getStudent().setName("李四");
        certification1.showCertificationText();
        certification2.showCertificationText();

    }
}
