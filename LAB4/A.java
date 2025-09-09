class A {
     A() {
        System.out.println("hello i am class A");
    }
}

class B extends A {
    B() {
        System.out.println("hello i am class B");
    }
}
class C extends B {
    C() {
        System.out.println("hello i am class C");
    }
}
public class Main {
    public static void main(String[] args) {
        C obj = new C(); 
    }
}
