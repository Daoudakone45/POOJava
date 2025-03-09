public record Point(int x, int y){
    double distanceToOrigin() {
        return Math.sqrt(x * x + y * y);
    }
}