package access;

import access.dessert.*;

public class ChocolateChip2 extends Cookie2 {
    public ChocolateChip2() {
        System.out.println("ChocolateChip2 Constructor");
    }
    public void chomp() {
        bite();
    }
    public static void main(String[] args) {
        ChocolateChip2 x = new ChocolateChip2();
        x.chomp();
    }
}
