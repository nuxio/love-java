package access; // 如果不写 package , java 将这种文件看作是默认包的一部分

public class Cake {
    public static void main(String[] args) {
        Pie x = new Pie();
        x.f();
    }
}

