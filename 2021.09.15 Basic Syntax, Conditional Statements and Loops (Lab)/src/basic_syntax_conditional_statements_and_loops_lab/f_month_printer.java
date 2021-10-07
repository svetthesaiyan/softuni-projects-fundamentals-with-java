package basic_syntax_conditional_statements_and_loops_lab;

import java.util.Scanner;

public class f_month_printer 
{
	public static void main(String[] args) 
	{
		Scanner scanner=new Scanner(System.in);
		System.out.print("Enter the number of the corresponding month: ");
		int monthNumber=Integer.parseInt(scanner.nextLine());
		System.out.println();
		
		switch(monthNumber)
		{
			case 1 ->  System.out.print("\"1\" is for January!");
			case 2 ->  System.out.print("\"2\" is for February!");
			case 3 ->  System.out.print("\"3\" is for March!");
			case 4 ->  System.out.print("\"4\" is for April!");
			case 5 ->  System.out.print("\"5\" is for May!");
			case 6 ->  System.out.print("\"6\" is for June!");
			case 7 ->  System.out.print("\"7\" is for July!");
			case 8 ->  System.out.print("\"8\" is for August!");
			case 9 ->  System.out.print("\"9\" is for September!");
			case 10 -> System.out.print("\"10\" is for October!");
			case 11 -> System.out.print("\"11\" is for November!");
			case 12 -> System.out.print("\"12\" is for December!");
			default -> System.out.print("Can you seriously not count to twelve...");
		}
	}
}
