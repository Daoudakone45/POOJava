import java.util.Objects;

public record Price(int gold, int silver) {
    public static final int SILVER_PER_GOLD = 13;

    // il faut s'arranger à ce que le constructeur ne fasse pas de calcul
    // Je dois créer une autre methode pour faire les calcul
    
    public Price(int gold, int silver) {
        
        if(gold < 0 || silver < 0){
            throw new IllegalArgumentException("Gold and silver cannot be negative");

        }
               
        this.gold = gold + silver / SILVER_PER_GOLD;
        this.silver = silver % SILVER_PER_GOLD;
    }

    public boolean canAfford(Price other) {
        Objects.requireNonNull(other);
        return toSilver() >= other.toSilver();
    }

    public Price subtract(Price other) {
        Objects.requireNonNull(other);
        int totalSilver = toSilver() - other.toSilver();
        return fromSilver(totalSilver);
    }

    public static Price fromSilver(int totalSilver) {
        Objects.requireNonNull(totalSilver);
        return new Price(totalSilver / SILVER_PER_GOLD, totalSilver % SILVER_PER_GOLD);
    }

    private int toSilver() {
        return gold * SILVER_PER_GOLD + silver;
    }

    @Override
    public String toString() {
        return gold + "g and " + silver + "s";
    }
}
