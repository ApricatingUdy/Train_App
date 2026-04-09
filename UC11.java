import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class TrainAppUC11 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("=== Train Consist Management App ===");

        // Step 1: Input from user
        System.out.print("Enter Train ID (Format: TR1234): ");
        String trainId = sc.nextLine();

        System.out.print("Enter Cargo Code (Format: CG-567): ");
        String cargoCode = sc.nextLine();

        // Step 2: Define regex patterns
        String trainPattern = "TR\\d{4}";     // TR followed by 4 digits
        String cargoPattern = "CG-\\d{3}";    // CG- followed by 3 digits

        // Step 3: Compile patterns
        Pattern p1 = Pattern.compile(trainPattern);
        Pattern p2 = Pattern.compile(cargoPattern);

        // Step 4: Match inputs
        Matcher m1 = p1.matcher(trainId);
        Matcher m2 = p2.matcher(cargoCode);

        // Step 5: Validate
        if (m1.matches()) {
            System.out.println("Valid Train ID ✅");
        } else {
            System.out.println("Invalid Train ID ❌");
        }

        if (m2.matches()) {
            System.out.println("Valid Cargo Code ✅");
        } else {
            System.out.println("Invalid Cargo Code ❌");
        }

        System.out.println("Validation process completed.");
        sc.close();
    }
}
