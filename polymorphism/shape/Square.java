package polymorphism.shape;

import static com.nuxio.util.Print.*;

public class Square extends Shape {
    public void draw() {
        print("Square.draw()");
    }
    public void erase() {
        print("Square.erase()");
    }
}
