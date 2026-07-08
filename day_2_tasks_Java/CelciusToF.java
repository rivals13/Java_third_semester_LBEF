// Temperature  conversion  program
import java.util.Scanner;

class CelciusToF{
	public static void main(String... args){
//  creating the Scanner  object  for  reading the user input
		Scanner ScannerObject= new Scanner(System.in);
		System.out.println("Please select the  option:");
 		System.out.println("1. Farenheit to celcius");
 		System.out.println("2. celcius to Farenheit");

 		//taking the choice input form the  user
 		byte choice= ScannerObject.nextByte();

 		if (choice==1){
 			System.out.println("Please enter the temperature in  Farenheit:");
 			double Farenheit= ScannerObject.nextDouble();
 			System.out.println("The temperature in Celcius is: %f degrees Celcius".formatted(((Farenheit-32)*5)/9));
 		}


 		else if (choice==2){
 			System.out.println("Please enter the temperature in  Celcius:");
 			double Celcius= ScannerObject.nextDouble();
 			System.out.println("The temperature in Farenheit is: %f degrees  Farenheit".formatted((Celcius*9/5)+32));
 		}

 		else {
 			System.out.println("Value out of range!, Please enter correct  choice");
 		}



	}

}