import java.util.Scanner;

public class Grade{
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a Grade: ");
        int number = input.nextInt();

        if (number > 90 || number == 100){
                System.out.println("Grade A");
        }

        else if (number > 80 || number == 89){
                System.out.println("Grade B");
        }

        else if (number > 70 || number == 79){
                System.out.println("Grade C");
        }

        else if (number > 60 || number == 69){
                System.out.println("Grade D");
        }

        else{
                System.out.println("Grade F");
        }
    }
}
