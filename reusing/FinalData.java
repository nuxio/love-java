package reusing;

import java.util.*;
import static com.nuxio.util.Print.*;

class Value {
    int i;
    public Value (int i) {
        this.i = i;
    }
}

// final 关键词用于声明常量
public class FinalData {
    private static Random rand = new Random(47);
    private String id;
    public FinalData(String id) {
        this.id = id;
    }
    private final int valueOne = 9;
    // 一般常量写作大写
    private static final int VALUE_TWO = 99;
    public static final int VALUE_THREE = 39;
    // 不能是运行时的常量？
    private final int i4 = rand.nextInt(20);
    static final int INT_5 = rand.nextInt(20);
    private Value v1 = new Value(11);
    private final Value v2 = new Value(22);
    // Arrays
    private int[] a = { 1, 2, 3, 4, 5, 6 };
    public String toString() {
        return id + ": " + "i4=" + i4 + ", INT_5=" + INT_5;
    }

    public static void main(String[] args) {
        FinalData f1 = new FinalData("F1");
        //! f1.valueOne++; // 不能改变常量
        f1.v2.i++; // 但是引用的对象可以更改
        f1.v1 = new Value(9);
        for(int i = 0; i < f1.a.length; i++) {
            f1.a[i]++;
        }
        print(f1);
        print("Creating new FinalData");
        FinalData f2 = new FinalData("F2");
        print(f1);
        print(f2);
    }
}
