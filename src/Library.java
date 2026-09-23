import java.util.ArrayList;

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
		for(Book book : books) {
			System.out.println(book);
		}
	}
	
	public Book findBookByTitle(String title) {
		for(int i = 0; i < numBooks; i++) {
			if(title.toLowerCase().equals(books.get(i).getTitle().toLowerCase())) {
				return books.get(i);
			}
		}
		return null;
	}
}
