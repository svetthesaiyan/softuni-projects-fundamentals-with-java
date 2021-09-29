package basic_syntax_conditional_statements_and_loops_exercise;

import java.util.Scanner;

public class j_rage_expenses
{
	public static void main(String[] args)
	{
		Scanner scanner=new Scanner(System.in);
		System.out.print("Enter the amount of games Svet lost in tonight's gaming session: ");
		int gamesLost=Integer.parseInt(scanner.nextLine());
		System.out.print("Enter the individual price for his headset of choice: ");
		double headsetPrice =Double.parseDouble(scanner.nextLine());
		System.out.print("Enter the individual price for his mouse of choice: ");
		double mousePrice   =Double.parseDouble(scanner.nextLine());
		System.out.print("Enter the individual price for his keyboard of choice: ");
		double keyboardPrice=Double.parseDouble(scanner.nextLine());
		System.out.print("Enter the individual price for his monitor of choice: ");
		double monitorPrice =Double.parseDouble(scanner.nextLine());
		
		int brokenHeadsetCount =gamesLost/2;
		int brokenMiceCount    =gamesLost/3;
		int brokenKeyboardCount=gamesLost/6;
		int brokenMonitorCount =gamesLost/12;
		
		double expenses=(brokenHeadsetCount*headsetPrice)+(brokenMiceCount*mousePrice)+(brokenKeyboardCount*keyboardPrice)+(brokenMonitorCount*monitorPrice);
		System.out.printf("\n"+"Svet will have to pay %.2f lv. after all of the peripherals he wound up breaking in a blinding fit of gaming rage tonight...", expenses);
	}
}
