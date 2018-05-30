package rc.dbinitdemo;

public class Abc {
    String str;

    public Abc(String str) {
        this.str = str;
    }

    public Abc() {
    }

    public Abc(Abc abc) {
        this.str = abc.str;
    }

    public String getStr() {
        return str;
    }

    public void setStr(String str) {
        this.str = str;
    }
}