package com.nuxio.chapter5;

public class Leaf {
    int i; // 1. 会自动初始化为 0
    Leaf() {
        i = 1; // 2. 构造时再被赋值为 1
    }
    Leaf increment() {
        i++;
        return this;
    }

    void print() {
        System.out.println("i = " + i);
    }

    public static void main(String[] args) {
        Leaf x = new Leaf();
        x.increment().increment().increment().print();
    }
}
