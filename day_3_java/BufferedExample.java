import java.io.*;

class BufferedExample{
	public  static void main(String... args) throws Exception{
//creating the buffered  reader and the Input  stream  reader  object

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Please  enter  your name: "); 
		String name= br.readLine(); // this  will read the input  as the String!

		System.out.println("Please enter the  first number:  ");
		int number1 = Integer.parseInt(br.readLine()); 

		System.out.println("Please enter the second number:  ");
		int number2 = Integer.parseInt(br.readLine()); 

		System.out.println("Name: %s".formatted(name));
		System.out.println("Name: %d".formatted(number1+number2));





	}
}

// the value  enetered form the terminal is stored in the buffer  memory, and
// the  intermediary: InputstreamReader is used  to to  get the values