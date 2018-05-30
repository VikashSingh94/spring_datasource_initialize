package rc.dbinitdemo.models;


public class BankAccount  {

    private  Integer id;

    private Owner source;

    private Owner sink;

    private int amount;

    // used for serialization / deserialization
    protected BankAccount(){}

    public Owner getSource() {
        return source;
    }

    public void setSource(Owner source) {
        this.source = source;
    }

    public Owner getSink() {
        return sink;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }


    public void setSink(Owner sink) {
        this.sink = sink;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
}
