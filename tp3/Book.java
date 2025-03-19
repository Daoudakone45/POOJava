import java.util.Objects;

public record Book(String title, String author){
	
	public Book {
        Objects.requireNonNull(title, "The title can't Null");
        Objects.requireNonNull(author, "the author can't Null");
    }

    public Book(String title){
        this(title, "No author");
    }

    //public void withTitle(String title) {
        //this.title = title;
      //}

    public Book withTitle(String newTitle) {
        Objects.requireNonNull(newTitle);
        return new Book(newTitle, this.author);
    }

    public boolean isFromTheSameAuthor(Book other){
        Objects.requireNonNull(other);
        return author.equals(other.author);

    }

    @Override
    public String toString(){
        return title +" By " + author ;
    }
}