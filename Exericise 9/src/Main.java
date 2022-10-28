import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input String 1: ");
        String st = sc.next();
        System.out.print("Input String 2: ");
        String st1 = sc.next();

        if(st.equalsIgnoreCase(st1)){
            System.out.println(st + " alike "+st1);
        }else{
            System.out.println(st + " difference "+st1);
        }
    }
}