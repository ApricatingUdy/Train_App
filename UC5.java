import java.util.LinkedHashSet;

public class TrainAppUC5 {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        // Step 1: Create LinkedHashSet for ordered & unique bogies
        LinkedHashSet<String> trainFormation = new LinkedHashSet<>();

        // Step 2: Add bogies
        trainFormation.add("Engine");
        trainFormation.add("Sleeper");
        trainFormation.add("Cargo");
        trainFormation.add("Guard");

        // Step 3: Attempt duplicate insertion
        trainFormation.add("Sleeper"); // Duplicate (ignored)

        // Step 4: Display final formation
        System.out.println("Final Train Formation: " + trainFormation);
    }
}
