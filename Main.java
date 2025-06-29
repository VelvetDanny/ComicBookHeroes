import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("--- Comic Book Hero Management System ---");

        // 1. Instantiate the HeroManager.
        HeroManager manager = new HeroManager();

        // 2. Add at least four heroes to the system with various names, power levels, and affiliations.
        System.out.println("\n--- Adding Initial Heroes ---");
        manager.addHero(new Hero("Spider-Man", 75, Affiliation.AVENGERS));
        manager.addHero(new Hero("Batman", 85, Affiliation.JUSTICE_LEAGUE));
        manager.addHero(new Hero("Wolverine", 90, Affiliation.X_MEN));
        manager.addHero(new Hero("Wonder Woman", 95, Affiliation.JUSTICE_LEAGUE));
        manager.addHero(new Hero("Human Torch", 70, Affiliation.FANTASTIC_FOUR));
        manager.addHero(new Hero("Iron Man", 80, Affiliation.AVENGERS));


        // 3. Display the original list of heroes.
        System.out.println("\n--- Original List of Heroes ---");
        manager.displayHeroesStandard();

        // 4. Use both sorting methods (Bubble Sort and Insertion Sort) to sort the heroes by power level.
      
        // Create a fresh list of heroes for Bubble Sort demo
        HeroManager bubbleSortManager = new HeroManager();
        bubbleSortManager.addHero(new Hero("Spider-Man", 75, Affiliation.AVENGERS));
        bubbleSortManager.addHero(new Hero("Batman", 85, Affiliation.JUSTICE_LEAGUE));
        bubbleSortManager.addHero(new Hero("Wolverine", 90, Affiliation.X_MEN));
        bubbleSortManager.addHero(new Hero("Wonder Woman", 95, Affiliation.JUSTICE_LEAGUE));
        bubbleSortManager.addHero(new Hero("Human Torch", 70, Affiliation.FANTASTIC_FOUR));
        bubbleSortManager.addHero(new Hero("Iron Man", 80, Affiliation.AVENGERS));

        bubbleSortManager.sortHeroesByPowerBubbleSort(); // This will also display the sorted list

        // Create another fresh list of heroes for Insertion Sort demo
        HeroManager insertionSortManager = new HeroManager();
        insertionSortManager.addHero(new Hero("Spider-Man", 75, Affiliation.AVENGERS));
        insertionSortManager.addHero(new Hero("Batman", 85, Affiliation.JUSTICE_LEAGUE));
        insertionSortManager.addHero(new Hero("Wolverine", 90, Affiliation.X_MEN));
        insertionSortManager.addHero(new Hero("Wonder Woman", 95, Affiliation.JUSTICE_LEAGUE));
        insertionSortManager.addHero(new Hero("Human Torch", 70, Affiliation.FANTASTIC_FOUR));
        insertionSortManager.addHero(new Hero("Iron Man", 80, Affiliation.AVENGERS));

        insertionSortManager.sortHeroesByPowerInsertionSort(); // This will also display the sorted list

        // Continue with the original manager instance for dynamic management demo
        System.out.println("\n--- Dynamic Management Demo (Using original manager) ---");

        // 5. Remove a hero by name to demonstrate dynamic management.
        manager.removeHero("Batman"); // Example: Remove Batman
        System.out.println("\n--- List After Removing Batman ---");
        manager.displayHeroesStandard();

        // 6. Add a new hero to demonstrate adding functionality.
        manager.addHero(new Hero("Flash", 88, Affiliation.JUSTICE_LEAGUE)); // Example: Add Flash
        System.out.println("\n--- List After Adding Flash ---");
        manager.displayHeroesStandard();

        // 7. Display the hero list in both standard and two-dimensional array formats.
        System.out.println("\n--- Final List (Standard Format) ---");
        manager.displayHeroesStandard();

        System.out.println("\n--- Final List (2D Array Format) ---");
        manager.displayHeroesAs2DArray();
    }
}
