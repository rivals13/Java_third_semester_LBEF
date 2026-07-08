// Program  to find the Volume of the  cylinder in Java

import java.util.Scanner;

class CylinderVol{
	public static void main(String... args){
		Scanner reader = new Scanner(System.in);

		System.out.println("Please enter the  radius of the Cylinder in:");
		float radius= reader.nextFloat();
		
		System.out.println("Please enter the height of the Cylinder in: ");
		float height= reader.nextFloat();

		System.out.println("The Volume of the Cylinder is: %.3f".formatted((float)22/7*radius*radius*height));
		



	}
}