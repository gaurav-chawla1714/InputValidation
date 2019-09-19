import java.util.Scanner;
/**
 * AP CmpSci 2019-2020
 * ArrayBootCamp
 * A project that basically tests many different functionalities of a one dimensional array and returns to the user
 * 
 * @author Gaurav Chawla
 * @version August 28, 2019
 */
public class Input {
	/** the keyboard object used to read user input*/
	private static Scanner keyboard = new Scanner(System.in);


	/**
	 * the readInt() method makes sure that the input passed in is an int
	 * @param prompt custom message to the user
	 * @return the checked int
	 */	
	public static int readInt(String prompt) {
		int value = 0; //variable declaration
		boolean valid = false;
		do {
			System.out.println(prompt);
			if (keyboard.hasNextInt()) //checks to see if number is int
			{
				value = keyboard.nextInt();
				valid = true;
			}
			else
			{
				System.out.println("The value entered was not an integer");
			}
			keyboard.nextLine();
		} while (!valid); //loop will keep running as long as boolean valid is false
		return value;
	}
	/**
	 * the readDouble() method makes sure that the input passed in is a double
	 * @param prompt custom message to the user
	 * @return the checked double
	 */	
	public static double readDouble(String prompt) {
		double value = 0;
		boolean valid = false;
		do {
			System.out.println(prompt);
			if (keyboard.hasNextDouble()) //checks to see if number is double
			{
				value = keyboard.nextDouble();
				valid = true;
			}
			else
			{
				System.out.println("The value entered was not a double");
			}
			keyboard.nextLine();
		} while (!valid); //loop will keep running as long as boolean valid is false
		return value;
	}
	/**
	 * the readNum() method reads in an int and makes sure that it is under a max value
	 * @param prompt custom message to the user
	 * @param max the max value
	 * @return the checked int
	 */	
	public static int readNum(String prompt, int max) { //value less than or equal to the value specified by mass
		int value = max + 1; //variable declaration
		do {
			System.out.println(prompt);
			if (keyboard.hasNextInt())
			{
				value = keyboard.nextInt();
				if (value > max) //check to see if value is over max
				{
					System.out.println("The integer entered was over the maximum value");
				}
			}
			else
			{
				System.out.println("The value entered was not an integer");
			}
			keyboard.nextLine();
		} while (value > max); //loop will keep running as long as the entered value is over the maximum
		return value;
	}
	/**
	 * the readNum() method reads in a double and makes sure that it is under a max value
	 * @param prompt custom message to the user
	 * @param max the max value
	 * @return the checked double
	 */	
	public static double readNum(String prompt, double max) { //value less than or equal to the value specified by mass
		double value = max + 1;
		do {
			System.out.println(prompt);
			if (keyboard.hasNextDouble())
			{
				value = keyboard.nextDouble();
				if (value > max) //check to see if value is over max
				{
					System.out.println("The double entered was over the maximum value");
				}
			}
			else
			{
				System.out.println("The value entered was not a double");
			}
			keyboard.nextLine();
		} while (value > max); //loop will keep running as long as the entered value is over the maximum
		return value;
	}
	/**
	 * the readNum() method reads in an int and makes sure that it is over a min value
	 * @param prompt custom message to the user
	 * @param min the min value
	 * @return the checked int
	 */	
	public static int readNum(int min, String prompt) { //reads in an integer that is greater than or equal to the value specified by min
		int value = min - 1;
		do {
			System.out.println(prompt);
			if (keyboard.hasNextInt())
			{
				value = keyboard.nextInt();
				if (value < min)  //checks to see if value is less than min
				{
					System.out.println("The integer entered was under the minimum value");
				}
			}
			else
			{
				System.out.println("The value entered was not an integer");
			}
			keyboard.nextLine();
		} while (value < min); //loop will keep running as long as the entered value is below the minimum
		return value;
	}
	/**
	 * the readNum() method reads in a double and makes sure that it is over a min value
	 * @param prompt custom message to the user
	 * @param min the min value
	 * @return the checked double
	 */	
	public static double readNum(double min, String prompt) { //reads in an double that is greater than or equal to the value specified by min
		double value = min - 1;
		do {
			System.out.println(prompt);
			if (keyboard.hasNextDouble())
			{
				value = keyboard.nextDouble();
				if (value < min) //checks to see if value is less than min
				{
					System.out.println("The double entered was under the minimum value");
				}
			}
			else
			{
				System.out.println("The value entered was not a double");
			}
			keyboard.nextLine();
		} while (value < min); //loop will keep running as long as the entered value is below the minimum
		return value;
	}
	/**
	 * the readNum() method reads in an int and makes sure that it is over a min value and under a max value
	 * @param prompt custom message to the user
	 * @param min the min value
	 * @param max the max value
	 * @return the checked int
	 */	
	public static int readNum(String prompt, int min, int max) { //reads in an integer that is between the values specified by min and max, inclusive
		int value = max + 1;
		do {
			System.out.println(prompt);
			if (keyboard.hasNextInt())
			{
				value = keyboard.nextInt();
				if (value < min) //if value is below min
				{
					System.out.println("The integer entered was under the minimum value");
				}
				else if (value > max) //if value is above max
				{
					System.out.println("The integer entered was over the maximum value");
				}
			}
			else
			{
				System.out.println("The value entered was not an integer");
			}
			keyboard.nextLine();
		} while (value < min || value > max); //loop will keep running while either condition is true
		return value;
	}
	/**
	 * the readNum() method reads in a double and makes sure that it is over a min value and under a max value
	 * @param prompt custom message to the user
	 * @param min the min value
	 * @param max the max value
	 * @return the checked double
	 */	
	public static double readNum(String prompt, double min, double max) { //reads in an integer that is between the values specified by min and max, inclusive
		double value = max + 1;

		do {
			System.out.println(prompt);
			if (keyboard.hasNextDouble())
			{
				value = keyboard.nextDouble();
				if (value < min) //if value is less than min
				{
					System.out.println("The double entered was under the minimum value");
				}
				else if (value > max) //if value is greater than max
				{
					System.out.println("The double entered was over the maximum value");
				}
			}
			else
			{
				System.out.println("The value entered was not a double");
			}
			keyboard.nextLine();
		} while (value < min || value > max); //loop will keep running while either condition is true

		return value;
	}
	/**
	 * the readNum() method reads in an int and makes sure that it is over a min value/over a max value, depending on the boolean minMax
	 * @param prompt custom message to the user
	 * @param limit the number that the input has to be over/under
	 * @param minMax the boolean that determines if the limit represents the min or the max
	 * @return the checked int
	 */	
	public static int readNum(String prompt, int limit, boolean minMax) {
		int value = 0;
		boolean valid = false;
		do {
			System.out.println(prompt);
			if (keyboard.hasNextInt())
			{
				value = keyboard.nextInt();
				if (minMax) //if minMax is true
				{
					if (value >= limit) //if value is greater than or equal to limit (in this case minimum)
					{
						valid = true;
					}
					else
					{
						System.out.println("The integer entered was under the minimum value");
					}
				}
				else //if minMax is false
				{
					if (value <= limit) //if value is less than or equal to limit (in this case maximum)
					{
						valid = true;
					}
					else
					{
						System.out.println("The integer entered was above the maximum value");
					}
				}
			}
			else
			{
				System.out.println("The value entered was not an integer");
			}
			keyboard.nextLine();
		} while (!valid); //loop will keep iterating as long as the boolean valid is false
		return value;
	}
	/**
	 * the readNum() method reads in a double and makes sure that it is over a min value/over a max value, depending on the boolean minMax
	 * @param prompt custom message to the user
	 * @param limit the number that the input has to be over/under
	 * @param minMax the boolean that determines if the limit represents the min or the max
	 * @return the checked double
	 */
	public static double readNum(String prompt, double limit, boolean minMax) {
		double value = 0;
		boolean valid = false;
		do {
			System.out.println(prompt);
			if (keyboard.hasNextDouble())
			{
				value = keyboard.nextDouble();
				if (minMax) //if minMax is true
				{
					if (value >= limit)//if value is greater than or equal to limit (in this case minimum)
					{
						valid = true;
					}
					else
					{
						System.out.println("The double entered is below the minimum value");
					}
				}
				else //if minMax is false
				{
					if (value <= limit) //if value is less than or equal to limit (in this case maximum)
					{
						valid = true;
					}
					else
					{
						System.out.println("The double entered was above the maximum value");
					}
				}
			}
			else
			{
				System.out.println("The value entered was not a double");
			}
			keyboard.nextLine();
		} while (!valid);
		return value;
	}




}

