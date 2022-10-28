import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Input String 1: ");
        String st = sc.next();
        System.out.print("Input String 2: ");
        String st1 = sc.next();

        if(st.equals(st1)){
            System.out.println(st + " same data "+st1);
        }else{
            System.out.println(st + " not the same data "+st1);
        }
    }
}