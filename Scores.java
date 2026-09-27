import java.util.Scanner;

public class Scores{
    public static void main(String[] agrs){

        Scanner input = new Scanner(System.in);

        double sum = 0;
        double average = 0;

        for(int counter = 1; counter <= 10; counter++);
            System.out.println("Enter a score");
            double score = input.nextDouble();
            sum = sum + score;

            average = sum/10;

            System.out.println("sum = " + sum);
            System.out.println("Average " + average);
        }

    }


