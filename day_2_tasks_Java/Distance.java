// Program  written to find the distance  between the cordinates  using  the  co-rodinate formula.
import java.util.Scanner;
import java.lang.Math; //importing the  math module for using the square  root function


class Distance{
	public static  void main(String... args){
		Scanner ScannerObject= new Scanner(System.in); //creating the Scanner object

//reading the inputs from the users

		System.out.println("Please  enter the X1 cordinate of the point: ");
		float x1= ScannerObject.nextFloat();

		System.out.println("Please  enter the y1 cordinate of the point: ");
		float y1= ScannerObject.nextFloat();

		System.out.println("You entered (%.3f,%.3f)".formatted(x1,y1));
		System.out.println();

		System.out.println("Please  enter the X2 cordinate of the point: ");
		float x2= ScannerObject.nextFloat();

		System.out.println("Please  enter the y2 cordinate of the point: ");
		float y2= ScannerObject.nextFloat();

		System.out.println("You entered (%.3f,%.3f)".formatted(x2,y2));
		System.out.println();
//displaying the output to the   users as <message> + <output>
		System.out.println("The distance  between (%.3f,%.3f) and (%.3f,%.3f) is: %f".formatted(x1,y1,x2,y2,Math.sqrt((x2-x1)*(x2-x1)+(y2-y1)*(y2-y1))));



	}
}