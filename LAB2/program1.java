
public class program1 {
    String name;
    int age;

    void displayInfo() {
        System.out.println("Name : " + name + ", Age : " + age);
    }

    public static void main(String[] args) {
        program1 s1 = new program1();
        s1.name = "John";
        s1.age = 20;
        s1.displayInfo();
    }
}
