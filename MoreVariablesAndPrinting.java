package day1_20march_luvelazq;

public class MoreVariablesAndPrinting {
	
	public static void main( String[] args )
	{
		// A variable name cannot be a number, so 1. is not allowed
		
		// A floating point number can be rounded in 3 ways
		
		// 1. Rounding towards 0
		  /*  simply truncate the extra digits. The simplest method,
		   *  but it introduces larger errors than necessary as well
		   *   as a bias towards zero when dealing with mainly positive
		   *    or mainly negative numbers.
		   */
		
		// 2. Rounding half away from zero 
			/* - if the truncated fraction is greater than or equal to 
			 * half the base, increase the last remaining digit. This is 
			 * the method generally taught in school and used by most people. 
			 * It minimizes errors, but also introduces a bias (away from zero).
			 */
		
		// 3. Rounding half to even
			/*  if the truncated fraction is greater than half the base, increase
			 *  the last remaining digit. If it is equal to half the base, increase
			 *  the digit only if that produces an even result. This minimizes errors
			 *  and bias, and is therefore preferred for bookkeeping.
			 */
		String name, eyeColor, teeth, hairColor;
		int age, height, weight;
		
		name = "Zed A. Shaw";
		age = 35; // not a lie
		height = 74; // inches
		weight = 180; // lbs
		eyeColor = "Brown";
		teeth = "Yellow";
		hairColor = "Black";
		
		System.out.println( "Let's talk about " + name + "." );
		System.out.println( "He's " + height + " inches ( or " + height * 2.54 +" cm) tall."  );
		System.out.println( "He's " + weight + " pounds ( or " + weight * 0.453592 + "kg ) heavy." );
		System.out.println( "Actually, that's not too heavy." );
		System.out.println( "He's got " + eyeColor + " eyes and " + hairColor + " hair." );
		System.out.println( "His teeth are usually " + teeth + " depending on the coffee." );
		// This line is tricky; try to get it exactly right.
		System.out.println( "If I add " + age + ", " + height + ", and "
		+ weight
		+ " I get " + (age + height + weight) + "." );
  }
}