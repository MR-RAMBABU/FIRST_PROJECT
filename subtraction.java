import java.util.Scanner;
public class subtraction {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner (System.in)) {
            System.out.println("Enter first no");
            int a =sc.nextInt();
            System.out.println("Enter second no");
            int b=sc.nextInt();
            int sub=a-b;
            System.out.print("Subtraction=\t"+sub);
            
        }

    }
}
