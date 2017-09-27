public class JF_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Write a program to accept gender ("Male" or ""Female"") and age
		 * (range 1 to 120) as command line arguments from the user. Your
		 * program must then print the percentage of interest for the details
		 * entered based on below information.
		 * 
		 * 
		 * 
		 * 
		 * The interest rate is 8.2%, if gender is Female and Age is between 1
		 * to 58 The interest rate is 7.6%, if gender is Female and Age is
		 * between 59 to 120 The interest rate is 9.2%, if gender is Male and *
		 * Age is between 1 to 60 The interest rate is 8.3%, if gender is Male
		 * and Age is between 61 to 120
		 */

		String gender = args[0];
		int age = Integer.parseInt(args[1]);

		if ((gender.equals("Female")) && (age >= 1 && age <= 58)) {
			System.out.println("The interest rate is 8.2%");
		} else if ((gender.equals("Female")) && (age >= 59 && age <= 120)) {
			System.out.println("The interest rate is 7.6%");
		} else if ((gender.equals("Male")) && (age >= 1 && age <= 60)) {
			System.out.println("The interest rate is 9.2%");
		} else if ((gender.equals("Male")) && (age >= 61 && age <= 120)) {
			System.out.println("The interest rate is 8.3%");
		} else {

		}

	}

}
