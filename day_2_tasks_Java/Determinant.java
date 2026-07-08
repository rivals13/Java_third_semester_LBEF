// java  porgram to take  user input and  clacualte the value of determinant: b^2-4ac.

import java.util.Scanner;
import  java.lang.Math;

class Determinant{
	public static void main(String... args){
		Scanner  read = new Scanner(System.in);
		System.out.println("Equation format: ax^2+bx+c");

		System.out.println("Please enter the 'a' from your equation: ");
		float a= read.nextFloat();

		System.out.println("Please enter the 'b' from your equation: ");
		float b= read.nextFloat();

		System.out.println("Please enter the 'c' from your equation: ");
		float c= read.nextFloat();

		System.out.println("The value of  Determinant is: %f".formatted(b*b-(4*a*c)));



	}
}