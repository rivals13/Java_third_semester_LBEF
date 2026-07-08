// Program  to find the area  and the  perimeter of the  Square..

import java.util.Scanner;


class SquareAP{
	public static void main(String... args){
		Scanner read = new Scanner(System.in); // the Scanner object;
		System.out.println("Please enter the  length of the square: ");
		float  side = read.nextFloat();

		System.out.println("The Area of the Square is: %.3f".formatted(side*side));
		System.out.println("The Perimeter of the Square is: %.3f".formatted(4*side));





	}
}