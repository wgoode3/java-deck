import java.util.ArrayList;
import java.util.Collections;


public class Deck {

	private ArrayList<Card> _deck;	
	
	public Deck() {
		_deck = new ArrayList<Card>();
		String[] suits = new String[] {"Spades", "Hearts", "Diamonds", "Clubs"};
		String[] values = new String[] {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};
		
		for(String suit: suits) {
			for(String value: values) {				
				_deck.add(new Card(suit, value));
			}
		}
	}
	
	public void shuffle() {
		Collections.shuffle(_deck);
	}
	
	public ArrayList<Card> deal(int numberOfCards) {
		ArrayList<Card> cards = new ArrayList<Card>();
		while(numberOfCards > 0) {
			numberOfCards--;
			cards.add(_deck.get(0));
			_deck.remove(0);
		}
		return cards;
	}
	
	public static void main(String[] args) {
		Deck d1 = new Deck();
		System.out.println(d1._deck);
		d1.shuffle();
		System.out.println(d1._deck);
		ArrayList<Card> player1 = d1.deal(5);
		ArrayList<Card> player2 = d1.deal(5);
		System.out.println(d1._deck);
		player1.get(0).setValue("Emperor");
		System.out.println(player1);
		System.out.println(player2);
		System.out.println(player1.get(0).getValue());
	}
	
}
