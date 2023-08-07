package d4;
import java.util.Scanner;
public class GreatestNumber {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter first number = ");
		int a = scanner.nextInt();
		System.out.println("Enter second number = ");
		int b = scanner.nextInt();
		System.out.println("Enter thrid number = ");
		int c = scanner.nextInt();
		
		if(a>b && a>c) 
			System.out.println(a+" is the greatest number");
		else if (b>a && b>c) 
			System.out.println(b+" is the greatest number");
		else if (c>a && c>b)
			System.out.println(c+" is the greatest number");
		else
			System.out.println("all numbers are equal ");
		

		}
		
	}
	
