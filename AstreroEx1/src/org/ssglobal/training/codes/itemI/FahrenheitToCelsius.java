package org.ssglobal.training.codes.itemI;

public class FahrenheitToCelsius {
	public static void main(String [] args) {
		// declare and initialize data
		double celsius;
		double fahrenheit = 30.0;
		
		// calculate celsius equivalent
		celsius = (fahrenheit - 32) * 5/9;
		
		// output results
		System.out.println(fahrenheit + "\u00B0F = " + celsius + "\u00B0C");
	}
}
/*
	Compiler errors below
	1st: float Celsius should be double
	2nd: float Farenheit should be double
	3rd: System.out.println( fahrenheit, "\U00B0F = "); the U should be small u 
	4th: System.out.println(celsius + "u00B0C"); celcius cannot be resolved 
											     to variable must be celsius
											     
	5th: System.out.println(fahrenheit, "\u00B0F = "); should be plus (+) sign
	
	6th: System.out.println(celsius, "u00B0C"); should be plus (+) sign
	
	7th: double celsius = (5/9) * fahrenheit - 32; the 'f' in fahrenheit should 
												   be capital
												   
	8th: System.out.println( fahrenheit, "\U00B0F = " ); the 'f' in fahrenheit should 
													     be capital
													     													  
	Logical error below
	1st: logical error: double celsius = (5/9) * fahrenheit - 32; 
					    it must be double celsius = fahrenheit - 32 * (5/9);
	2nd: the declared celsius with value 35.5  
	3rd: double celsius = fahrenheit - 32 * (5/9); should remove parenthesis in 5/9
	
	User-experience errors below
	1st: FahrenheitToCelsiusx should be FahrenheitToCelsius as x in the end doesn't
	     make any sense.
	2nd: Celsius should not be capital. must follow camelcase convention
	3rd: Fahrenheit should not be capital. must follow camelcase convention
	
	Readability error
	1st: System.out.println( fahrenheit, "\U00B0F = ");
		 System.out.println( celcius, "u00B0C" );
		 should be in one print statement as it wouldn't make any sense if you
		 separate the values and just remove the equal sign
*/