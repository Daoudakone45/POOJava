
#  COMPTE RENDU DU TP4

# Exercice 1

## Question 1

## Question 2

kddaouda@Daouda:~/Esiee/Java/tp4$ java --version
openjdk 23.0.2 2025-01-21
OpenJDK Runtime Environment (build 23.0.2+7-Ubuntu-1ubuntu124.04)
OpenJDK 64-Bit Server VM (build 23.0.2+7-Ubuntu-1ubuntu124.04, mixed mode, sharing)
kddaouda@Daouda:~/Esiee/Java/tp4$ 

## Question 3
public class Main{
    public static void main(String [] args){
        System.out.println("Hello Eclipse");
    }
}

## Question 4


# Exercice2


## Question 1

```java
public class Library {
	private final ArrayList<Book> books;
	
	public Library() {
		this.books = new ArrayList<Book>();
	}
}
```

## Question 2

```java
public void addbook(Book book) {
		Objects.requireNonNull(book);
		books.add(book);
	}
```

## Question 3

```java
public Book findByTitle (String title) {
		Objects.requireNonNull(title);
		for (var book: books) {
			if(book.title() == title)
				return book;
		}
		return null ;
	}
```

## Question 4

Le compilateuru utilise la méthode itérative pour faire la collection (**// Method java/util/ArrayList.iterator:()Ljava/util/Iterator;**).
Et à une meéthode **hasNext()** (// InterfaceMethod java/util/Iterator.hasNext:()Z).

## Question 5

On renvoie **null** pour permet au code de tourner. Si on fait une exception notre code s'arrêtera et il se peut que nopus voulions continuer notre recherche.

## Question 6
```java
@Override
	public String toString() {
		var str = new StringBuilder();
		str.append("Library: \n");
		for(var book : books) {
			str.append(book).append("\n");
		}
		return str.toString();
		
		
	}
```


# Exercice 3

## Question 1

La complexité de findByTitle est : O(n)

## Question 2

Implémentation de l' interface Map basée sur une table de hachage . Cette implémentation fournit toutes les opérations de mappage facultatives et autorise les valeurs nulles et la clé nulle .

Pour améliorer le code de **findByTitle** en utilisasant la classe **java.util.HashMap** on peut la recherche par clé dans les livres. Dans ce cas on aura une complexité de O(1).


## Question 3







