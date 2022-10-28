import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Original String: ");
        String st = sc.next();
        System.out.print("Specified sequence of char values: ");
        String st1 = sc.next();
        if(st.contains(st1)){
            System.out.println(st1+" inside "+st);
        }else{
            System.out.println(st1+" not in the "+st);
        }
    }
}