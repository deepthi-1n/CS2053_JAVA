import java.util.Scanner;

public class even_odd_checker {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int number = sc.nextInt();
        if (number % 2 == 0){
            System.out.println(number + " is even.");
        } else {
            System.out.println(number + " is odd.");
        }
        sc.close();
    }
}
