import java.util.Scanner;
public class SumDifference {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter first integer: ");
        int firstNumber = input.nextInt();

        System.out.println("Enter second integer: ");
        int secondNumber = input.nextInt();

        int Sum = firstNumber + secondNumber;
        int Difference = firstNumber - secondNumber;
        int product = firstNumber* secondNumber;

        System.out.println(Sum);
        System.out.println(Difference);
        System.out.println(Product) ;    
                       
    }
}


