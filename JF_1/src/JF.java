import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class JF {

	private static Scanner sc;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		sc = new Scanner(System.in);
		// q5();
		// q6();
		// q7();
		// q9();
		// q10();
		// q11();
		// q12();
		// q13();
		// q14();
		// q15();
		q16();

		sc.close();

	}

	public static void q5() {

		/*
		 * Write a program to accept a number from the user. Your program must
		 * then verify if the entered number is positive or negative or zero and
		 * print an appropriate message 6
		 */

		System.out.println("Insert Number");
		int first = sc.nextInt();

		if (first > 0) {
			System.out.println("The number is positive");
		} else if (first == 0) {
			System.out.println("The number is 0");
		} else {
			System.out.println("The number is negative");
		}

	}

	public static void q6() {

		/*
		 * Write a program to accept 2 numbers from the user. Your program must
		 * then print out all even numbers present between those 2 numbers
		 */
		
		System.out.println("Enter First Number");
		int first = sc.nextInt();
		System.out.println("Enter First Number");
		int second = sc.nextInt();

		if (first < second) {
			for (int i = first; i <= second; i++) {
				if (i % 2 == 0) {
					System.out.println(i + "");
				}
			}
		} else {
			for (int i = second; i <= first; i++) {
				if (i % 2 == 0) {
					System.out.println(i + "");
				}
			}
		}
	}

	public static void q7() {

		/*
		 * Write a program to accept 2 numbers from the user. Your program must
		 * then print out all the prime numbers present between those 2 numbers.
		 */
		
		System.out.println("Enter First Number");
		int first = sc.nextInt();
		System.out.println("Enter First Number");
		int second = sc.nextInt();

		for (int i = first; i <= second; i++) {
			if (i % i == 0) {
				System.out.println(i + "");
			}
		}
	}

	public static void q9() {

		/*
		 * Write a program to print the name of the month, based on the number
		 * which is provided as input by the user
		 */

		System.out.println("Enter Number");
		int first = sc.nextInt();

		String[] months = { "January", "February", "March", "April", "May",
				"June", "July", "August", "September", "October", "November",
				"December" };

		if (first >= 1 && first <= 12) {
			System.out.println(months[first - 1]);
		} else {
			System.out.println("Invalid Month");
		}
	}

	public static void q10() {

		/*
		 * Write a Java program to accept a number as input from the user, and
		 * print if it is a palindrome or not.
		 */

		String reverse = "";
		System.out.println("Enter String");
		String first = sc.nextLine();

		for (int i = first.length() - 1; i >= 0; i--) {
			reverse = reverse + first.charAt(i);
		}
		if (first.equals(reverse)) {
			System.out.println(first + " Is a Palindrome");
		} else {
			System.out.println(first + " Is not a Palindrome");
		}
	}

	public static void q11() {

		/*
		 * Write a program that prints the first 5 numbers from the number
		 * series which are divisible by 2, 3, and 5.
		 */

		int count = 0;
		for (int i = 1; i <= 1000; i++) {
			if ((i % 2 == 0) && (i % 3 == 0) && (i % 5 == 0)) {
				count++;
				System.out.println(i);
			}
			if (count == 5) {
				break;
			}
		}
	}

	public void menu() {
		System.out.println("Menu");
		System.out.println("Add");
		System.out.println("Subtract");
		System.out.println("Choose Add for Additon and Sub for Subtraction");
	}

	public static void q12() {

		/*
		 * Write a program that displays a menu with options 1. Add 2. Sub Based
		 * on the options chosen, read two numbers and perform the relevant
		 * operation. After performing the operation, the program should ask the
		 * user if he wants to continue. If the user presses y or Y, then the
		 * program should continue displaying the menu else the program should
		 * terminate. [ Note: Use Scanner class]
		 */

		JF j = new JF();
		int inputA = 0;
		int inputB = 0;

		boolean cont2 = true;

		while (cont2) {
			j.menu();
			String input = sc.next();
			String cont = "";

			if (input.equals("Add")) {
				System.out.println("Enter First Number");
				inputA = sc.nextInt();
				System.out.println("Enter Second Number");
				inputB = sc.nextInt();
				System.out.println("The sum of " + inputA + " and " + inputB
						+ " is " + (inputA + inputB));

			} else if (input.equals("Sub")) {
				System.out.println("Enter First Number");
				inputA = sc.nextInt();
				System.out.println("Enter Second Number");
				inputB = sc.nextInt();
				System.out.println("The difference between " + inputA + " and "
						+ inputB + " is " + (inputA - inputB));
			}
			System.out.println("Would you like to continue ?");
			cont = sc.next();
			if (cont.equals("Y")) {
				cont2 = false;
			}
		}
		System.out.println("Thank you for using the system.");
		// sc.close();
	}

	public static void q13() {

		/*
		 * Write a program to initialize an integer array and find the maximum
		 * and minimum value of an array
		 */

		int[] numbers = { 1, 2, 6, 11, 5, 6, 7, 8, 9 };
		Arrays.sort(numbers);
		int minimum = numbers[0];
		int maximum = numbers[numbers.length - 1];

		System.out.println("The minimum number in the array list is: "
				+ minimum);
		System.out.println("The maximum number in the array list is: "
				+ maximum);
	}

	public static void q14() {

		/*
		 * Write a program to initialize an integer array with values and check
		 * if a given number is present in the array or not. If the number is
		 * not found, it will print -1 else it will print the index value of the
		 * given number in the array
		 */

		int[] numbers = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		System.out.println("Enter a number");
		boolean notinArray = true;
		int given = sc.nextInt();

		for (int i = 0; i < numbers.length; i++) {
			if (given == numbers[i]) {
				System.out.println("The index of the matching number is: " + i);
				notinArray = false;
				break;
			}
		}
		if (notinArray) {
			System.out.println("-1");
		}
	}

	public static void q15() {

		/*
		 * Write a program to remove the duplicate elements in an array and
		 * print the values
		 */

		ArrayList<Integer> numberMatch = new ArrayList<>();
		numberMatch.add(20);
		numberMatch.add(30);
		numberMatch.add(40);
		numberMatch.add(20);
		numberMatch.add(50);
		numberMatch.add(40);

		Set<Integer> temp = new LinkedHashSet<Integer>(numberMatch);
		numberMatch.clear();
		numberMatch.addAll(temp);

		System.out.println(numberMatch);
	}

	public static void q16() {

		/*
		 * Write a program to print the element in the array that has occurred
		 * the highest number of times
		 */

		int[] occurance = { 1, 2, 3, 4, 4, 4, 4, 5, 5, 6, 6, 6, 7, 7, 8 };
		int count = 0;
		int numberRepeated = 0;
		for (int i = 0; i < occurance.length; i++) {
			int count1 = 0;
			for (int j = i + 1; j < occurance.length; j++) {
				if (occurance[i] == occurance[j]) {
					count1++;
					if (count1 > count) {
						numberRepeated = occurance[j];
						count = count1;
					}
				}
			}
		}
		System.out.println("The number repeated is: " + numberRepeated);
		System.out.println("The number was repeated " + count + " times ");
	}
}
