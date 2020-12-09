package com.nuxio.chapter5;

class Other{
    public static void main(String[] args) {
        for(String s : args) {
            System.out.println(s + " ");
        }
    }
}

public class DynamicArray {
    public static void main(String[] args) {
        Other.main(new String[]{ "fiddle", "de", "dum" });
    }
}
