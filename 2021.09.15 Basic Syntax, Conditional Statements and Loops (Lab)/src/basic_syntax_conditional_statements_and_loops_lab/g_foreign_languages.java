package basic_syntax_conditional_statements_and_loops_lab;

import java.util.Scanner;

public class g_foreign_languages 
{
	public static void main(String[] args) 
	{
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the country you're planning to visit and I'll tell you what language you need to know!"+"\n"+"Pick from one of the following: "+"\n"+"- USA"+"\n"+"- UK"+"\n"+"- Spain"+"\n"+"- Argentina"+"\n"+"- Mexico");
		String country=scanner.nextLine();
		System.out.println();
		
		switch(country)
		{
			case "USA":
			case "UK":
				System.out.print("You need to know English if you plan on visiting the "+country+".");
				break;
			case "Spain":
			case "Argentina":
			case "Mexico":
				System.out.print("You need to know Spanish if you plan on visiting "+country+".");
				break;
			default:
				System.out.print("You entered an unknown location.");					
				break;
		}
	}
}
