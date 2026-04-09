import java.util.ArrayList;
import java.util.List;

public class TrainAppUC2 {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        // Step 1: Create ArrayList for passenger bogies
        List<String> bogies = new ArrayList<>();

        // Step 2: Add bogies (CREATE)
        bogies.add("Sleeper");
        bogies.add("AC Chair");
        bogies.add("First Class");

        // Step 3: Display bogies (READ)
        System.out.println("Bogies after addition: " + bogies);

        // Step 4: Remove a bogie (DELETE)
        bogies.remove("AC Chair");
        System.out.println("After removing AC Chair: " + bogies);

        // Step 5: Check existence (SEARCH)
        if (bogies.contains("Sleeper")) {
            System.out.println("Sleeper bogie exists in the train.");
        } else {
            System.out.println("Sleeper bogie not found.");
        }

        // Final state
        System.out.println("Final train consist: " + bogies);
    }
}
