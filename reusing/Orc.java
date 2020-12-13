package reusing;

import static com.nuxio.util.Print.*;

// 恶棍？
class Villain {
    private String name;
    protected void set(String n) {
        name = n;
    }
    public Villain(String name) {
        this.name = name;
    }
    public String toString() {
        return "I'm a Villain and my name is " + name;
    }
}

// orc 兽人...
public class Orc extends Villain {
    private int orcNumber;
    public Orc(String name, int orcNumber) {
        super(name);
        this.orcNumber = orcNumber;
    }
    public void change(String name, int orcNumber) {
        set(name); // 因为父类的set是protected
        this.orcNumber = orcNumber;
    }
    public String toString() {
        return "Orc " + orcNumber + ": " + super.toString();
    }

    public static void main(String[] args) {
        Orc orc = new Orc("Limburger", 12);
        print(orc);
        orc.change("Bob", 19);
        print(orc);
    }
}
