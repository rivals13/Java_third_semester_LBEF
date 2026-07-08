 //Program written in java to  calculate the  simple  interest for  an amount.
 import java.util.Scanner;

 class SimpleInterest{
 	public  static void main(String... args){
 		Scanner Scan= new Scanner(System.in);

 		System.out.println("Please enter the principle amount:");
 		float principle = Scan.nextFloat();

 		System.out.println("Please enter the Rate of the interest:");
 		float rate= Scan.nextFloat();

 		System.out.println("Please enter the years  the amount will be kept:");
 		int time = Scan.nextInt();

 		System.out.println("The  accured  Simple interest in %d years will be : %f".formatted(time, (principle*rate*time)/100));


 	}
 }