package rc.dbinitdemo.entity;



import rc.dbinitdemo.models.BankAccount;
import rc.dbinitdemo.models.Owner;
import rc.dbinitdemo.models.Student;
import rc.dbinitdemo.models.Teacher;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "bank_account")
public class BankAccountEntity implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @OneToOne(cascade = CascadeType.ALL)
    private OwnerEntity source;

    @OneToOne(cascade = CascadeType.ALL)
    private OwnerEntity sink;

    private int amount;

    public BankAccountEntity(int id, OwnerEntity source, OwnerEntity sink, int amount) {
        this.id = id;
        this.source = source;
        this.sink = sink;
        this.amount = amount;
    }

    public BankAccountEntity() {
    }

    public BankAccountEntity(BankAccount bankAccount) {
        if (bankAccount.getId() != null) {
            this.setId(bankAccount.getId());
        }

        Owner source = bankAccount.getSource();
        if (source instanceof Student) {
            this.source = new StudentEntity((Student) source);
        }
        if (source instanceof Teacher) {
            this.source = new TeacherEntity((Teacher) source);
        }

        Owner sink = bankAccount.getSink();
        if (sink instanceof  Student) {
            this.sink = new StudentEntity((Student) sink);
        }
        if (sink instanceof Teacher) {
            this.sink = new TeacherEntity((Teacher) sink);
        }
        this.amount = bankAccount.getAmount();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public OwnerEntity getSource() {
        return source;
    }

    public void setSource(OwnerEntity source) {
        this.source = source;
    }

    public OwnerEntity getSink() {
        return sink;
    }

    public void setSink(OwnerEntity sink) {
        this.sink = sink;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
}
