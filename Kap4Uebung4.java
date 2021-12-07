
import java.util.Scanner;

public class Kap4Uebung4 {

    static boolean istSchaltjahr(int jahr) {
    boolean w;
    if (jahr % 4 == 0 && jahr % 100 != 0) {
        w = true;
    }
    else if (jahr % 4 == 0 && jahr % 100 == 0 && jahr % 400 == 0) {
        w = true;
    } 
    else {
        w = false;
    } 
    return w;
    }

    public static void main(String[] args) {
    
    Scanner s = new Scanner(System.in);

    int jahr;

    System.out.println("#### Schaljahr Prüfer ####");
    System.out.println("Gib eine Jahreszahl ein: ");
    jahr = s.nextInt();

    
System.out.println("Das eingegebene Jahr ist ein Schaltjahr: "+istSchaltjahr(jahr));






    }
    
}
