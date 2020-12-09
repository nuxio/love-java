package com.nuxio.chapter5;

public class Flower {
    int petalCount = 0;
    String s = "initial value";
    Flower(int petals) {
        petalCount = petals;
        System.out.println("Constructor with int arg only, petalCount = " + petals);
    }
    Flower(String ss) {
        System.out.println("Constructor with String arg only, s = " + ss);
        s = ss;
    }
    Flower(String s, int petals) {
        this(petals);
        //! this(s) // 不能同时调用两次
        System.out.println("String & int args");
    }
    Flower() {
        this("hi", 20);
        System.out.println("default Constructor");
    }
    void printPetalCount() {
        //! this(11); 不能在构造函数之外调用 this
        System.out.println("petalCount is = " + petalCount);
    }
    public static void main(String[] args) {
        Flower x = new Flower();
        x.printPetalCount();
    }
}

/**
 * java 中内存回收
 * 标记-清除：从堆栈和静态存储区出发，遍历所有的引用，找出所有存活的对象并标记，完成标记后，再清理没有标记的对象。清理完后，被清理出来的堆空间不是连续的。
 * 停止-复制：垃圾回收动作开始之前，将程序暂停， 然后将所有存活对象从当前堆赋值到另一个堆，没有被复制的都是垃圾。当对象被复制到新堆时，它们是一个一个挨着的。
 * java的垃圾回收机制会根据以上两种回收的情况和效率来动态的选择。当所有对象都比较稳定时，用标记-清除方法，当标记-清除法造成了很多堆内存中的碎片内存无法得到利用，那么采用停止-复制方法。
 * 同时还会区分大型对象，因为大型对象都是占用单独的块，复制时不会复制稳定的大型对象。
 */
