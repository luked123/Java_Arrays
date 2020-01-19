import java.util.Scanner;

public class CountOccurenceOfNumbers {
    public static void main(String[] args){
        // Create Scanner Object
        Scanner input = new Scanner(System.in);

        // Create array
        int[] integers = new int[101];

        int number;

        //Prompt user
        System.out.print("Enter the integers between 1 and 100: ");
        while((number = input.nextInt()) != 0){
            integers[number]++;
        }

        // Display occurrences
        displayOccurrences(integers);
    }

    public static void displayOccurrences(int[] integers){
        for(int i = 0; i < integers.length; i++){
            if(integers[i] == 1){
                System.out.printf("%d occurs %d time\n", i, integers[i]);
            }
            else if(integers[i] > 1){
                System.out.printf("%d occurs %d times\n", i, integers[i]);
            }
        }
    }
}
