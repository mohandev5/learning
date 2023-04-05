package day2;

import java.util.Scanner;

public class LargestFactor {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int factor=0;
		System.out.println("enter the number:");
		int number = sc.nextInt();
		for(int i=1;i<number;i++)
		{
			if(number%i==0)
			{
		       factor = i;
			}
		}
		
		System.out.println(factor);
		sc.close();
	}

}
