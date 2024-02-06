package exercise1;

import java.util.Random;
import java.util.Scanner;
/**
 * A class that fills a hand of 7 cards with random Card Objects and then asks the user to pick a card.
 * It then searches the array of cards for the match to the user's card. 
 * To be used as starting code in Exercise
 *
 * @author dancye
 * @author Paul Bonenfant Jan 25, 2022 
 */
public class CardTrick {
    
    public static void main(String[] args) {
        
        Card[] hand = new Card[7];

        for (int i = 0; i < hand.length; i++) {
            Card card = new Card();
            card.setValue(generateRandomValue());
            card.setSuit(Card.SUITS[generateRandomSuit()]);
            hand[i] = card;
            //card.setValue(insert call to random number generator here)
            // 
            //card.setSuit(Card.SUITS[insert call to random number between 0-3 here])
            // Hint: You can use Random -> random.nextInt(n) to get a random number between 0 and n-1 (inclusive)
            //       Don't worry about duplicates at this point
        }
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your card value (1-13): ");
        
        int userValue = scanner.nextInt();
        System.out.print("Enter your card suit (0-3): ");
        int userSuit = scanner.nextInt();
        
        
        Card userCard = new Card();
        userCard.setValue(userValue);
        userCard.setSuit(Card.SUITS[userSuit]);
        
        boolean match = false;
        for(Card card : hand){
            if (card.equals(userCard)){
                match = true;
                break;
            }
        }
        
        if (match){
            System.out.println("Congradulations! Your guess is correct.");
            CardTrick.printInfo();
        } else {
            System.out.println("Sorry, no match found for your card.");
        }
    }
        // insert code to ask the user for Card value and suit, create their card
        // and search the hand here. 
        // Hint: You can ask for values 1 to 10, and then
        //       11 for jack, 12 for queen, etc. (remember arrays are 0-based though)
        //       1 for Hearts, 2 for Diamonds, etc. (remember arrays are 0-based though)
        // 
        // Then loop through the cards in the array to see if there's a match.
        
        // If the guess is successful, invoke the printInfo() method below.
    
    private static int generateRandomValue(){
        Random random = new Random();
        return random.nextInt(13) + 1;
    }
    
    private static int generateRandomSuit(){
        Random random = new Random();
        return random.nextInt(4);
    }

    /**
     * A simple method to print out personal information. Follow the instructions to 
     * replace this information with your own.
     * @author Syed Shah February 2024
     */
    private static void printInfo() {
    
        System.out.println("Congratulations, you guessed right!");
        
        System.out.println("My name is Syed Shah");
        
        System.out.println("I am a second year Computer Programming student with 3 Java Classes Completed.");

        System.out.println("My hobbies:");
        System.out.println("-- Investing");
        System.out.println("-- Playing Videogames");
        System.out.println("-- Spending time with friends and family");
    
    }

}
