public class Concatenate {
    public static void main(String[] args) {
        if (args.length != 3) {
            System.out.println("Usage: java Concatenate param1 param2 param3");
        } else {
            String result = args[0] + args[1] + args[2];
            System.out.println("Concatenated: " + result);
        }
    }
}
