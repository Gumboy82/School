import java.util.Scanner;
public class Chart2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[10];
		Scanner sc = new Scanner(System.in);
		
		for(int i = 0; i < arr.length; i++)
			arr[i] = 0;
		
		int i = 0;
		int j = 0;
		while (i != -1) {
			System.out.println("Enter in a number 1-100 (-1 to stop)");
			i = sc.nextInt();
			if (i<1) {
				
			}
			else {
				if (i%10 == 0)
					j = (i/10) - 1;
				else
					j = i/10;
				arr[j]++;				
			}
		}
		for (i = 0;i<arr.length; i++)
		{
			System.out.print(((i*10)+1)+"-"+((i+1)*10)+"\t| ");
			for (j = 0;j<(arr[i]/5); j++)
				System.out.print("*");
			System.out.println();				
		}
			
			
	}

}
