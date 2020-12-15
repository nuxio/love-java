package polymorphism;

class Super {
    public int field = 0;
    public int getField() {
        return field;
    }
}

class Sub extends Super {
    public int field = 1;
    public int getField() {
        return field;
    }
    public int getSupField() {
        return super.field;
    }
}

public class FieldAccess {
    public static void main(String[] args) {
        // new Sub() 这个动作会创建一个新对象，包含两个 field 字段，一个是子类的，一个是父类的
        Super sup = new Sub();
        // 字段是没有多态的，sup被转型为Super，字段的访问是编译器解析的，没有动态绑定，没有多态，会访问到父类的 field，方法的访问是有多态的
        System.out.println("sup.field=" + sup.field + "; sup.getField()=" + sup.getField());
        Sub sub = new Sub();
        System.out.println("sub.field=" + sub.field + "; sub.getField()=" + sup.getField() + "; sub.getSupField()=" + sub.getSupField());
    }
}

// static 方法也不具有多态性
// 静态方法是与类，而非单个的对象相关联的
