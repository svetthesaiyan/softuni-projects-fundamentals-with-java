package basic_syntax_conditional_statements_and_loops_lab;

import java.util.Scanner;

public class d_back_in_30_minutes
{
	public static void main(String[] args)
	{
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the time at which the employee's break starts.");
		System.out.print("Hour(s): ");
		int hours=Integer.parseInt(scanner.nextLine());
		System.out.print("Minute(s): ");
		int minutes=Integer.parseInt(scanner.nextLine());

		int totalTimeInMinutes=(hours*60)+minutes;
		int timeAfter30Minutes=totalTimeInMinutes+30;

		int finalHour=timeAfter30Minutes/60;
		int finalMinutes=timeAfter30Minutes%60;

		if(finalHour>=24)	// в случай че почивката е почнала в периода 23:30 - 23:59
			finalHour=0;

		System.out.printf("\n"+"(S)he'll be back at %d:%02d", finalHour, finalMinutes);
	}
}
