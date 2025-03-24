import java.util.LinkedHashMap;
import java.util.HashMap;
import java.util.Objects;
//import java.util.ArrayList;


public class Library {
    // Remplacement de l'ArrayList par une HashMap pour optimiser la recherche par titre
    private final LinkedHashMap<String, Book> books;

    
    public Library() {
        this.books = new LinkedHashMap<>();
    }

    
    public void addbook(Book book) {
        Objects.requireNonNull(book);
        
        if (books.containsKey(book.title())) {
            throw new IllegalArgumentException("A book with this title already exists : " + book.title());
        }

        books.put(book.title(), book);
    }

    
    public Book findByTitle(String title) {
        Objects.requireNonNull(title);
        return books.get(title);  // Recherche instantanée en O(1) en moyenne
    }
/*
	public void removeAllBooksFromAuthor(String author) {
		Objects.requireNonNull(author);
		
		for (Book book : books.values()) {
			if (book.author().equals(author)) {
				books.remove(book.title()); // Suppression directe dans for-each
			}
		}
	}
*/

	/* 
	public void removeAllBooksFromAuthor(String author) {
        Objects.requireNonNull(author);

        // Utilisation d'un Iterator pour éviter ConcurrentModificationException
        Iterator<Book> iterator = books.values().iterator();
        while (iterator.hasNext()) {
            Book book = iterator.next();
            if (book.author().equals(author)) {
                iterator.remove();  // Supprime l'entrée actuelle de la LinkedHashMap
            }
        }
    }
	*/

	// En une seule ligne

	public void removeAllBooksFromAuthor(String author) {
		Objects.requireNonNull(author);
		books.values().removeIf(book -> book.author().equals(author));
	}


	@Override
	public String toString() {
		var str = new StringBuilder("Library:\n");
		for (Book book : books.values()) {  // books.values() retourne la collection des livres
			str.append(book).append("\n");  // Utilisation du toString() de Book
		}
		return str.toString();
	}
    // Ancienne implémentation basée sur une ArrayList (commentée pour archivage)
    /*
    private final ArrayList<Book> books;
    
    public Library() {
        this.books = new ArrayList<Book>();
    }

    public void addbook(Book book) {
        Objects.requireNonNull(book);
        books.add(book);
    }

    public Book findByTitle(String title) {
        Objects.requireNonNull(title);
        for (var book : books) {
            if (book.title().equals(title))
                return book;
        }
        return null;
    }
    */

	 public static void main(String[] args) {
        Library library = new Library();
        library.addbook(new Book("Da Vinci Code", "Dan Brown"));
        library.addbook(new Book("Inferno", "Dan Brown"));
        library.addbook(new Book("1984", "George Orwell"));
        library.addbook(new Book("Harry Potter", "J.K. Rowling"));

        System.out.println("Avant suppression :");
        System.out.println(library);

        // Suppression des livres de Dan Brown
        library.removeAllBooksFromAuthor("Dan Brown");

        System.out.println("Après suppression :");
        System.out.println(library);
    }
}
