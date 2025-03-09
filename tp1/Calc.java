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