import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String st;
        System.out.println("Enter a String contain words: ");
        st = sc.nextLine();
        System.out.print("Enter word to find: ");
        String st1 = sc.next().trim();
        System.out.print("Replace by word: ");
        String st2 = sc.next().trim();


        System.out.println("Result: " + st.replace(st1, st2));

    }
}