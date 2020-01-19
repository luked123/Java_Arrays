import java.util.Scanner;

public class DeckOfCards {
    public static void main(String[] args){
        int[] deck = new int[52];
        String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};
        String[] suits = {"Spades", "Hearts", "Diamonds", "Clubs"};

        // Initialize the deck;
        System.out.println("Opening new deck");
        for(int i = 0; i < deck.length; i++){
            deck[i] = i;
        }

        // Random Shuffle
        System.out.println("Shuffling deck");
        for(int i = 0; i < deck.length; i++){
            int index = (int) (Math.random() * deck.length);
            int temp = deck[i];
            deck[i] = deck[index];
            deck[index] = temp;
        }

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the amount of cards you want drawn: ");
        int draw = input.nextInt();

        System.out.printf("Your hand of %d cards is\n\n", draw);
        for(int card = 0; card < draw; card++){
            String rank = ranks[deck[card] % 13];
            String suit = suits[deck[card] / 13];
            System.out.printf("The %s of %s\n", rank, suit);
        }
    }
}
