// Program  written in  java to find the area and perimter of  differnet  types of the  triangles

import java.util.Scanner;
import java.lang.Math;
 
 class TriangleAP{
 	public static void main(String... args){
// we  are saying using  Scanner class create a new object that  will  basically listen for the input form the system;
 		Scanner ScannerObject= new Scanner(System.in);
 		System.out.println("Please select the  option:");
 		System.out.println("1. Equilateral triangle");
 		System.out.println("2. Isosceles triangle");
 		System.out.println("3. Scalene triangle");
 		System.out.println();
//taking the  input for the choice of the triangle types
 		byte choice= ScannerObject.nextByte();

//  calculating the  area and the perimeter of the Equilateral triangle.
 		if (choice== 1){
 			System.out.println("Please enter the length  of the  triangle: ");
 			byte length=  ScannerObject.nextByte();
 			System.out.println("The perimeter of the Equilateral triangle is: %d".formatted(3*length));
 			double area= (double)(Math.sqrt(3)/4)*length*length;
 			System.out.println("The Area of the Equilateral triangle is: %f".formatted(area));
 		}
//  calcualting the  area and the perimeter of the Isosceles triangle.

 		else if(choice ==2){
 			System.out.println("Please enter the  Length of the side A:");
 			float A= ScannerObject.nextFloat();
 			System.out.println("Please enter the  Length of the base:");
 			float B= ScannerObject.nextFloat();
 			System.out.println("The perimeter of the Isosceles  triangle is: %f".formatted(2*A+B));
 			System.out.println("The area  of the Isosceles  triangle is: %f".formatted((float)1/2*B*Math.sqrt((A*A-B*B)/4)));
 		}

//  calcualting the  area and the perimeter of the Scalene triangle.

 		else if(choice ==3){
			System.out.println("Please enter the  Length of the side A:");
 			float A= ScannerObject.nextFloat();
 			System.out.println("Please enter the  Length of the  side B:");
 			float B= ScannerObject.nextFloat();
 			System.out.println("Please enter the  Length of the  side C:");
 			float C= ScannerObject.nextFloat();
 			System.out.println("The perimeter of the Scalene triangle is: %f".formatted(A+B+C));
 				float semi= (A+B+C)/2;
 			System.out.println("The area  of the Scalene  triangle is: %f".formatted(Math.sqrt(semi*(semi-A)*(semi-B)*(semi-C))));
 		}

 		else{
 			System.out.println("Value out of range!, Please enter correct  choice");
 		}




 }

 }
 