package registrySort;
import java.util.Scanner;
import java.util.regex.Pattern;

public class MainForm {
    public static Scanner inputScanner= new Scanner(System.in);
    public static boolean isProgramRunning = true;

    public static void main(String[] args){
while(isProgramRunning){
//Ime
        System.out.println("Vavedete parvo ime: ");
        String firstName = new String();
        if (isStringOnlyLetters() && isFirstLetterCapital()){
            System.out.print("{" +firstName +"}");
        }
        else {System.out.println("Greska! Vavedete otnovo!!");}

//Familia
        System.out.println("Vavedete familno ime: ");
        String familyName = new String();
        if (isStringOnlyLetters() && isFirstLetterCapital()){
            System.out.print("{"+familyName+"}");
        }
        else {System.out.println("Greshka! Vavedete otnovo!!");}

//Godini
        correctAge();

//Adres
        System.out.println("Vavedete adres: ");
        String addressOfPerson = new String();
        System.out.println("Adres: " + addressOfPerson);

//Telefon
        System.out.println("Vavedete telefonen nomer: ");
        int[] telefonenNomer = new int[10];
        System.out.println("Telefon: " + telefonenNomer);
//Pol
        renderGenderMenu();
        String izbranPol;
        int izborPol = inputScanner.nextInt();

        if (izborPol == 1){
            izbranPol = " M ";
            System.out.println("Pol: " + izbranPol);
        }
        if (izborPol == 2){
            izbranPol = " F ";
            System.out.println("Pol: " + izbranPol);
        }

//Menu izbor ot: pensioner, maika s deca, rabotesht
        System.out.println("Izberete vid: ");
        int izbor = inputScanner.nextInt();
        renderPeopleMenu();

        if (izbor == 1){
            Pensioner.renderPensioner();
        }
        if (izbor == 2){
            Rabotesht.renderRabotesht();
        }
        if (izbor == 3){
            Roditel.renderChildrenNames();
        }
        if(izbor==4){
        renderFullData();
        }
        if(izbor == 5){
        isProgramRunning = false;
        }
}

    }
    //render menu
    public static void renderPeopleMenu(){
        System.out.println("1. Pensioner ");
        System.out.println("2. Rabotesht ");
        System.out.println("3. Maika");
        System.out.println("4. Show data");
        System.out.println("5. Stop");
    }
    //is age correct
    public static void correctAge(){
        System.out.println("Vavedete godini: ");
        int godini = inputScanner.nextInt();
        if (godini<0 && godini>100){
            System.out.println("Greska! Vavedete otnovo.");
        }
        System.out.println("Vazrast: " + godini);
    }
    //menu for gender
    public static void renderGenderMenu(){
        System.out.println("Izberete pol:\n ");
        System.out.println("1. Male ");
        System.out.println("2. Female ");
        //System.out.println("3. Cheese sandwich ");
    }
    
    //proverka dali ime i familia sa verni
    public static boolean isStringOnlyLetters(){
        String s;
        if (Pattern.matches("[a-zA-Z]+",s)){
            return true;
        }
        return false;
    }
    public static boolean isFirstLetterCapital(){
        String s
        for(int i=0; i<s.length(); ){
            if(Character.isUpperCase(s.charAt(i))){
                return true;
            }
            return false;
        }
    }
   
    public static void renderSortMenu(){
        System.out.println("Izberete sortirovka:\n1.Sortirane po parvo ime\n2.Sortirane po familno ime\n3.Sortirane po godini ");
        int sortChoice = inputScanner.nextInt();
        if(sortChoice == 1){
            nameSort();
        }
        if(sortChoice == 2){
        familyNameSort();
        }
        if(sortChoice == 3){
        ageSort();
        }
    }
    
    public static String nameSort(){
        System.out.println("Sortirane po parvo ime: ");
        String searchedName = new String();
        if(firstName == searchedName){
            return firstName;
        }
    }
    
    public static String familyNameSort(){
       System.out.println("Sortirane po familno ime: ");
       String searchedFamilyName = new String();
        if(familyName == searchedFamilyName){
        return familyName;
        }
    }
    
    public static int ageSort(){
    System.out.println("Sortirane po vazrast: ");
        int searchedAge = inputScanner.nextInt();
        if(godini == searchedAge){
        return godini;
        }
    }
}
