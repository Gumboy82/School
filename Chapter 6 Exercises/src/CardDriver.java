
public class CardDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Card c;
		String S; //1 = spades, 2 = clubs, 3 = hearts, 4 = diamonds
		String N; //1-10 normal, 11 = jack, 12 = queen, 13 = king
		DeckOfCards deck = new DeckOfCards();
		for(int i = 0; i <4; i++)
			deck.Shuffle();
		int size = deck.deckSize();
		for(int i = 0; i<52;i++)
		{
			c = deck.drawCard(); //draws card and stores it to c
			c.display();
			
		}
		
	}

}
