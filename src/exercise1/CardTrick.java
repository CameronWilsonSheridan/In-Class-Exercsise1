package exercise1;
import java.util.Scanner;

/**
 * A class that fills a hand of 7 cards with random Card Objects and then asks the user to pick a card.
 * It then searches the array of cards for the match to the user's card. 
 * To be used as starting code in Exercise
 * @author Cameron Wilson Jan 2023 
 */
public class CardTrick {
    
    public static void main(String[] args) {
        
        Card[] hand = new Card[7];
        Scanner in = new Scanner(System.in);

        for (int i = 0; i < hand.length; i++) {
            Card card = new Card();
            card.setSuit(Card.SUITS[(int)(Math.random()*4)]);
            card.setValue((int)(Math.random()*13 + 1));
            hand[i] = card;
            //card.setValue(insert call to random number generator here)
            // 
            //card.setSuit(Card.SUITS[insert call to random number between 0-3 here])
            // Hint: You can use Random -> random.nextInt(n) to get a random number between 0 and n-1 (inclusive)
            //       Don't worry about duplicates at this point
        }
        
        // insert code to ask the user for Card value and suit, create their card
        // and search the hand here. 
        // Hint: You can ask for values 1 to 10, and then
        //       11 for jack, 12 for queen, etc. (remember arrays are 0-based though)
        //       1 for Hearts, 2 for Diamonds, etc. (remember arrays are 0-based though)
        // 
        // Then loop through the cards in the array to see if there's a match.
        System.out.println("Pick a card, any card (suit (1 for hearts, 2 for diamonds, 3 for spades, and 4 for clubs and value): ");
        Card playerCard = new Card(in.nextInt(), in.nextInt());
        for(int i = 0; i < hand.length; i++){
            if(!playerCard.getSuit().equals(hand[i].getSuit()) && playerCard.getValue() != (hand[i].getValue())){
                System.out.println("Sorry, not your card."
                        + " Next card.");
                if(i == hand.length - 1)
                    System.out.println("Sorry, but it would seem I don't have your card"
                            + ", better luck next time.");
                continue;
            }
            printInfo();
            break;
        }
        // If the guess is successful, invoke the printInfo() method below.
        
    }

    /**
     * A simple method to print out personal information. Follow the instructions to 
     * replace this information with your own.
     * @author Cameron Wilson Jan 2023
     */
    private static void printInfo() {
        //I'm Done!
        System.out.println("Congratulations, you guessed right!");
        System.out.println("My name is Cameron, but you can call me Cam, Cameron or sir");
        System.out.println("My career ambitions:");
        System.out.println("-- Be more active in my academic pursuit");
        System.out.println("-- Have a semester with no violations of academic integrity!");
        System.out.println("My hobbies:");
        System.out.println("-- Gaming");
        System.out.println("-- Cooking");
        System.out.println("-- Watching TV");
        System.out.println("-- Drawing");
    }
}
