
# Exercice 1


# Exercice 2

## Le code de le question 1

public class PrintArgs {
  public static void main(String[] args){
    
    System.out.println(args[0]);
      
    }
}

## Question 2

Quand il n'y a pas d'argument il code renvoie une exception à l'exécution:

daouda.kone@pccop1b131-15:~/Java/tp1$ java PrintArgs
Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0
        at PrintArgs.main(PrintArgs.java:4)

## Question 3

ublic class PrintArgs {
  public static void main(String[] args){
    for (int i=0; i < args.length ; i++){
        System.out.println(args[i]);
    }
 }
}

## Question 4

public class PrintArgs {
  public static void main(String[] args){
   
    for (var arg : args){
        System.out.println(arg);
    }
 }
}


# Exercice 3

## Question 1


## Question 2

**Value** est une variable de type **entier**
**scanner** est un objet de type **Scanner**

import java.util.Scanner; 

public class Calc { 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int value = scanner.nextInt();
        // compléter ici
    }
}

## Question 3

La ligne **import java.util.Scanner;** permet d'importer un package en java comme en python.

- **import** est le mot clé pour faire de l'importation
- **java** est le package principal qui contient tous les classes standards de java
- **util** Contient les classes utilitaires notation **Scanner** qui lui contient les fonctions utilisées pour lire les entrées de l'utilisateur.


## Question 4

import java.util.Scanner; 

public class Calc { 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Entrez lé premier nombre: ");
        int a = scanner.nextInt();

        System.out.println("Entrez le deuxième nombre: ");
        int b = scanner.nextInt();

        int sum = a + b;

        System.out.println("La somme est:" + sum);

    
        //int value = scanner.nextInt();
        // compléter ici
    }
}



## Question 5

import java.util.Scanner; 

public class Calc { 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Entrez lé premier nombre: ");
        int a = scanner.nextInt();

        System.out.println("Entrez le deuxième nombre: ");
        int b = scanner.nextInt();

        int sum = a + b;
        int diff = a - b;
        int pro = a*b ;
        int res = a%b ;
        int quot = a/b;


        System.out.println("La somme est:" + sum);
        System.out.println("La difference est:" + diff);
        System.out.println("Le produit est:" + pro);
        System.out.println("Le reste est:" + res);
        System.out.println("Le quotient est:" + quot);

    
        //int value = scanner.nextInt();
        // compléter ici
    }
}

# Execice 4

## Question 1

La commande pour exécuté la fichier Point.java est : **javac --release 23 --enable-preview  Point.java ** Selon le cours en classe.

## Question 2

public class PointTest {
    public static void main(String[] args) {
        var point1 = new Point(0, 5);
        System.out.println(point1);
    }
}
J'ai suivie la méthode de la prof du cours donc j'ai créé un nouveau fichier PointTest.java où j'ai créé mon point et j'ai compilé les deux fichiers ensemble avec la commande **javac --release 23 --enable-preview  Point.java PointTest.java **

## Question 3

J'ai écris cette partie du code de fichier PointTest.java

public class PointTest {
    public static void main(String[] args) {
        //var point = new Point(0, 5);
        //System.out.println(point);
        
        int x = Integer.parseInt(args[0]);
        int y = Integer.parseInt(args[1]);
        var point = new Point(x, y);
        System.out.println(point);
    }
}



## Question 4

Le static veut que dit que la méthode ne s'applique qu'à la classe elle-même et non à une instance particulière de la classe.

## Question 5

Lorsqu'il n'y a pas l'un des arguments n'est pas une nombre on a une exception:

kddaouda@Daouda:~/Esiee/Java/tp1$ java --enable-preview PointTest 4 d
Exception in thread "main" java.lang.NumberFormatException: For input string: "d"
        at java.base/java.lang.NumberFormatException.forInputString(NumberFormatException.java:67)
        at java.base/java.lang.Integer.parseInt(Integer.java:588)
        at java.base/java.lang.Integer.parseInt(Integer.java:685)
        at PointTest.main(PointTest.java:8)

## Question 6

## Question 7

Danbs le fichier PointTest.java j'ai mis:

public class PointTest {
    public static void main(String[] args) {
        //var point = new Point(0, 5);
        //System.out.println(point);
        
        int x = Integer.parseInt(args[0]);
        int y = Integer.parseInt(args[1]);
        var point = new Point(x, y);
        var distance = point.distanceToOrigin();

        System.out.println("x = " + x + ", y = " + y);
        System.out.println(point);
        System.out.println("dist = " + distance);

        
    }
}


et dans le fichier Point.java j'ai mis:

public record Point(int x, int y){
    double distanceToOrigin() {
        return Math.sqrt(x * x + y * y);
    }
}

J'avais utilisé **This** sur X et Y pour faire les tests mais j'ai enlévé comme la prof en cours dans le cas il n'y pas ambiguïté donc il n'est pas nécessaire de mettre ce mot clé.


# Exercice 5

## Question 1

## Question 2

## Question 3

public double perimetre(){
        return Math.PI * radius * 2 ;
    }

## Question 4

public static double area(){
    return Math.PI * radius * radius;
}


## Question 5

 public double distanceBetween(Circle other) {
        double dx = other.center.x() - center.x();
        double dy = other.center.y() - center.y();
        
        double dist = Math.sqrt(dx * dx + dy * dy);
        return dist - (radius + other.radius);
    }

Cette méthode marche et calcule la distance entre deux cercles. Mais on remarque que si les cercles se chevauchent la distance dévient négative. On peut gérer en mettant une condition qui verifier si la somme des rayons des deux cercles est supérieur à la distance entre les deux centres des cercles; dans ce cas on peut retourner une phrase pour indiquer qu'ils se chevauchent. Mais nous n'avons pas encore fait les conditions en java donc je ne l'ai pas fait pour ne pas me planter.


## Question 6

public boolean intersect(Circle other) {
        double dx = other.center.x() - center.x();
        double dy = other.center.y() - center.y();
        double dist = Math.sqrt(dx * dx + dy * dy);
        
        return dist <= (radius + other.radius);
    }
Comme je l'avais dit dans la question précédente les cercles peuvent se chevaucher. Je crois que cette question resoud le problème.

## Qestion 7



