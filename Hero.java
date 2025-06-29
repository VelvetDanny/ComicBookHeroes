public class Hero {
    private String name;
    private int powerLevel;
    private Affiliation affiliation;

    /**
     * Constructor to initialize a new Hero object.
     * @param name The name of the hero.
     * @param powerLevel The power level of the hero.
     * @param affiliation The team or group the hero belongs to.
     */
    public Hero(String name, int powerLevel, Affiliation affiliation) {
        this.name = name;
        this.powerLevel = powerLevel;
        this.affiliation = affiliation;
    }

    // Getter methods for each attribute

    public String getName() {
        return name;
    }

    public int getPowerLevel() {
        return powerLevel;
    }

    public Affiliation getAffiliation() {
        return affiliation;
    }

    /**
     * Returns a string representation of the Hero object.
     * @return A formatted string with the hero's name, power level, and affiliation.
     */
    @Override
    public String toString() {
        return "Hero [Name: " + name + ", Power Level: " + powerLevel + ", Affiliation: " + affiliation + "]";
    }
}
