// Program  to find the area  and the  perimeter of the  Rectangle in Java

import java.util.Scanner;

class RectangleAP{
	public static void main(String... args){
		Scanner reader = new Scanner(System.in);
		
		System.out.println("Please enter the length of the rectangle: ");
		float length = reader.nextFloat();

		System.out.println("Please enter the width of the rectangle: ");
		float width = reader.nextFloat();


		System.out.println("The Area of the Rectangle  is: %.3f".formatted(length*width));
		System.out.println("The Perimeter of the Rectangle  is: %.3f".formatted(2*(length+width)));



	}
}