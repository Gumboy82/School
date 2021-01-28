import java.util.Scanner;
public class TicTacToe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String [][] data = new String[3][3];
		Scanner sc = new Scanner(System.in);
		int pos;
		for(int i = 0;i<data.length;i++)
		{
			for(int j = 0; j<data.length;j++)
			{
				data[i][j] = " ";
			}
		}
		int c = 0;
		while(WinDetection(data) == 0 && c < 9)
		{
			for(int i = 0; i<3;i++)
			{
				for(int j = 0;j<3;j++)
				{
					System.out.print(data[i][j]);
					if(j != 2) {
						System.out.print("|");
					}
					else if(i == 2) {
						System.out.println("\n");
					}
				}
				if(i != 2)
					System.out.println("\n-----"); //2nd and 4th rows lines
			}
			if(c%2 == 0)
			{
				System.out.println("Player 1 where do you want to move? (1-9)");
	
			}
			else {
				System.out.println("Player 2 where do you want to move? (1-9)");
			}
			pos = (sc.nextInt()-1);
			if(data[pos/3][pos%3] == " ") {
				data[pos/3][pos%3] = Add(c);				
				c++;
			}
			else {
				System.out.println("Do not try and move where your opponent moved :)");
			}
				
		}
		for(int i = 0; i<3;i++)
		{
			for(int j = 0;j<3;j++)
			{
				System.out.print(data[i][j]);
				if(j != 2) {
					System.out.print("|");
				}
				else if(i == 2) {
					System.out.println("\n");
				}
			}
			if(i != 2) {
				System.out.println("\n-----"); //2nd and 4th rows lines
			}
		}
		switch(WinDetection(data))
		{
			case 0:
			System.out.println("It's a tie!");
			break;
			case 1:
			System.out.println("Player 1 Wins");
			break;
			case 2:
			System.out.println("Player 2 Wins");
			break;
		}




	}

	public static String Add(int c)
	{
		if (c % 2 == 0)
		{
			return "X";
		}
		else {
			return "O";
		}
	}

	public static int WinDetection(String[][] data)
	{
		int player = 0;
		int s = 0;
		int s2 = 0;
		int pos = 0;

		for(int i = 0; i<3;i++)
		{
			for(int j = 0;j<3;j++)
			{
				switch(data[i][j]) {
					case "X":
					s++;
					break;
					case "O":
					s+=2;
					break;
					default:
					s+=8;
				}
			}
			if (s == 3)
			{
				player = 1;
			}
			else if(s == 6)
			{
				player = 2;
			}
			s = 0;
		}
		for(int i = 0; i<3;i++)
		{
			for(int j = 0;j<3;j++)
			{
				switch(data[j][i]) {
					case "X":
					s++;
					break;
					case "O":
					s+=2;
					break;
					default:
					s+=8;
				}
			}
			if (s == 3)
			{
				player = 1;
			}
			else if(s == 6)
			{
				player = 2;
			}
			s = 0;
		}
		s = 0;
		s2 = 0;
		for (int i = 0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				switch(i) {
					case 0:
					if(i == 0)
						pos = 1;
					if(i == 2)
						pos = 2;
					break;
					case 1:
					pos = 3;
					break;
					case 2:
					if(i == 2)
						pos = 1;
					if(i == 0)
						pos = 2;
				}
				switch(pos) {
					case 1:
					switch(data[j][i]) {
						case "X":
						s++;
						break;
						case "O":
						s+=2;
						break;
						default:
						s+=8;
					}
					break;
					case 2:
					switch(data[j][i]) {
						case "X":
						s2++;
						break;
						case "O":
						s2+=2;
						break;
						default:
						s2+=8;
					}
					case 3:
					switch(data[j][i]) {
						case "X":
						s++;
						s2++;
						break;
						case "O":
						s+=2;
						s2+=3;
						break;
						default:
						s+=8;
						s2+=8;
					}
					System.out.println(s + ", "+s2);
				}
			}
		}
		if (s == 3 || s2 == 3)
		{
			player = 1;
		}
		else if(s == 6 || s2 == 6)
		{
			player = 2;
		}
		s = 0;		


		return player;
	}

}
