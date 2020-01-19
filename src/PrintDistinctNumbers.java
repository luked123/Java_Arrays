import java.util.Arrays;
import java.util.Scanner;

public class PrintDistinctNumbers {
    public static void main(String[] args) {
        // Create Scanner
        Scanner input = new Scanner(System.in);

        int[] array = new int[10];
        int number;

        // Prompt user
        System.out.print("Enter ten numbers: ");
        for(int i = 0; i < array.length; i++){
            if(!contains(array, (number = input.nextInt()))){
                array[i] = number;
            }
        }

        int count = count(array);
        System.out.printf("The number of distinct numbers is %d\n", count);
        System.out.print("The distinct numbers are: ");
        for(int i : array){
            if(i > 0){
                System.out.printf("%d ", i);
            }
        }
        System.out.println();
    }

    public static boolean contains(int[] array, int key){
        for(int i: array){
            if(i == key){
                return true;
            }
        }
        return false;
    }

    public static int count(int[] array){
        int count = 0;
        for(int i : array){
            if(i > 0){
                count++;
            }
        }
        return count;
    }
}
