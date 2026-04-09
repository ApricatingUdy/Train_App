import java.util.HashSet;
import java.util.Set;

public class TrainAppUC3 {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        // Step 1: Create a HashSet for unique bogie IDs
        Set<String> bogieIds = new HashSet<>();

        // Step 2: Add bogie IDs (duplicates will be ignored automatically)
        bogieIds.add("B101");
        bogieIds.add("B102");
        bogieIds.add("B103");
        bogieIds.add("B101"); // Duplicate
        bogieIds.add("B102"); // Duplicate

        // Step 3: Display unique bogie IDs
        System.out.println("Unique Bogie IDs: " + bogieIds);

        // Step 4: Show total count
        System.out.println("Total unique bogies: " + bogieIds.size());

        System.out.println("Duplicate entries were automatically ignored.");
    }
}
