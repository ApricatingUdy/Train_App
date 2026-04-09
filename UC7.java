import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

// Step 1: Create Bogie class
class Bogie {
    String name;
    int capacity;

    // Constructor
    Bogie(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
    }

    // toString() for clean printing
    public String toString() {
        return name + " (" + capacity + " seats)";
    }
}

public class TrainAppUC7 {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        // Step 2: Create list of bogies
        List<Bogie> bogies = new ArrayList<>();

        // Step 3: Add bogie objects
        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 60));
        bogies.add(new Bogie("First Class", 40));

        System.out.println("Before Sorting:");
        System.out.println(bogies);

        // Step 4: Sort using Comparator (by capacity)
        bogies.sort(Comparator.comparingInt(b -> b.capacity));

        // Step 5: Display sorted list
        System.out.println("After Sorting (by capacity):");
        System.out.println(bogies);
    }
}
