class Complex {
    int r, i;
    // Constructor Overloading
    Complex() {
        r = 0; i = 0;
        }
    Complex(int x, int y) {
        r = x; i = y; 
    }

    // Function Overloading
    Complex add(Complex c) {
        return new Complex(r + c.r, i + c.i);
    }

    Complex add(int x, int y) {
        return new Complex(r + x, i + y);
    }

    Complex subtract(Complex c) {
        return new Complex(r - c.r, i - c.i);
    }

    void show() {
        System.out.println(r + " + " + i + "i");
    }
}

// Inheritance
class MyComplex extends Complex {
    MyComplex(int x, int y) {
        super(x, y);
    }
}

public class Main {
    public static void main(String[] args) {
        MyComplex c1 = new MyComplex(4, 5);
        Complex c2 = new Complex(2, 3);

        Complex sum = c1.add(c2);
        Complex sum2 = c1.add(1, 1);
        Complex diff = c1.subtract(c2);

        sum.show();
        sum2.show();
        diff.show();
    }
}
