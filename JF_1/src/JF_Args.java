public class JF_Args {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Write a program to accept 2 strings from the user (via command line).
		 * Your program must then concatenate them and print the resultant
		 * string.
		 */

		/*
		if (args.length >= 2) {
			System.out.println("Concatenation of two String  ="
					+ (args[0] + args[1]));
		} else if (args.length < 2) {
			System.out.println("Enter 2 Strings");
		}

 		*/

		/*
		 * Write a program to accept 2 strings from the user (via command line).
		 * Your program must then check if the strings provided are identical or
		 * not. (Strings are case sensitive)
		 */

		/*
		 * Write a program to accept 2 strings from the user (via command line).
		 * Your program must then concatenate them in the way given in example
		 * below and print the resultant
		 */

		/*		
		String reverse = "";
		if (args.length >= 2) {
			System.out.println("Concatenation of two String  ="
					+ (args[0] + args[1]));
			if (args[0].equals(args[1])) {
				System.out.println("The two strings are identical.");
			} else {
				System.out.println("The two Strings are not identical.");
			}

			for (int i = args[1].length() - 1; i >= 0; i--) {
				reverse = reverse + args[1].charAt(i);
			}

			System.out.println((args[0] + reverse));

		} else if (args.length < 2) {
			System.out.println("Enter 2 Strings");
		}
		*/

		/*
		 * Write a Program to accept two integers through the command line
		 * argument and print the sum of the two numbers
		 */

		if (args.length >= 2) {
			System.out.println("The sum of " + args[0] + " and " + args[1]
					+ " = "
					+ (Integer.parseInt(args[0]) + Integer.parseInt(args[1])));
		} else if (args.length < 2) {
			System.out.println("Enter 2 Numbers");
		}

	}

}
