public record Point(double x, double y) {

    // Ici je fais  la méthode statique
    public static Point middleStatic(Point p1, Point p2){
        var mid= new Point((p1.x + p2.x) / 2, (p1.y + p2.y) / 2);
        return mid ;
    }

    // La méthode d'instance ( J'utilise "other" pour prendre l'autre point)
    public Point middle(Point other){
        var mid = new Point((this.x + other.x) / 2, (this.y + other.y) / 2);
        return mid;
    }
    // Le rayon du cercle
    public double radius() {
        var r = Math.sqrt(x * x + y * y);
        return r;
    }

    // L'angle du cercle (La méthode sompe dans Math)
    public double theta(){
        var th = Math.atan2(y, x);
        return th;
    }

    // Méthode pour convertir un Point en coordonnées polaires
    public PolarCoordinates polarCoordinate() {
        return new PolarCoordinates(
            Math.sqrt(x * x + y * y), 
            Math.atan2(y, x)          
        );
    }
    

}
