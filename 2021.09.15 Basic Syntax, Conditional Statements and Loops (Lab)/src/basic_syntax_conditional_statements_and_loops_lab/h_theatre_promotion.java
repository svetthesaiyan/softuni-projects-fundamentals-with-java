package basic_syntax_conditional_statements_and_loops_lab;

import java.util.Scanner;

public class h_theatre_promotion 
{
	public static void main(String[] args) 
	{
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the type of day it is when you're planning to visit."+"\n"+"Pick from one of the following: "+"\n"+"- Weekday"+"\n"+"- Weekend"+"\n"+"- Holiday");
		String dayType=scanner.nextLine();
		System.out.print("Enter your age: ");
		int age=Integer.parseInt(scanner.nextLine());
		
		int ticketPrice=0;
		
		switch(dayType)
		{
			case "Weekday":
				if((age>=0 && age<=18) || (age>64 && age<=122))
					ticketPrice=12;
				else if(age>18 && age<=64)
					ticketPrice=18;
				break;
				
			case "Weekend":
				if((age>=0 && age<=18) || (age>64 && age<=122))
					ticketPrice=15;
				else if(age>18 && age<=64)
					ticketPrice=20;
				break;
				
			case "Holiday":
				if(age>=0 && age<=18)
					ticketPrice=5;
				else if(age>18 && age<=64)
					ticketPrice=12;
				else if(age>64 && age<=122)
					ticketPrice=10;
				break;
		}
		
		System.out.println();
		if(age<0 || age>122)
			System.out.print("You're either somehow not born yet or you've miraculously surpassed the current Guinness World Record for oldest person in the world...");
		else
			System.out.print("Your ticket price will be "+ticketPrice+"$");
	}
}
