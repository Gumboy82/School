import java.util.ArrayList;

public class DeckOfCards {
	private int s = 1;
	private int n = 1;
	Card[] deck = new Card[52];
	ArrayList<Integer> order = new ArrayList();
	
	public DeckOfCards()
	{
		for(int i = 0;i<deck.length;i++)
		{
			if(n == 14)
			{
				s++;
				n = 1;
			}
			deck[i] = new Card(s,n);
			n++;
			order.add(i);
		}
	}
	
	public void display()
	{
		int c;
		for(int i = 0; i<order.size(); i++)
		{
			c = order.get(i);
			System.out.println("Suit: "+deck[c].getSuit()+", Number: "+deck[c].getNumber()+", Order: "+i);
			
		}
	}
	
	public Card drawCard()
	{
		int c = order.get(0);
		order.remove(0);
		return deck[c];
		
	}
	
	public int deckSize()
	{
		return order.size();
	}
	
	public void Shuffle()
	{
		ArrayList<Integer> pile1 = new ArrayList(1);
		ArrayList<Integer> pile2 = new ArrayList(1);
		ArrayList<Integer> pile3 = new ArrayList(1);
		ArrayList<Integer> pile4 = new ArrayList(1);
		for(int i = 0; i <order.size(); i++) //Separates the deck into 4 piles
		{
			int pile = i % 4;
			switch(pile)
			{
			case 0:
				pile1.add(order.get(i));
				break;
			case 1:
				pile2.add(order.get(i));
				break;
			case 2:
				pile3.add(order.get(i));
				break;
			case 3:
				pile4.add(order.get(i));
			}					
		}
		order.clear();
		
		order.addAll(pile2);
		order.addAll(pile4);
		order.addAll(pile3);
		order.addAll(pile1);
	}
	
	public void resetDeck()
	{
		order.clear();
		for(int i = 0; i<deck.length; i++)
			order.add(i);
	}
	
	
}
