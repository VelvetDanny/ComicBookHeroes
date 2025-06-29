import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class HeroManager {
    private ArrayList<Hero> heroes;

    /**
     * Constructor to initialize the HeroManager with an empty list of heroes.
     */
    public HeroManager() {
        this.heroes = new ArrayList<>();
    }

    /**
     * Adds a hero to the ArrayList.
     * @param hero The Hero object to be added.
     */
    public void addHero(Hero hero) {
        heroes.add(hero);
        System.out.println(hero.getName() + " has been added to the system.");
    }

    /**
     * Removes a hero by name from the ArrayList.
     * @param name The name of the hero to be removed.
     * @return true if the hero was found and removed, false otherwise.
     */
    public boolean removeHero(String name) {
        boolean removed = heroes.removeIf(hero -> hero.getName().equalsIgnoreCase(name));
        if (removed) {
            System.out.println(name + " has been removed from the system.");
        } else {
            System.out.println(name + " was not found in the system.");
        }
        return removed;
    }

    /**
     * Sorts heroes by their power level in ascending order using Bubble Sort.
     */
    public void sortHeroesByPowerBubbleSort() {
        int n = heroes.size();
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (heroes.get(j).getPowerLevel() > heroes.get(j + 1).getPowerLevel()) {
                    // Swap heroes.get(j) and heroes.get(j+1)
                    Hero temp = heroes.get(j);
                    heroes.set(j, heroes.get(j + 1));
                    heroes.set(j + 1, temp);
                }
            }
        }
        System.out.println("\nHeroes sorted by power level (Bubble Sort):");
        displayHeroesStandard();
    }

    /**
     * Sorts heroes by their power level in ascending order using Insertion Sort.
     */
    public void sortHeroesByPowerInsertionSort() {
        int n = heroes.size();
        for (int i = 1; i < n; i++) {
            Hero key = heroes.get(i);
            int j = i - 1;

            // Move elements of heroes[0..i-1], that are greater than key,
            // to one position ahead of their current position
            while (j >= 0 && heroes.get(j).getPowerLevel() > key.getPowerLevel()) {
                heroes.set(j + 1, heroes.get(j));
                j = j - 1;
            }
            heroes.set(j + 1, key);
        }
        System.out.println("\nHeroes sorted by power level (Insertion Sort):");
        displayHeroesStandard();
    }

    /**
     * Displays the list of heroes in a standard string format.
     */
    public void displayHeroesStandard() {
        if (heroes.isEmpty()) {
            System.out.println("No heroes in the system to display.");
            return;
        }
        for (Hero hero : heroes) {
            System.out.println(hero);
        }
    }

    /**
     * Displays the list of heroes in a two-dimensional array format.
     * Each row represents one hero, and each column displays their name, power level, and affiliation.
     */
    public void displayHeroesAs2DArray() {
        if (heroes.isEmpty()) {
            System.out.println("No heroes in the system to display in 2D array format.");
            return;
        }

        // Create a 2D array to hold hero data
        String[][] heroData = new String[heroes.size()][3]; // 3 columns: Name, Power Level, Affiliation

        for (int i = 0; i < heroes.size(); i++) {
            Hero hero = heroes.get(i);
            heroData[i][0] = hero.getName();
            heroData[i][1] = String.valueOf(hero.getPowerLevel()); // Convert int to String
            heroData[i][2] = hero.getAffiliation().name(); // Get enum name as String
        }

        System.out.println("\nHeroes in 2D Array Format:");
        // Use Arrays.deepToString() for printing 2D array contents
        System.out.println(Arrays.deepToString(heroData));
    }

    /**
     * Returns the current list of heroes. This can be useful for testing or further operations.
     * @return The ArrayList of Hero objects.
     */
    public ArrayList<Hero> getHeroes() {
        return heroes;
    }
}
