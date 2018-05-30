package rc.dbinitdemo.models;

import java.io.Serializable;


public class Teacher extends Owner implements Serializable {

    private String name;
    private String address;
    private String subject;

    public Teacher(int id, String name, String address, String subject) {
        super(id);
        this.name = name;
        this.address = address;
        this.subject = subject;
    }

    public Teacher() {
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

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }
}

