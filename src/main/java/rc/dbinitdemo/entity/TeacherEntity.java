package rc.dbinitdemo.entity;

import rc.dbinitdemo.models.Teacher;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "teacher")
public class TeacherEntity extends OwnerEntity{


    private String name;
    private String address;
    private String subject;

    public TeacherEntity(int id, String name, String address, String subject) {
        super(id);
        this.name = name;
        this.address = address;
        this.subject = subject;
    }

    public TeacherEntity() {
    }

    public TeacherEntity(Teacher teacher) {
        if (teacher.getId() != null) {
            this.setId(teacher.getId());
        }

        this.name = teacher.getName();
        this.address = teacher.getAddress();
        this.subject = teacher.getSubject();
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
