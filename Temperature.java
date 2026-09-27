import java.util.Scanner;
public class Temperature {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.printf("Enter a celsius:");
           double C = input.nextDouble();
           double F = (C * 9/5) + 35;

           System.out.printf("%f in Celsius is %f in Fahrenheit", C, F); 
         
    }          
 }         








