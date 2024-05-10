//Colton Dean
//this is my final project
//this is for my programming softwar class
    import java.util.ArrayList;
    import java.util.Collections;
    import java.util.List;
    import java.util.Random;
    import java.util.Scanner;
        
        public class CardsTest {
            private static final int NUM_PLAYERS = 2; //tells how many players there will be
            private static final int NUM_CARDS_PER_PLAYER = 7; //starter cards each player gets
        
            public static void main(String[] args) {
                List<String> deck = createShuffledDeck();
                List<List<String>> playersHands = dealCards(deck, NUM_PLAYERS);
        
                playGoFish(playersHands);
            }
        
            public static List<String> createShuffledDeck() {
                List<String> deck = new ArrayList<>();
                String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"}; //each house for the cards
                String[] ranks = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"}; //all the different types of cards
        
                for (String suit : suits) {
                    for (String rank : ranks) {
                        deck.add(rank + " of " + suit);
                    }
                }
        
                Collections.shuffle(deck); 
                return deck;
            }
        
            public static List<List<String>> dealCards(List<String> deck, int numPlayers) {
                List<List<String>> playersHands = new ArrayList<>();
        
                for (int i = 0; i < numPlayers; i++) {
                    List<String> hand = new ArrayList<>();
                    for (int j = 0; j < NUM_CARDS_PER_PLAYER; j++) {
                        hand.add(deck.remove(0));
                    }
                    playersHands.add(hand);
                }
        
                return playersHands;
            }
        
            public static void playGoFish(List<List<String>> playersHands) {
                Scanner scanner = new Scanner(System.in);
                int currentPlayer = 0;
        
                while (!deckIsEmpty(playersHands)) {
                    System.out.println("Player " + (currentPlayer + 1) + "'s turn:");
                    System.out.print("Ask for a card (enter a rank): "); //what card you will ask for
                    String requestedRank = scanner.nextLine();
        
                    int opponent = (currentPlayer + 1) % NUM_PLAYERS;
                    List<String> opponentHand = playersHands.get(opponent);
        
                    if (opponentHand.contains(requestedRank)) {
                        System.out.println("You got it! Taking cards from Player " + (opponent + 1)); //if you guess the right card
                        playersHands.get(currentPlayer).addAll(opponentHand);
                        opponentHand.remove(requestedRank);
                    } else {
                        System.out.println("Go Fish! Drawing a card from the deck."); //if you guess the wrong cardS
                        playersHands.get(currentPlayer).add(playersHands.get(0).remove(0));
                    }
        
                    currentPlayer = (currentPlayer + 1) % NUM_PLAYERS;
                }
            }
        
            public static boolean deckIsEmpty(List<List<String>> playersHands) {
                return playersHands.get(0).isEmpty();
            }
        }