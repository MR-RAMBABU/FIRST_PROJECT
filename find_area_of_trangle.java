import java.util.Scanner;
public class find_area_of_trangle {
    public static void main(String[]arga){
        try(Scanner sc = new Scanner(System.in)){
            System.out.println("Enter base of trangle");
            int b = sc.nextInt();
            System.out.println("Enter height of trangel");
            int h = sc.nextInt();
            double area=0.5*b*h;
            System.out.println("Area of trangle=\t"+area);

        }

    }
}
