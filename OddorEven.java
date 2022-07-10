import java.util.Scanner;

public class OddorEven {

	public String scan() {
		int number, remainder;
		System.out.println("Enter Integer:");
		Scanner scan = new Scanner(System.in);
		number = scan.nextInt();
		scan.close();
		
		remainder = number % 2;
				
		if(remainder == 0)
			System.out.println(number+" is an Even Number");
		
		else
			System.out.println(number+" is an Odd Number");
		
	return null;
	
	}
	
}