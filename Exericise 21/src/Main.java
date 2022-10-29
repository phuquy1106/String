import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter full Name: ");
        String st = sc.nextLine();
        System.out.println("Full name: "+(st.replaceAll("\\s+"," ")));
    }
}