import java.time.LocalDate;
/*
 * Author: Alexa Wu
 * Class: CS-49J Section 1
 * Date: 9/23/2026
 */
public class Driver {
	public static void main(String[] args) {
		Book b1 = new Book("The Hobbit", "J.R.R. Tolkien", LocalDate.of(1937, 9, 21));
		Book b2 = new Book("The hobber", "Mr. Bookie", LocalDate.of(1980, 1, 13));
		Book b3 = new Book("BooOk BOOK", "Alexa Wu", LocalDate.of(2006, 12, 3));
		Book b4 = new Book("The Best Book", "Alexa Wu", LocalDate.of(2018, 4, 10));
		
		Library lib = new Library();
		
		lib.displayAllBooks();
		
		System.out.println();
		
		System.out.println("Number of Books in Library: " + lib.getTotalBookCount());
		
		System.out.println();
		
		lib.addBook(b1);
		lib.addBook(b2);
		lib.addBook(b3);
		lib.addBook(b4);

		lib.displayAllBooks();
		
		System.out.println();
		
		System.out.println("Number of Books in Library: " + lib.getTotalBookCount());
		
		System.out.println();
		
		System.out.println("Finding The bob: " + lib.findBookByTitle("The bob"));
		System.out.println("Finding The HOBBIT: " + lib.findBookByTitle("The HOBBIT"));
		
		System.out.println();

		
		System.out.println("Remove The hobber: " + lib.removeBookByTitle("The hobber"));
		System.out.println("Remove The bob: " + lib.removeBookByTitle("The bob"));
		
		System.out.println();

		
		lib.displayAllBooks();
		
		System.out.println();
		
		System.out.println("Number of Books in Library: " + lib.getTotalBookCount());
		
		System.out.println();
		
		System.out.println("Books by Alexa Wu: ");
		for(Book book : lib.findBooksByAuthor("Alexa Wu")) {
			System.out.println(book);
		}
		
		System.out.println();

		System.out.println("Books by Non Existent Author: ");
		for(Book book : lib.findBooksByAuthor("Non Existent Author")) {
			System.out.println(book);
		}	
		
		System.out.println();
		
		System.out.println("Add duplicate of The Hobbit: ");
		Book b5 = new Book("The Hobbit", "J.R.R. Tolkien", LocalDate.of(1937, 9, 21));
		lib.addBook(b5);
	}
}
