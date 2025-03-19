import java.util.Objects;

public class Book2 {
    private final String title;
    private final String author;
    //private final String txt;
  
    public Book2(String title, String author) {
      Objects.requireNonNull(title);
      Objects.requireNonNull(author)
      this.title = title;
      this.author = author;
    }

    @Override
    public boolean equals(Object obj) {
        return obj instanceof Book2 book && title.equals(book.title) && author.equals(book.author);
        
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, author);
    }
    
    public static void main(String[] args) {
      var book1 = new Book2("Da Vinci Code", "Dan Brown");
      var book2 = new Book2("Da Vinci Code", "Dan Brown");
      System.out.println(book1.equals(book2));
    }
  }