import java.util.Scanner;
public class AreaOfCircle{

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.print(" Enter Radius: ");
        double radius = input.nextInt();

        double  pie = 3.14159265359;
        double area = pie * radius * radius;

        System.out.println("The Area of Cricle is %. 2f%n,area");
        
      }
   }

