import java.util.Scanner;

public class BeanMachine {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int numberOfBalls;
        int numberOfSlots;

        // Prompt User
        System.out.print("Enter the number of balls to drop: ");
        numberOfBalls = input.nextInt();
        System.out.print("Enter the number of slots in the bean machine: ");
        numberOfSlots = input.nextInt();

        // Get ball simulation
        int[] slots = simulatedBalls(numberOfBalls, numberOfSlots);

        // Prints the histogram of the simulated balls
        displayBoard(slots);

    }

    /** Prints the path of the ball if it went Right or left and returns True or False */
    public static boolean ballWentRight(){
        if(Math.random() > .5){
            System.out.print("R");
            return true;
        }
        System.out.print("L");
        return false;
    }

    /** Simulates dropping x number of balls into  a bean machine with x number of slots */
    public static int[] simulatedBalls(int numberOfBalls, int numberOfSlots){
        int[] slots = new int[numberOfSlots];
        for(int ball = 0; ball < numberOfBalls; ball++){
            System.out.println(); //Separates path of each ball
            int position = 0;
            for(int peg = 0; peg < numberOfSlots -1; peg++){
                if(ballWentRight()){
                    position++;
                }
            }
            slots[position]++;
        }
        return slots;
    }

    /** Finds the fullest slot */
    public static int findMax(int[] slots){
        int max = slots[0];
        for(int i : slots){
            if(max < i){
                max = i;
            }
        }
        return max;
    }

    /** Displays a histogram of the board */
    public static void displayBoard(int[] slots){
        int max = findMax(slots);
        for(int i = 0; i < max; i++){
            System.out.println();
            for (int slot : slots) {
                if (slot >= max - i) {
                    System.out.print("O");
                } else {
                    System.out.print(" ");
                }
            }
        }
    }
}
