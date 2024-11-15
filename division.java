import java.util.Scanner;
public class division {
    public static void main(String[]args){
        try(Scanner sc = new Scanner(System.in)){
            System.out.println("Enter your first number");
            int f=sc.nextInt();
            System.out.println("Enter your second number");
            int s=sc.nextInt();
            int d=f/s;
            System.out.println("Devision=\t"+d);

        }


    }
}
