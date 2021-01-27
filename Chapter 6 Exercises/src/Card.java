
public class Card {

	private int suit; //1 = spades, 2 = clubs, 3 = hearts, 4 = diamonds
	private int number; //1-10 normal, 11 = jack, 12 = queen, 13 = king
	
	public Card()
	{
		suit = 1;
		number = 1;
	}
	public Card(int s, int n)
	{
		suit = s;
		number = n;
	}
	
	public int getSuit()
	{
		return suit;
	}
	
	public void setSuit(int s)
	{
		suit = s;
	}
	
	public int getNumber()
	{
		return number;
	}
	
	public void setNumber(int n)
	{
		number = n;
	}
	
	public void display()
	{
		String S = "";
		String N = "";
		switch(suit)
		{
		case 1:
			S = "Spades";
			break;
		case 2:
			S = "Clubs";
			break;
		case 3:
			S = "Hearts";
			break;
		case 4:
			S = "Diamonds";
		}
		switch(number)
		{
		case 1:
			N = "Ace";
			break;
		case 11:
			N = "Jack";
			break;
		case 12:
			N = "Queen";
			break;
		case 13:
			N = "King";
			break;
		default:
			N = Integer.toString(number);
		}
		System.out.println("The card is a "+N+" of "+S);
	}
	
}
