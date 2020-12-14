package reusing;

class Poppet {
    private int i;
    // 只在明确的禁止覆盖时，才将方法设置为final
    final void f() {
        System.out.println("Poppet.f()");
    }
    Poppet(int ii) {
        i = ii;
        ii = 3;
        System.out.println("ii = " + ii);
    }
}

public class BlankFinal {
    private final int i = 0;
    private final int j; // 空白final 为常量的使用提供了更大的灵活性
    private final Poppet p;

    public BlankFinal() {
        // 空白 final 必须在构造函数内初始化
        j = i;
        p = new Poppet(1);
    }
    // 可以指定参数是 final，则不可变更
    public BlankFinal(final int x) {
        j = x;
        p = new Poppet(x);
        //! x = 2;
    }

    public static void main(String[] args) {
        new BlankFinal();
        new BlankFinal(2);
    }
}
