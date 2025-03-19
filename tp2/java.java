ˋ``java
public static void prompt(){

    public record PolarCoordinates(double r, double theta) {

        public PolarCoordinates {
            if (r < 0) {
                throw new IllegalArgumentException("Le rayon r doit être positif.");
            }
            if (theta < -Math.PI || theta > Math.PI) {
                throw new IllegalArgumentException("L'angle theta doit être compris entre -π et π.");
            }
        }
    
        @Override
        public String toString() {
            return "(" + r + ", " + theta + ")";
        }
    }
    
}
``` 
