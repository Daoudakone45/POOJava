public class PolarConverter {
    public static void main(String[] args) {
     var point = new Point(3,4);

     var th = point.theta();
     var r = point.radius();

     var polar = point.polarCoordinate();
     //System.out.println("Les coordonnées polaires de " + point + " sont: " + "(" + r + ", " + th + ")");
     System.out.println("Les cordonnées polaire de " + point + " sont: " + polar);
    }
}