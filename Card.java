1. import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Scanner;

// Step 1: Define the Card class
class Card {
    private String symbol;
    private String value;

    public Card(String symbol, String value) {
        this.symbol = symbol;
        this.value = value;
    }

    public String getSymbol() {
        return symbol;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return symbol + " " + value;
    }
}

public class CardCollection {
    public static void main(String[] args) {
        // Step 2: Create a Collection to store all the cards
        Collection<Card> cards = new ArrayList<>();

        // Add some cards to the collection
        cards.add(new Card("Hearts", "Ace"));
        cards.add(new Card("Diamonds", "King"));
        cards.add(new Card("Clubs", "Queen"));
        cards.add(new Card("Spades", "Jack"));
        cards.add(new Card("Hearts", "10"));
        cards.add(new Card("Diamonds", "9"));
        cards.add(new Card("Clubs", "8"));
        cards.add(new Card("Spades", "7"));

        // Step 3: Get user input for the symbol to search
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the symbol to search (e.g., Hearts, Diamonds, Clubs, Spades): ");
        String searchSymbol = scanner.nextLine();

        // Step 4: Filter and display cards with the given symbol
        List<Card> filteredCards = filterCardsBySymbol(cards, searchSymbol);

        if (filteredCards.isEmpty()) {
            System.out.println("No cards found with the symbol: " + searchSymbol);
        } else {
            System.out.println("Cards with symbol " + searchSymbol + ":");
            for (Card card : filteredCards) {
                System.out.println(card);
            }
        }
    }

    // Method to filter cards by symbol
    public static List<Card> filterCardsBySymbol(Collection<Card> cards, String symbol) {
        List<Card> filteredCards = new ArrayList<>();
        for (Card card : cards) {
            if (card.getSymbol().equalsIgnoreCase(symbol)) {
                filteredCards.add(card);
            }
        }
        return filteredCards;
    }
}
