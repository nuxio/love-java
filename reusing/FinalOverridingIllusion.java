package reusing;

import static com.nuxio.util.Print.*;

// final 类， 不允许继承
final class FinalClass {
    int i = 7;
}

class WithFinals {
    // private 默认就是 final 的，因为在外部无法取用/修改private修饰的方法或者变量，所以在 private 后写 final 其实多余的操作
    private final void f() {
        print("WithFinals.f()");
    }
    // 默认就是 final 的，写成这样就好
    private void g() {
        print("WithFinals.g()");
    }
}

class OverridingPrivate extends WithFinals {
    // 这里并不是覆盖了父类的方法，而是新建了一个同名的方法
    private final void f() {
        print("OverridingPrivate.f()");
    }
    // 这里并不是覆盖了父类的方法，而是新建了一个同名的方法
    private void g() {
        print("OverridingPrivate.g()");
    }
}

class OverridingPrivate2 extends OverridingPrivate {
    // 这里并不是覆盖了父类的方法，而是新建了一个同名的方法
    public final void f() {
        print("OverridingPrivate2.f()");
    }
    // 这里并不是覆盖了父类的方法，而是新建了一个同名的方法
    public void g() {
        print("OverridingPrivate2.g()");
    }
}

public class FinalOverridingIllusion {
    public static void main(String[] args) {
        OverridingPrivate2 op2 = new OverridingPrivate2();
        op2.f();
        op2.g();

        OverridingPrivate op = op2;
        WithFinals wf = op2;
    }
}
