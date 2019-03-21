package day1_20march_luvelazq;

public class NumbersAndMath {
	public static void main( String[] args ) {
		
		// The % operator is known as a modulus operator and not percent because it
		// has been assigned the function of finding the remainder after a division has
		// been performed
		
		// In integer division, the number preceding the . is truncated.
		// In floating point notation, we can specify how we round
		
		// Order of operations
		/*
		 * 1. () grouping
		 * 2. * / % (left to right)
		 * 3. + - (left to right) 
		 *  */
		// This line is printing out the string object below
		System.out.println( "I will now count my chickens:" );
		// This line is printing out Hens then Executing what is between the (), 
		//starting 30 / 6 which equals 5, then adding 25 to 5 equaling 30
		System.out.println( "Hens " + ( 25 + 30 / 6 ) );
		// This line is printing out Roosters and the evaluating the expression
		// 25 * 3 = 75 		75%4 = 3 		100-3 = 97
		System.out.println( "Roosters " + ( 100 - 25 * 3 % 4 ) );
		System.out.println( "Now I will count the eggs:" );
		// This line is performing the following operation:
		/* 4 % 2 = 0
		 * -1 / 4 = 0.25 = 0
		 * 3 + 2 = 5 
		 * 5 + 1 = 6
		 * 6 - 5 = 1
		 * 6 + 1 = 7 */
		System.out.println( 3 + 2 + 1 - 5 + 4 % 2 - 1 / 4 + 6 );
		
		System.out.println( "Is it true that 3 + 2 < 5 - 7?" );
		// This line is checking to see if 3 + 2 equals 5 is less than -2, This is then evaluating the result
		// and printing out true or false
		System.out.println( 3 + 2 < 5 - 7 );
		// This line is adding 3 + 2
		System.out.println( "What is 3 + 2? " + ( 3 + 2 ) );
		// This line is subtracting 5 -2 
		System.out.println( "What is 5 - 7? " + ( 5 - 7 ) );
		// This line is printing out the string object below
		System.out.println( "Oh, that's why it's false." );
		// This line is printing out the string object below
		System.out.println( "How about some more." );
		
		// This line checks to see if 5 is greater than -2 and outputting a boolean value
		System.out.println( "Is it greater? " + ( 5 > -2 ) );
		
		// This line is checking to see if 5 is greater than or equal to -2 and outputting a boolean value
		System.out.println( "Is it greater or equal? " + ( 5 >= -2 )
		);
		
		//This line is checking to see if 5 <= -2 and outputting the value
		System.out.println( "Is it less or equal? " + ( 5 <= -2 ) );
		
	
	System.out.println("Now with Floating Point Numbers");
	
	// This line is printing out the string object below
			System.out.println( "I will now count my chickens:" );
			// This line is printing out Hens then Executing what is between the (), 
			//starting 30 / 6 which equals 5, then adding 25 to 5 equaling 30
			System.out.println( "Hens " + ( 25f + 30f / 6f ) );
			// This line is printing out Roosters and the evaluating the expression
			// 25 * 3 = 75 		75%4 = 3 		100-3 = 97
			System.out.println( "Roosters " + ( 100f - 25f * 3f % 4f ) );
			System.out.println( "Now I will count the eggs:" );
			// This line is performing the following operation:
			System.out.println( 3f + 2f + 1f - 5f + 4f % 2f - 1f / 4f + 6f );
			System.out.println( "Is it true that 3 + 2 < 5 - 7?" );
			// This line is checking to see if 3 + 2 equals 5 is less than -2, This is then evaluating the result
			// and printing out true or false
			System.out.println( 3f + 2f < 5f - 7f );
			// This line is adding 3 + 2
			System.out.println( "What is 3 + 2? " + ( 3f + 2f ) );
			// This line is subtracting 5 -2 
			System.out.println( "What is 5 - 7? " + ( 5f - 7f ) );
			// This line is printing out the string object below
			System.out.println( "Oh, that's why it's false." );
			// This line is printing out the string object below
			System.out.println( "How about some more." );
			
			// This line checks to see if 5 is greater than -2 and outputting a boolean value
			System.out.println( "Is it greater? " + ( 5f > -2f ) );
			
			// This line is checking to see if 5 is greater than or equal to -2 and outputting a boolean value
			System.out.println( "Is it greater or equal? " + ( 5f >= -2f )
			);
			
			//This line is checking to see if 5 <= -2 and outputting the value
			System.out.println( "Is it less or equal? " + ( 5f <= -2f ) );
			
	
	}
}