package Book;

public class BookTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Book b = new Book();
		//b.setBookTitle("");
		
		
		//System.out.println(b.getBookTitle());
		//System.out.println(b.getAuthor());
		System.out.println(b.getDiscountedPrice(1233));
		System.out.println(b.getDiscountedPrice("Hello"));
		System.out.println(b.getFinalPrice());
	}

}
