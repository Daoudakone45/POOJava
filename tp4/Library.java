import java.util.ArrayList ;
import java.util.Objects;


public class Library {
/* 	private final ArrayList<Book> books;
	
	public Library() {
		this.books = new ArrayList<Book>();
	}
	
	public void addbook(Book book) {
		Objects.requireNonNull(book);
		books.add(book);
	}
	
	public Book findByTitle (String title) {
		Objects.requireNonNull(title);
		for (var book: books) {
			if(book.title().equals(title))
				return book;
		}
		return null ;
	}
	
	@Override
	public String toString() {
		var str = new StringBuilder();
		str.append("Library: \n");
		for(var book : books) {
			str.append(book).append("\n");
		}
		return str.toString();
		
		
	}
	
	public static void main(String[] args) {
        Library library = new Library();
        Book book = new Book("Da Vinci Code", "Dan Brown");
        library.addbook(book);
        System.out.println(library.findByTitle("Da Vinci Code"));
        System.out.println(library);
    }
*/
	private final HashMap <String, Book> books;

	public Library(){
		

	}

	public void addbook(Book book){


	}

	public Book findByTitle (String title){

	}
}


