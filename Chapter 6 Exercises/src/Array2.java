import java.util.Scanner;
public class Array2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[51];
		
		for(int i = 0; i < arr.length; i++)
			arr[i] = 0;
		
		int i = 0;
		Scanner sc = new Scanner(System.in);
				
		while(i != 26)
		{
			System.out.println("Enter in a number bewteen -25 and 25 inclusive (26 to stop)");
			i = sc.nextInt();
			if (i == 26) {
			}	
			else
				arr[i+25]++;
		}
		
		for(int j = 0; j < arr.length; j++)
		{
			if (arr[j] > 0)
				System.out.println("The number "+(j-25)+" was entered "+arr[j]+" times");
		}
		
	}

}
