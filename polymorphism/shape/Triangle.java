package polymorphism.shape;

import static com.nuxio.util.Print.*;

public class Triangle extends Shape {
    public void draw() {
        print("Triangle.draw()");
    }
    public void erase() {
        print("Triangle.erase()");
    }
}
