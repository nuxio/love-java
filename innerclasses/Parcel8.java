package innerclasses;

public class Parcel8 {
    public Wrapping wrapping(int x) {
        // 匿名内部类
        return new Wrapping(x) {
            {
                // 通过显示的实例初始化，模拟构造函数
                System.out.println("init");
            }
            public int value() {
                return super.value() * 47;
            }
        };
    }

    public static void main(String[] args) {
        Parcel8 p = new Parcel8();
        Wrapping w = p.wrapping(10);
        System.out.println(w.value());
    }
}
