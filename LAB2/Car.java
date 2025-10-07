class Car {
    String brand;
    int year;

    Car(String b, int y){
        brand = b;
        year = y;
    }

    void display(){
        System.out.println("Car : " + brand + " (" + year + ")");
    }
}

public class program1 {
    public static void main(String[] args) {
        Car c1 = new Car("Toyota", 2020);
        Car c2 = new Car("Honda", 2022);

        c1.display();
        c2.display();
    }
}
