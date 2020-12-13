package reusing;

class Instrument {
    public void play() {}
    static void tune(Instrument i) {
        // ...
        i.play();
    }
}

public class Wind extends Instrument {
    public static void main(String[] args) {
        Wind w = new Wind();
        Instrument.tune(w); // 将子类（wind）转成父类（Instrument）的行为，叫做向上转型（upcasting）
    }
}

/**
 * 创建新类时，使用继承还是组合？
 * 确认是否需要从新类向基类进行向上转型，如果必须向上转型，则继承是必要的
 * 反之如果不是必要的，则需要好好考虑一下是否需要继承？
 */