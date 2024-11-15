import java.util.Scanner;
public class mul {
    public static void main(String[]args){
        try(Scanner sc =new Scanner(System.in)){
            System.out.println("Enter your first number");
            int a = sc.nextInt();
            System.out.println("Enter your second number");
            int b = sc.nextInt();
            int mul=a*b;
            System.out.println("Multiple=\t"+mul);

        }
    }
}
