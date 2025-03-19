public class Main{
    public static void main(String[] args){
        var book = new Book("Da Vinci Code", "Dan Brown");
        //var weirdBook = new Book(null, "oops");
        var book2 = new Book("daouda");
        var book3 = book2.withTitle("uzfh"); 
        System.out.println(book3);

    }
}