package Book;
import java.util.Scanner;

public class Book {

	private String bookTitle;
	private String author;
	private int isbnCode;
	private double originalPrice;
	private double finalPrice;
	private Scanner sc = new Scanner(System.in);


	

	public Book() {
		
		this.bookTitle = "Hello";
		this.author = "Hi";
		this.isbnCode = 1111;
		this.originalPrice = 100;
		this.finalPrice = 0;
	}

	public Book(String bookTitle, String author) {
		super();
		this.bookTitle = bookTitle;
		this.author = author;
	}

	public Book(String bookTitle, String author, int isbnCode,
			double originalPrice) {
		super();
		this.bookTitle = bookTitle;
		this.author = author;
		this.isbnCode = isbnCode;
		this.originalPrice = originalPrice;
	}

	public String getBookTitle() {
		return bookTitle;
	}

	public void setBookTitle(String bookTitle) {
		bookTitle = sc.nextLine();
		this.bookTitle = bookTitle;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		author = sc.nextLine();
		this.author = author;
	}

	public int getIsbnCode() {
		return isbnCode;
	}

	public void setIsbnCode(int isbnCode) {
		isbnCode = sc.nextInt();
		this.isbnCode = isbnCode;
	}

	public double getOriginalPrice() {
		return originalPrice;
	}

	public void setOriginalPrice(double originalPrice) {
		originalPrice = sc.nextDouble();
		this.originalPrice = originalPrice;
	}

	public double getFinalPrice() {
		return finalPrice;
	}

	public void setFinalPrice(double finalPrice) {
		this.finalPrice = finalPrice;
	}

	public double getDiscountedPrice(String ni) {
		double discount = this.originalPrice * 0.1;
		this.finalPrice = this.originalPrice - discount;
		return this.originalPrice - discount;
	}

	public double getDiscountedPrice(int en) {
		double discount = this.originalPrice * 0.2;
		this.finalPrice = this.originalPrice - discount;
		return this.originalPrice - discount;
	}

}
