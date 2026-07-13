// we are  trying to  read the  input via the BufferedStreamReader class

import java.io.BufferedReader;
import java.io.InputStreamReader;

class Input{
	public static void main(String... args) throws Exception{
		//Buffered reader  requires an  intermediary called as the InputStreamReader that allows  to read  the  vakeu form the terminal
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		//BufferedReader has  a single  method called as readLine()..>> all input  will be as  String
		System.out.println("enter value: ");
		long number= Long.parseLong(reader.readLine());
		System.out.println("number: %d".formatted(number));
	}
}