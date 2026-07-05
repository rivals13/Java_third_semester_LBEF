//  WAP  to find the  greatest number  among  3  values

class LogicalExample{
	public static void main(String...  args){ //  strings..  refers to the variable  string  object 
		
		int a=10,b=3,c=20;
		System.out.println("A is  greater: "+((a>b)&&(a>c)));
		System.out.println("B is  greater: "+((b>a)&&(b>c)));
		System.out.println("C is  greater: "+((c>b)&&(c>a)));
		System.out.println(args[0]); //  in the  args  the  first  argument would
		// be the   value  we pass after  the name of the  file!
		

	}
}

