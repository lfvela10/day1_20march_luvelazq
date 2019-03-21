package day1_20march_luvelazq;

public class VariablesAndNames
{


		// What is a float? float is a 32-bit precision IEEE 754 floating point. 
	    // As a float is less precise than a double, the conversion cannot be 
	    // performed implicitly.
	
	    // I changed the number to 4 from 4.0 and nothing changed because the numbers are 
		// whole, we would see a change if the precision was different
	
	    // Assignment operator =
		// = Assigns a value
		// == is comparison operator. If it is a primitive, it checks the value
		// if its an object it checks for reference (memory allocation)
	    
	
		public static void main( String[] args )
		{
			// Initializing the int variables without a value
			int cars, drivers, passengers, cars_not_driven, cars_driven;
			// Initializing the doubles without values
			double space_in_a_car, carpool_capacity, average_passengers_per_car;
			
			// The following lines give explicit values
			cars = 100;
			space_in_a_car = 4;
			drivers = 30;
			passengers = 90;
			// The value for cars not driven is being derived by subtracting cars - drivers
			cars_not_driven = cars - drivers;
			// Cars driven is being assigned by the number of drivers
			cars_driven = drivers;
			// The carpool capacity is being obtained by multiplying the cars driven by
			// the amount of space in a car
			carpool_capacity = cars_driven * space_in_a_car;
			
			// The average number of passengers is being obtained by dividing the total
			// number of passengers by the number of cars driven
			average_passengers_per_car = passengers / cars_driven;
			
			// output concatenated with variable values
			System.out.println( "There are " + cars + " cars available." );
			System.out.println( "There are only " + drivers + " drivers available." );
			System.out.println( "There will be " + cars_not_driven + " empty cars today." );
			System.out.println( "We can transport " + carpool_capacity + " people today." );
			System.out.println( "We have " + passengers + " to carpool today." );
			System.out.println( "We need to put about " +
			average_passengers_per_car + " in each car." );
		}
		
}