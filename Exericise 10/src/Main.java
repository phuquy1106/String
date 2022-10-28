import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Input String 1: ");
        String st = sc.next();
        System.out.println("Input String 2: ");
        String st1 = sc.next();

        System.out.println("The concatenated string: " + st.concat(st1));
    }
}