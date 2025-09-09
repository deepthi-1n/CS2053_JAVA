class A {
    int add(int a, int b) { 
        return a + b;
        }
    double add(double a, double b) {
        return a + b;
        }
}

class B extends A {
    String add(String s1, String s2) { 
        return s1 + s2; 
    }
}

public class Main {
    public static void main(String[] args) {
        B obj = new B();
        System.out.println(obj.add(5, 10));
        System.out.println(obj.add(3.5, 2.5));
        System.out.println(obj.add("Hello, ", "World!"));
    }
}
