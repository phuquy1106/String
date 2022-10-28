import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Original String: ");
        String st = sc.next();
        System.out.print("Specified sequence of char values: ");
        String st1 = sc.next();

        if(st.endsWith(st1)){
            System.out.println(st + " end with " +st1 );
        }else{
            System.out.println(st + " does not end with " +st1 );
        }
    }
}