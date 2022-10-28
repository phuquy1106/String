import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Input String: ");
        String st = sc.next();

        System.out.print("Input n: ");
        int n = sc.nextInt();

        char index = st.charAt(n);
        System.out.printf("The character at position %d is: %c",n,index);
    }
}