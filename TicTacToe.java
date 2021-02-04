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
		int lr = 0;
		int rl = 0;

		for(int i = 0; i<3;i++)
		{
			for(int j = 0;j<3;j++)
			{
				if(i == 1 && j == 1) {
					switch(data[i][j]) {
						case "X":
						lr++;
						rl++;
						break;
						case "O":
						lr+=2;
						rl+=2;
						break;
						default:
						lr+=8;
						rl+=8;
					}
				}
				else if(i == j) {
					switch(data[i][j]) {
						case "X":
						lr++;
						break;
						case "O":
						lr+=2;
						break;
						default:
						lr+=8;
					}
				}
				else if((Math.abs(j-i) == 2)) {
					switch(data[i][j]) {
						case "X":
						rl++;
						break;
						case "O":
						rl+=2;
						break;
						default:
						rl+=8;
					}
				}
					
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

		if (lr == 3)
		{
			player = 1;
		}
		else if(lr == 6)
		{
			player = 2;
		}
		if(rl == 3)
		{
			player = 1;
		}
		else if(rl == 6)
		{
			player = 2;
		}
		s = 0;
		lr = 0;
		rl = 0;		


		return player;
	}

}
