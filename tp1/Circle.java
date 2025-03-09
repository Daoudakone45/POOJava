public record Circle(Point center, double radius) {

    public double perimetre(){
        return Math.PI * radius * 2 ;
    }

    public double area(){
        return Math.PI * radius * radius;
    }

    public double distanceBetween(Circle other) {
        double dx = other.center.x() - center.x();
        double dy = other.center.y() - center.y();
        
        double dist = Math.sqrt(dx * dx + dy * dy);
        return dist - (radius + other.radius);
    }

    public boolean intersect(Circle other) {
        double dx = other.center.x() - center.x();
        double dy = other.center.y() - center.y();
        double dist = Math.sqrt(dx * dx + dy * dy);
        
        return dist <= (radius + other.radius);
    }



    public static void main(String[] args){
       // var circle = new Circle(new Point(0, 0), 1.0);
        //var aire = circle.area();

        var circle1 = new Circle(new Point(1, 1), 2.0);
        var circle2 = new Circle(new Point(2, 4), 3.0);
        var circle3 = new Circle(new Point(5, 5), 1.0);
        var circle4 = new Circle(new Point(3, 2), 7.0);
        System.out.println(circle1);
        System.out.println(circle2);
        double distance = circle1.distanceBetween(circle2);
        System.out.println("La distance entre deux cercles est ; " + distance);
        System.out.println("circle1 intersecte circle3 ? " + circle1.intersect(circle3));
        System.out.println("circle1 intersecte circle4 ? " + circle1.intersect(circle4));
        //System.out.println("L'aire de certcle est : " + aire);

    }
}
