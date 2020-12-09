package access;

class Sundae {
    private Sundae() {}
    static Sundae makeSundae() {
        return new Sundae();
    }
}

public class IceCream {
    public static void main(String[] args) {
        //! Sundae x = new Sundae();
        Sundae x = Sundae.makeSundae();
    }
}