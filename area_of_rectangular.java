//WAP TO PRINT AREA OF RECTUNGALE
import java.util.Scanner;
public class area_of_rectangular {
    public static void main(String[]args){
        try(Scanner sc = new Scanner(System.in)){
            System.out.println("Enter hight");
            int h=sc.nextInt();
            System.out.println("Enter width");
            int w=sc.nextInt();
            int area=h*w;
            System.out.println("Area of tectengle=\t"+area);
        }

    }
}
