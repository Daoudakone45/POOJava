
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