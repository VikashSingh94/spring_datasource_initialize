package rc.dbinitdemo.entity;

import rc.dbinitdemo.models.Student;

import javax.persistence.Entity;
import javax.persistence.Table;


@Entity
@Table(name = "student")
public class StudentEntity extends OwnerEntity {
    private String name;
    private String address;

    public StudentEntity(int id, String name, String address) {
        super(id);
        this.name = name;
        this.address = address;
    }

    public StudentEntity() {
    }

    public StudentEntity(Student student) {
        if (student.getId() != null) {
            this.setId(student.getId());
        }

        this.name = student.getName();
        this.address = student.getAddress();
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
