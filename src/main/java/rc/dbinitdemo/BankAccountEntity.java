//package rc.dbinitdemo;
//
//
//
//import javax.persistence.*;
//import java.io.Serializable;
//
//@Entity
//public class BankAccountEntity implements Serializable {
//    @Id
//    @GeneratedValue(strategy = GenerationType.AUTO)
//    private int id;
//
//    @OneToOne(cascade = CascadeType.ALL)
//    private Owner source;
//
//    @OneToOne(cascade = CascadeType.ALL)
//    private Owner sink;
//
//    private int amount;
//
//    // used for serialization / deserialization
//    protected BankAccount(){}
//
//    public int getId() {
//        return id;
//    }
//
//    public void setId(int id) {
//        this.id = id;
//    }
//
//    public Owner getSource() {
//        return source;
//    }
//
//    public void setSource(Owner source) {
//        this.source = source;
//    }
//
//    public Owner getSink() {
//        return sink;
//    }
//
//    public void setSink(Owner sink) {
//        this.sink = sink;
//    }
//
//    public int getAmount() {
//        return amount;
//    }
//
//    public void setAmount(int amount) {
//        this.amount = amount;
//    }
//}
