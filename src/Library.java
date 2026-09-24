import java.util.ArrayList;
/*
 * Author: Alexa Wu
 * Class: CS-49J Section 1
 * Date: 9/23/2026
 */
public class Library {
	private ArrayList<Book> books;
	private int numBooks;
	
	Library() {
		books = new ArrayList<>();
		numBooks = 0;
	}
	
	public void addBook(Book book) {
		books.add(book);
		numBooks++;
	}
	
	public void displayAllBooks() {
		System.out.println("Books in Library:");
		for(Book book : books) {
			System.out.println(book);
		}
	}
	
	public Book findBookByTitle(String title) {
		String titleLower = title.toLowerCase();
		
		for(int i = 0; i < numBooks; i++) {
			if(titleLower.equals(books.get(i).getTitle().toLowerCase())) {
				return books.get(i);
			}
		}
		return null;
	}
	
	public boolean removeBookByTitle(String title) {
		Book book = findBookByTitle(title);
		
		if(book != null) {
			numBooks--;
			return books.remove(book);
		}
		
		return false;
	}
	
	ArrayList<Book> findBooksByAuthor(String author) {
		String authorLower = author.toLowerCase();
		ArrayList<Book> booksByAuthor = new ArrayList<>();
		
		for(int i = 0; i < numBooks; i++) {
			if(authorLower.equals(books.get(i).getAuthor().toLowerCase())) {
				booksByAuthor.add(books.get(i));
			}
		}
		return booksByAuthor;
	}
}
