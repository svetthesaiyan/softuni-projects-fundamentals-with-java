package data_types_and_variables_lab;

import java.math.BigDecimal;
import java.util.Scanner;

public class c_real_numbers_sum
{
	public static void main(String[] args)
	{
		Scanner scanner=new Scanner(System.in);
		BigDecimal sum=new BigDecimal(0);
		System.out.print("Enter the amount of numbers you're going to input: ");
		int loops=Integer.parseInt(scanner.nextLine());
		for(int i=1; i<=loops; i++)
		{
			BigDecimal currentNum=new BigDecimal(scanner.nextLine());
			sum=sum.add(currentNum);	// или `sum=sum.add(BigDecimal.valueOf(currentNum));`, ако `currentNum` е от тип double
		}
		System.out.print("\n"+"The exact sum of those "+loops+" numbers you input is: "+sum);
	}
}
