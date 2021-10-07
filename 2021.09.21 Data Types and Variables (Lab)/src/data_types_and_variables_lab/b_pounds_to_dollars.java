package data_types_and_variables_lab;

import java.util.Scanner;

public class b_pounds_to_dollars
{
	public static void main(String[] args)
	{
		Scanner scanner=new Scanner(System.in);
		System.out.print("Enter the amount of dosh you'd like me to convert into freedom currency: ");
		double pounds=Double.parseDouble(scanner.nextLine());
		double dollars=pounds*1.36;
		System.out.printf("£%.2f is roughly $%.3f", pounds, dollars);
	}
}
