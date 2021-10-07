package data_types_and_variables_lab;

import java.util.Scanner;

public class i_centuries_to_minutes
{
	public static void main(String[] args)
	{
		Scanner scanner=new Scanner(System.in);
		System.out.print("Enter a number of centuries which I'll convert into smaller units of time!"+"\n"+"Enter said period of time here: ");
		int centuries=Integer.parseInt(scanner.nextLine());
		int years=centuries*100;
		double days=years*365.2422;
		double hours=days*24;
		double minutes=hours*60;
		 
		System.out.printf("\n"+"%d centuries = %d years = %.0f days = %.0f hours = %.0f minutes", centuries, years, days, hours, minutes);
	}
}
