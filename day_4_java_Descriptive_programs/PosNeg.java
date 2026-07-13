// WAP is positive/negative--using if statement

// Selection statement: simple if

import java.util.Scanner;

class PosNeg{
	public static void main(String...  args) throws Exception{
		Scanner reader = new Scanner(System.in);
		System.out.println("Please enter  a number: ");

		int number = reader.nextInt();

		if(number>0){
			System.out.println("%d is a Positive number!".formatted(number));
		}

		if(number<0){
			System.out.println("%d is a Negative number!".formatted(number));
		}

	}
}