package innerclasses;

interface Destination{
    String readLabel();
}

interface Content {
    int value();
}

class Parcel {
    private class PContent implements Content {
        private int i = 11;

        @Override
        public int value() {
            return i;
        }
    }
    protected class PDestination implements Destination {
        private String label;

        private PDestination(String whereTo) {
            label = whereTo;
        }

        @Override
        public String readLabel() {
            return label;
        }
    }
    public Destination destination(String s){
        return new PDestination(s);
    }
    public PContent content() {
        return new PContent();
    }
}

public class TestParcel {
    public static void main(String[] args) {
        Parcel p = new Parcel();
        Content c = p.content();
        Destination d = p.destination("Moon");
    }
}