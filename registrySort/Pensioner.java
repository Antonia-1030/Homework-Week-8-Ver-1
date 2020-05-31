package registrySort;
import java.util.Scanner;

public class Pensioner {
    public static Scanner inputScanner = new Scanner(System.in);
    public static void renderPensioner() {
        System.out.println(" {P} \nVavedete pensia:");
        int pensia = inputScanner.nextInt();
        System.out.println("Pensia: " + pensia);
    }
}
