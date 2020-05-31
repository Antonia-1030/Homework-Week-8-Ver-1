package registrySort;
import java.util.Scanner;
import java.util.regex.Pattern;

public class MainForm {
    public static Scanner inputScanner= new Scanner(System.in);

    public static void main(String[] args){

//Ime
        System.out.println("Vavedete parvo ime: ");
        String firstName = new String();
        if (isStringOnlyLetters() && isFirstLetterCapital()){
            System.out.print(firstName);
        }
        else {System.out.println("Greska! Vavedete otnovo!!");}

//Familia
        System.out.println("Vavedete familno ime: ");
        String familyName = new String();
        if (isStringOnlyLetters() && isFirstLetterCapital()){
            System.out.print(familyName);
        }
        else {System.out.println("Greshka! Vavedete otnovo!!");}

//Godini
        correctAge();

//Adres
        System.out.println("Vavedete adres: ");
        String addressOfPerson = new String();

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

    }
    //render menu
    public static void renderPeopleMenu(){
        System.out.println("1. Pensioner ");
        System.out.println("2. Rabotesht ");
        System.out.println("3. Maika");
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
}
