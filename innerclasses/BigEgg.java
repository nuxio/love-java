package innerclasses;

import static com.nuxio.util.Print.*;

class Egg {
    private Yolk y;
    protected class Yolk {
        public Yolk() {
            print("Egg.Yolk()");
        }
    }
    public Egg() {
        print("New Egg");
        y = new Yolk();
    }
}

public class BigEgg extends Egg {
    public Yolk y1;
    public class Yolk {
        public Yolk() {
            print("BigEgg.Yolk()");
        }
    }
    public BigEgg() {
        print("New BigEgg");
        y1 = new Yolk();
    }

    public static void main(String[] args) {
        new BigEgg();
    }
}
