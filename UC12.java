import java.util.ArrayList;
import java.util.List;

// Step 1: Create Bogie class
class GoodsBogie {
    String type;   // e.g., Cylindrical, Box
    String cargo;  // e.g., Petroleum, Coal

    GoodsBogie(String type, String cargo) {
        this.type = type;
        this.cargo = cargo;
    }

    public String toString() {
        return type + " (" + cargo + ")";
    }
}

public class TrainAppUC12 {

    public static void main(String[] args) {

        System.out.println("=== Train Safety Validation ===");

        // Step 2: Create goods bogie list
        List<GoodsBogie> bogies = new ArrayList<>();
        bogies.add(new GoodsBogie("Cylindrical", "Petroleum"));
        bogies.add(new GoodsBogie("Box", "Coal"));
        bogies.add(new GoodsBogie("Cylindrical", "Petroleum"));
        // Try unsafe case:
        // bogies.add(new GoodsBogie("Cylindrical", "Coal"));

        System.out.println("Train Bogies: " + bogies);

        // Step 3: Apply safety rule using allMatch()
        boolean isSafe = bogies.stream()
                .allMatch(b ->
                        // Rule: If cylindrical → only petroleum allowed
                        !b.type.equals("Cylindrical") ||
                        b.cargo.equals("Petroleum")
                );

        // Step 4: Display result
        if (isSafe) {
            System.out.println("Train is SAFE ✅");
        } else {
            System.out.println("Train is NOT SAFE ❌");
        }
    }
}
