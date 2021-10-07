package data_types_and_variables_lab;

import java.util.Scanner;

public class d_town_info
{
	public static void main(String[] args)
	{
		Scanner scanner=new Scanner(System.in);
		System.out.print("Enter the name of a town: ");
		String town=scanner.nextLine();
		System.out.print("Enter the population of "+town+": ");
		int population=Integer.parseInt(scanner.nextLine());
		System.out.print("Enter the area of "+town+" in squared kilometres: ");
		short area=Short.parseShort(scanner.nextLine());
		
		System.out.printf("\n"+"%s has a population of %d people and an area of %d square km.", town, population, area);
	}
}
