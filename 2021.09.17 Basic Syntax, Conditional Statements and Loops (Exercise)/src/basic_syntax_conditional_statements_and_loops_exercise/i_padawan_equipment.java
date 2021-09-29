package basic_syntax_conditional_statements_and_loops_exercise;

import java.util.Scanner;

public class i_padawan_equipment
{
	public static void main(String[] args)
	{
		Scanner scanner=new Scanner(System.in);
		System.out.print("Enter the film's budget: ");
		double budget		  =Double.parseDouble(scanner.nextLine());
		System.out.print("Enter the amount of actors taking part in the movie: ");
		int actorAmount       =Integer.parseInt(scanner.nextLine());
		System.out.print("Enter the individual price of each lightsaber prop: ");
		double lightsaberPrice=Double.parseDouble(scanner.nextLine());
		System.out.print("Enter the individual price of each robe garment: ");
		double robePrice      =Double.parseDouble(scanner.nextLine());
		System.out.print("Enter the individual price of each belt: ");
		double beltPrice      =Double.parseDouble(scanner.nextLine());
		
		int actualLightsabersBought=(int)Math.ceil((actorAmount*1.1));
		double totalSum=0;
		
		totalSum=actorAmount*(robePrice+beltPrice)+actualLightsabersBought*lightsaberPrice;
		
		for(int i=1; i<=actorAmount; i++)
		{
			if(i%6==0)
				totalSum-=beltPrice;
		}
		System.out.println();
		
		if(totalSum<=budget)
			System.out.printf("George Lucas' budget is big enough. His movie will cost %.2f lv. to make.", totalSum);
		else
			System.out.printf("George Lucas will need %.2f lv. more in order for everything to pan out according to his artistic vision."+"\n"+"I'm not sure the studio will like the sound of that...", (totalSum-budget));
	}
}
