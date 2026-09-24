import java.time.LocalDate;
/*
 * Author: Alexa Wu
 * Class: CS-49J Section 1
 * Date: 9/23/2026
 */
public class Book {
	
	private String title; private String author;
	private LocalDate publicationDate;

	public Book() {
	}

	public Book(String title, String author, LocalDate publicationDate) {
		this.title = title;
		this.author = author;
		this.publicationDate = publicationDate;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}
	
	// Getter for author
	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}
	
	public LocalDate getPublicationDate() {
		return publicationDate;
	}

	public void setPublicationDate(LocalDate publicationDate) {
		this.publicationDate = publicationDate;
	}
	
	@Override
	public String toString() {
		return "Book [Title=" + title + ", Author=" + author + ", Publication=" + publicationDate + "]";
	}
	
	@Override
	public boolean equals(Object obj) {
		Book book = (Book) obj;
		if(this.getTitle() == book.getTitle()) {
			if(this.getAuthor().equals(book.getAuthor())) {
				return true;
			}
		}
		return false;
	}
}