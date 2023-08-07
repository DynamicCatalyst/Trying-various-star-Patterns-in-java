package dataTypesAndVariables;
import java.util.Scanner;
public class DataTypesAndVariables {

	public static void main(String[] args) {
		//variable declaration
		//primitive
		int a=20;
		int b=30;
		//non primitive
		String name = "Raman";
		//printing, output
		System.out.println(123);
		System.out.println(12.2);
		System.out.println(name);
		System.out.println(90.2);
		
		//taking input and printing it 
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter you name = ");
		String birthdayName = scanner.nextLine();
		System.out.println("enter you Age = ");
		int age = scanner.nextInt();
		
		System.out.println("Happy Birthday"+ birthdayName + "!");
		System.out.println("you age is "+ age);
		}
	}


