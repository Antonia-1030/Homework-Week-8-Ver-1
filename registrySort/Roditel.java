package registrySort;
import java.util.Scanner;

public class Roditel {
    public static String FIRST_NAME;
    public static String FAMILY_NAME;
    public static String KID_AGE;
    public static final String COL_DIVIDER     = " || ";

    public static void renderChildrenNames(){
        Scanner inputScanner= new Scanner(System.in);
        System.out.println("Vavedete kolko sa decata: ");
        int numberOfChildren = inputScanner.nextInt();
        System.out.println("Vavedete imanto(nata) na deteto(cata):\n");
        FIRST_NAME = new String();
        FAMILY_NAME = new String();
        System.out.println("Vavedete godinite na deteto(cata): \n");
        KID_AGE = new String();
        String[][] nameRegistry = new String[numberOfChildren][5];
        String[][] names = {
                {FIRST_NAME, COL_DIVIDER, FAMILY_NAME, COL_DIVIDER, KID_AGE},
        };
        names = nameRegistry;
    }
}
