package d6;
import java.util.Scanner;

public class Array_2d {
	
		public static void main(String[] args) {
			Scanner scanner = new Scanner(System.in);
			
			System.out.println("enter the no of rows = ");
			int rows = scanner.nextInt();
			System.out.println("enter the no of columns = ");
			int col =scanner.nextInt();
			//initialize
			int[][] arr=new int[rows][col];
			
			//enter array values
			System.out.println("Enter elements in array.....");
			for(int i=0; i<rows; i++)
			{
				for(int j=0; j<col; j++)
				{
					arr[i][j]=scanner.nextInt();
				}
			}
			
			//output
			System.out.println("Array elements are: ");
			for(int i=0; i<rows; i++)
			{
				for(int j=0; j<col; j++)
				{
					System.out.print(arr[i][j]+" ");
				}
				System.out.println();
			}

		}

	}


