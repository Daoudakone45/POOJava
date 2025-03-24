import java.util.Objects;
import java.util.concurrent.ThreadLocalRandom;

public record Price(int copperTotal) {
    public static final int SILVER_PER_GOLD = 13;
    public static final int COPPER_PER_SILVER = 25;

    public Price {
        if (copperTotal < 0) {
            throw new IllegalArgumentException("Invalid price.");
        }
    }

    // Constructeur avec or, argent et cuivre
    public Price(int gold, int silver, int copper) {
        this(gold * SILVER_PER_GOLD * COPPER_PER_SILVER + silver * COPPER_PER_SILVER + copper);
    }

    // Constructeur avec or et argent uniquement (cuivre par défaut à 0)
    public Price(int gold, int silver) {
        this(gold, silver, 0);
    }

    // Récupère le nombre de pièces d'or
    private int gold() {
        return copperTotal / (SILVER_PER_GOLD * COPPER_PER_SILVER);
    }

    // Récupère le nombre de pièces d'argent
    private int silver() {
        return (copperTotal % (SILVER_PER_GOLD * COPPER_PER_SILVER)) / COPPER_PER_SILVER;
    }

    // Récupère le nombre de pièces de cuivre restantes
    private int copper() {
        return copperTotal % COPPER_PER_SILVER;
    }

    @Override
    public String toString() {
        return gold() + "g, " + silver() + "s and " + copper() + "c";
    }
    
    public static Price randomBelow(Price cost) {
        Objects.requireNonNull(cost);
        var rng = ThreadLocalRandom.current();
        return new Price(rng.nextInt(cost.copperTotal));
    }

    public boolean isLowerThan(Price other) {
        Objects.requireNonNull(other);
        return this.copperTotal < other.copperTotal;
    }

    public Price substract(Price other) {
        Objects.requireNonNull(other);
        if (this.isLowerThan(other)) {
            throw new IllegalArgumentException("Not enough gold pieces.");
        }
        return new Price(this.copperTotal - other.copperTotal);
    }
}
