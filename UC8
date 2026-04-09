import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

// Reusing Bogie class
class Bogie {
    String name;
    int capacity;

    Bogie(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
    }

    public String toString() {
        return name + " (" + capacity + " seats)";
    }
}

public class TrainAppUC8 {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        // Step 1: Create bogie list
        List<Bogie> bogies = new ArrayList<>();
        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 60));
        bogies.add(new Bogie("First Class", 40));

        System.out.println("All Bogies:");
        System.out.println(bogies);

        // Step 2: Convert to stream & filter
        List<Bogie> filteredBogies = bogies.stream()
                .filter(b -> b.capacity > 60)   // condition
                .collect(Collectors.toList());

        // Step 3: Display filtered bogies
        System.out.println("Filtered Bogies (capacity > 60):");
        System.out.println(filteredBogies);
    }
}
