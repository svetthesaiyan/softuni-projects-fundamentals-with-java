package basic_syntax_conditional_statements_and_loops_exercise;

import java.util.Scanner;

public class c_vacation
{
	public static void main(String[] args)
	{
		Scanner scanner=new Scanner(System.in);
		System.out.print("Enter the amount of people that'll be going on vacation: ");
		int peopleAmount=Integer.parseInt(scanner.nextLine());
		System.out.println("Pick the type of people that'll be going on holiday."+"\n"+"You can choose from:"+"\n"+"- Students"+"\n"+"- Business"+"\n"+"- Regular");
		String groupType=scanner.nextLine();
		System.out.println("Pick the day on which the group will be staying over at the hotel."+"\n"+"You can choose from:"+"\n"+"- Friday"+"\n"+"- Saturday"+"\n"+"- Sunday");
		String dayType=scanner.nextLine();
		
		double pricePerNight=0;
		
		switch(dayType)
		{
			case "Friday":
				switch(groupType)
				{
					case "Students":
						pricePerNight=8.45;
						break;
					case "Business":
						pricePerNight=10.90;
						break;
					case "Regular":
						pricePerNight=15;
						break;
				}
				break;
				
			case "Saturday":
				switch(groupType)
				{
					case "Students":
						pricePerNight=9.8;
						break;
					case "Business":
						pricePerNight=15.6;
						break;
					case "Regular":
						pricePerNight=20;
						break;
				}
				break;
				
			case "Sunday":
				switch(groupType)
				{
					case "Students":
						pricePerNight=10.46;
						break;
					case "Business":
						pricePerNight=16;
						break;
					case "Regular":
						pricePerNight=22.5;
						break;
				}
				break;
		}
		double totalPrice=pricePerNight*peopleAmount;
		
		if(groupType.equals("Students") && peopleAmount>=30)
			totalPrice*=0.85;
		else if(groupType.equals("Business") && peopleAmount>=100)
			totalPrice-=(10*pricePerNight);
		else if(groupType.equals("Regular") && (peopleAmount>=10 && peopleAmount<=20))
			totalPrice*=0.95;
		
		System.out.printf("\n"+"The total price for your group's one-night stay at our hotel is: %.2f", totalPrice);
	}
}
