//WAP TO PRINT AREA OF SQUARE
import java.util.Scanner;
public class area_of_square {
    public static void main(String[]args){
        try(Scanner sc = new Scanner(System.in)){
            System.out.println("Enter your side");
            int s=sc.nextInt();
            int area=s*s;
            System.out.println("Area fo square=\t"+area);
        }

    }
}
