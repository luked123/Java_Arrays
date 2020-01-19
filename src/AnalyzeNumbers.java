import java.util.Scanner;

public class AnalyzeNumbers {
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        // Prompt the user
        System.out.print("Enter the number of Items: ");
        int n = input.nextInt();
        double[] numbers = new double[n];
        double sum = 0;

        System.out.print("Enter the numbers: ");
        for(int i = 0; i < n; i++){
            numbers[i] = input.nextDouble();
            sum += numbers[i];
        }

        double average = sum / n;

        int count = 0;
        for(double e: numbers){
            if(e > average){
                count ++;
            }
        }

        System.out.printf("Average is %f\n", average);
        System.out.printf("The amount of elements above the average is %d", count);
    }
}
