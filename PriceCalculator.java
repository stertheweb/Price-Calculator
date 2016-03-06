/* This program calculates the cost of 3 different books that are being ordered.
 */
import java.util.Scanner;

public class PriceCalculator {

	public static void main(String[] args) {
		/* Declarations */
		final double bookOnePrice = 32.46; // 'Design Patterns'
		final double bookTwoPrice = 35.48; // 'Effective Java'
		final double bookThreePrice = 27.86; //	'Java Puzzlers'
		final double salesTaxRate = 0.0625; 
		double bookOneTotal = 0.0;
		double bookTwoTotal = 0.0;
		double bookThreeTotal = 0.0;
		double salesTax;
		double subtotal = 0.0;
		double total = 0.0;
		int bookOneCopies = 0;
		int bookTwoCopies = 0;
		int bookThreeCopies = 0;

		/* Greeting & Inputs*/
		System.out.println("Hello! This program will calcuate the total cost of ");
		System.out.println("your book order.");
		System.out.println("How many copies did you get of 'Design Patterns'?");
		Scanner scan = new Scanner (System.in);
		bookOneCopies = scan.nextInt();
		System.out.println("How many copies did you get of 'Effective Java'?");
		bookTwoCopies = scan.nextInt();
		System.out.println("How many copies did you get of 'Java Puzzlers'?");
		bookThreeCopies = scan.nextInt();

		/* Calculations */
		bookOneTotal = bookOneCopies * bookOnePrice;
		bookTwoTotal = bookTwoCopies * bookTwoPrice;
		bookThreeTotal = bookThreeCopies * bookThreePrice;
		subtotal = bookOneTotal + bookTwoTotal + bookThreeTotal;
		salesTax = subtotal * salesTaxRate;
		total = subtotal + salesTax;

		/* Output */
		System.out.println("The total cost of your purchases is:");
		System.out.println("$" + subtotal + ".");
		System.out.println("Sales Tax is: $" + salesTax + ".");
		System.out.println("The total cost of your order will be:");
		System.out.println("$" + total + ".");
	}
}
