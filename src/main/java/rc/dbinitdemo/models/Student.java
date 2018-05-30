package rc.dbinitdemo.models;


import java.io.Serializable;

public class Student extends Owner implements Serializable {

    private String name;
    private String address;

    public Student(int id, String name, String address) {
        super(id);
        this.name = name;
        this.address = address;
    }

    public Student() {
        super();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
