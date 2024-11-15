//WAP TO FIND SIMPLE INTREST 
import java.util.Scanner;
public class find_simple_intrest {
    public static void main(String[]args){
        try(Scanner sc = new Scanner(System.in)){
            System.out.println("Enter principal");
            int p=sc.nextInt();
            System.out.println("Enter rate");
            int r=sc.nextInt();
            System.out.println("Enter time");
            int t=sc.nextInt();
            double si=(p*r*t)/100;
            System.out.println("Simple intrest=\t"+si);
        }

    }
}
