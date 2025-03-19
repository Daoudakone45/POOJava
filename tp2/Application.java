public class Application {
  public static void main(String[] args) {
    var p1 = new Point(0.0, 0.0);
    var p2 = new Point(1.0, 1.0);

    var p3 =Point.middleStatic(p1, p2); // appel de la méthode statique
    System.out.println("Milieu avec la méthode statique: " + p3);
    var p4 = p1.middle(p2);// appel de la méthode d'instance
    System.out.println("Milieu avec la méthode d'instance: " + p4);

  }
}