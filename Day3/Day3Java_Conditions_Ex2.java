package conditionalStatement;
import java.util.Scanner;
public class Day3Java_Conditions_Ex2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		//empNames
		String emp1= "A";
		String emp2= "B";
		String emp3= "C";
		String emp4= "D";
		String emp5= "E";
		//empIds
		int empid1=1,empid2=2,empid3=3,empid4=4,empid5=5;
		
		//System.out.println("Enter your name  = ");
		//String empName = scanner.nextLine();
		
		System.out.println("enter your empid = ");
		int empid = scanner.nextInt();
		

		if(empid==empid1)
		{
			System.out.println("Welcome "+emp1);
		}
		else if(empid==empid2)
		{
			System.out.println("Welcome "+emp2);
		}
		else if(empid==empid3)
		{
			System.out.println("Welcome "+emp3);
		}
		else if(empid==empid4)
		{
			System.out.println("Welcome "+emp4);
		}
		else if(empid==empid5)
		{
			System.out.println("Welcome "+emp5);
		}
		else
		{
			System.out.println("Sorry , you are not a valid user");
		}
		
	}
	

}
