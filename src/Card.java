
public class Card {

	private String suit;
	private String value;

	public Card(String suit, String value) {
		this.suit = suit;
		this.value = value;
	}
	
	public String toString() {
		return "The " + value + " of " + suit;
	}
	
	public String getSuit() {
		return suit;
	}

	public void setSuit(String suit) {
		this.suit = suit;
	}
	
	public void setValue(String value) {
		if(value == "Emperor") {
			System.out.println("nope!");
			return;
		}
		this.value = value;
	}
	
	public String getValue() {
		return value;
	}
	
}
