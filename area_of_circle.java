//wap to print area of square
import java.util.Scanner;
public class area_of_circle {
    public static void main(String[]args){
        try(Scanner sc =new Scanner(System.in)){
            System.out.println("Enter redius fo circle");
            int r=sc.nextInt();
            double area=3.14*r*r;
            System.out.println("Area of square=\t"+area);
        }

    }
}