package session2;

import java.util.Scanner;

public class Assignment4 {

	public static void main(String[] args) {
		String month;
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Month : ");
		month = s.next();
		
		switch (month)
		{
		case "January":  System.out.println("January has 31 days"); break;
		case "February":  System.out.println("February has 28 days"); break;
		case "March":  System.out.println("March has 31 days"); break;
		case "April":  System.out.println("April has 30 days"); break;
		case "May":  System.out.println("May has 31 days"); break;
		case "June":  System.out.println("June has 30 days"); break;
		case "July":  System.out.println("July has 31 days"); break;
		case "August":  System.out.println("August has 31 days"); break;
		case "September":  System.out.println("September has 30 days"); break;
		case "October":  System.out.println("October has 31 days"); break;
		case "November":  System.out.println("November has 30 days"); break;
		case "December":  System.out.println("December has 31 days"); break;
		default: System.out.println("Incorrect Option");
		
		}

	}

}
