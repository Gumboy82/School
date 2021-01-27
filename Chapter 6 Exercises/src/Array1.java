import java.util.Scanner;
public class Array1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[51];
		
		for(int i = 0; i < arr.length; i++)
			arr[i] = 0;
		
		int i = 0;
		Scanner sc = new Scanner(System.in);
				
		while(i != -1)
		{
			System.out.println("Enter in a number bewteen 0 and 50 inclusive (-1 to stop)");
			i = sc.nextInt();
			if (i<0) {
			}	
			else
				arr[i]++;
		}
		
		for(int j = 0; j < arr.length; j++)
		{
			if (arr[j] > 0)
				System.out.println("The number "+j+" was entered "+arr[j]+" times");
		}
		
	}

}
