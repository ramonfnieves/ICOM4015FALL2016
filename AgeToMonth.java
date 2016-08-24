import java.util.Scanner;

public class AgeToMonth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int monthAge, monthIn, yearAge;
		
		Scanner in = new Scanner(System.in);
		System.out.println("Enter your age in months: ");
		
		monthIn = in.nextInt();
		
		yearAge = monthIn/12;
		
		monthAge = monthIn%12;
		
		System.out.println("Your age in years and months is: " +yearAge+ " and " +monthAge+ " months");
		
		in.close();
	}

}
