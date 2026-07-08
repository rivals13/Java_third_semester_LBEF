//  WAP  to find the  greatest number  among  3  values

class BitwiseExample{
	public static void main(String...  args){ //  strings..  refers to the variable  string  object 
		// bitwise  not, and, or  implementation in Java
		System.out.println("Performing bitwise AND operation: "+(5&6));
		System.out.println("Performing bitwise OR operation: "+(5|6));
		System.out.println("Performing bitwise XOR operation: "+(5^6));

		// left and  right shift implementation 

		 /*
		 all the integers are  stored  as  32 bit  binary..  and the  MSB's  sign  determines the 
		  sign of  the value
		   10 -> 0000 0000 0000 0000 0000 0000 0000 1010 -(+10)
		    shift to wards the left  we  get:  40 
		      and   for -10  we get:  -40

		 */

		System.out.println("Performing left  shift on positive 10: " +(10<<2));
		System.out.println("Performing left  shift on negative -10: " +(-10<<2));
		
		// in case of right  shift  we see  that the space is left in the left side
		System.out.println("Performing right shift on positive 42: " +(42>>2));
		System.out.println("Performing right shift on negative -42:"+(42>>2))
		

	}
}
