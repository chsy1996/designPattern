package creational.prototype.deepcopy;

import java.io.Serializable;

public class Student implements Serializable {

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String name;

}
