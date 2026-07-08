// Program  to find the average of  any threee numbers in Java

import java.util.Scanner;

class Average{
	public static void main(String... args){
		Scanner reader = new Scanner(System.in);

		System.out.println("Please enter the first number:");
		float firstNumber= reader.nextFloat();
		
		System.out.println("Please enter the second number: ");
		float secondNumber= reader.nextFloat();

		System.out.println("Please enter the third number: ");
		float thirdNumber= reader.nextFloat();


		System.out.println("The average of the nuumbers is: %.3f".formatted((firstNumber+secondNumber+thirdNumber)/3));
		



	}
}