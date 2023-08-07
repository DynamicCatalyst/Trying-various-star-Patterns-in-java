package conditionalStatement;
import java.util.Scanner;
public class Day3Java_Conditions_Ex1 {

	public static void main(String[] args) {
		//conditionalStatements
		Scanner scanner = new Scanner(System.in);
		int myid= 103;
		
		System.out.println("Pleanse enter your id here = ");
		int userid= scanner.nextInt();
		
		if(userid==myid){
			
			System.out.println("welcome");
		}
		else {
			System.out.println("Invalid user");
		}

	}

}
