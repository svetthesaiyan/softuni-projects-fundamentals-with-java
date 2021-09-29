package basic_syntax_conditional_statements_and_loops_exercise;

import java.util.Scanner;

public class g_vending_machine
{
	public static void main(String[] args)
	{
		Scanner scanner=new Scanner(System.in);
		System.out.print("Enter the value of each coin you'll be inserting into the vending machine: ");
		String command=scanner.nextLine();
		double coinBalance=0;
		
		while(!command.equals("Start"))
		{
			double coin=Double.parseDouble(command);
			if(coin!=0.1 && coin!=0.2 && coin!=0.5 && coin!=1 && coin!=2)
				System.out.printf("Cannot accept %.2f since it's an invalid coin value."+"\n", coin);
			else
				coinBalance+=coin;
			
			System.out.print("Enter subsequent coin value: ");
			command=scanner.nextLine();
		}
		
		System.out.println();
		System.out.print("Enter the name of the product you want to purchase."+"\n"+"You can choose from: "+"\n"+"- Nuts"+"\n"+"- Crisps"+"\n"+"- Coke"+"\n"+"- Soda"+"\n"+"- Water"+"\n"+"Your choice: ");
		String product=scanner.nextLine();
		while(!product.equals("End"))
		{
			boolean hasMoney=true;
			
			switch(product)
			{
				case "Nuts":
					if(coinBalance<2)
					{
						System.out.println("Sorry, you don't have enough money to buy deez nuts.");
						hasMoney=false;
					}
					else
						coinBalance-=2;
					break;
					
				case "Crisps":
					if(coinBalance<1.5)
					{
						System.out.println("Sorry, you don't have enough money to buy this packet of crisps.");
						hasMoney=false;
					}
					else
						coinBalance-=1.5;
					break;
					
				case "Coke":
					if(coinBalance<1)
					{
						System.out.println("Sorry, you don't have enough money to buy this can of Coca-Cola.");
						hasMoney=false;
					}
					else
						coinBalance-=1;
					break;
					
				case "Soda":
					if(coinBalance<0.8)
					{
						System.out.println("Sorry, you don't have enough money to buy this bottle of soda.");
						hasMoney=false;
					}
					else
						coinBalance-=0.8;
					break;
					
				case "Water":
					if(coinBalance<0.7)
					{
						System.out.println("Sorry, you don't have enough money to buy this bottle of water.");
						hasMoney=false;
					}
					else
						coinBalance-=0.7;
					break;
					
					default:
						System.out.println("You have entered an invalid product name.");
						hasMoney=false;
						break;
			}
			
			if(!hasMoney)
			{
				System.out.print("Enter the name of the subsequent product you'd like to purchase: ");
				product=scanner.nextLine();
				continue;
			}
			
			System.out.printf("You have successfully purchased some %s."+"\n", product);
			System.out.print("Enter the name of the subsequent product you'd like to purchase: ");
			product=scanner.nextLine();
		}
		
		System.out.printf("\n"+"Your leftover change is %.2f lv.", coinBalance);
	}
}
