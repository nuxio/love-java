package access;

class Soup1 {
    // private 的构造函数，不能直接 new
    private Soup1() {}
    public static Soup1 makeSoup() {
        // 可以在 static 声明中 new
        return new Soup1();
    }
}

class Soup2 {
    private Soup2() {}
    // 可以在 static 声明中 new
    private static Soup2 ps1 = new Soup2();
    public static Soup2 access() {
        return ps1;
    }
    public void f() {}
}

public class Lunch {
    void testPrivate() {
        // private 的构造函数，不能直接 new
        //! Soup1 soup = new Soup1();
    }
    void testStatic() {
        Soup1 soup = Soup1.makeSoup();
    }
    void testSingleton() {
        Soup2.access().f();
    }
}
