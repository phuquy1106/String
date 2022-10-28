import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input String 1: ");
        String st = sc.next();
        System.out.print("Input String 2: ");
        String st1 = sc.next();

//       int resut = st.compareToIgnoreCase(st1);
//
//        if(resut <0){
//            System.out.println(st+ " is less than "+st1);
//        }else if(resut==0){
//            System.out.println(st+ " is equal t   o "+st1);
//        }else{
//            System.out.println(st+ " is greater than "+st1);
//        }

        if(st.equalsIgnoreCase(st1)){
            System.out.println(st + " alike "+st1);
        }else{
            System.out.println(st + " difference "+st1);
        }
    }
}