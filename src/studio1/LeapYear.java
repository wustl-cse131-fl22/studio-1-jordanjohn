package studio1;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("enter a year");
		int year = in.nextInt();
		boolean divisibleBy4 = (year % 4) == 0;
		boolean notDivisibleBy100 = (year%100) != 0;
		boolean divisibleBy400 = (year % 400) == 0;
		boolean leapYear = divisibleBy4 && notDivisibleBy100 || divisibleBy400;
		System.out.println(leapYear);
		
				
		
		
	}

}
