import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        String B = sc.next();
        
        if(A.length() == 3 && B.length() == 3){
            int a = Integer.parseInt(A);    
            int b1 = B.charAt(0)- '0';
            int b2 = B.charAt(1)- '0';
            int b3 = B.charAt(2)- '0';
            
            System.out.println(a*b3);
            System.out.println(a*b2);
            System.out.println(a*b1);
            System.out.println(a * Integer.parseInt(B));
            
        }
        

    }
}