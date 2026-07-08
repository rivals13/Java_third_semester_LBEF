// WAP to  input the student information and dsiplay it,  input the  name, age and  address
import java.util.Scanner;

class Input{
	public  static void main(String... args){
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the name of the person: ");		
		String name= sc.nextLine();
		System.out.println("enter the age of the person: ");
		byte age=  sc.nextByte();
		sc.nextLine();
		System.out.println("enter the address of the person: ");
		String address= sc.nextLine(); //  in  java String is not  a data type rather it is a  class;

		System.out.println("Person's details");
		System.out.println();
		System.out.println("The  person name is: %s".formatted(name)); //  writing  using  the instance method
	    System.out.println("%s is %d years old".formatted(name,age));	
		System.out.println(String.format("%s Lives in %s",name,address)); //using the static method  for the formatting..
		
	}
}