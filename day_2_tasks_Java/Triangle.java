// Program  to find the area  and the  perimeter of the  triangle in Java


import java.util.Scanner;

class Triangle{
	public static void main(String... args){
		Scanner reader = new Scanner(System.in);

		System.out.println("Please enter the length of side A of triangle: ");
		float a = reader.nextFloat();
		
		System.out.println("Please enter the length of the base of triangle: ");
		float base = reader.nextFloat();

		System.out.println("Please enter the height of the triangle: ");
		float height = reader.nextFloat();


		System.out.println("The Area of the Triangle is: %.3f".formatted((float)1/2*base*height));
		System.out.println("The Perimeter of the Triangle is: %.3f".formatted(a+base+height));



	}
}