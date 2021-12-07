import java.util.Scanner;

public class Uebung6 {

static int auswahlEinlesen(int auswahl) {
Scanner s2 = new Scanner(System.in);
 while (auswahl > 3) {

    System.out.print("Fehlerhafte Eingabe, bitte eine Zahl zwischen 1 und 3 eingeben: ");
    auswahl = s2.nextInt();
 }   
if (auswahl == 1)

return auswahl;
return auswahl;

}

public static void main(String[] args) {
int auswahl;

Scanner s = new Scanner(System.in);

System.out.print("Wähle Zahl 1 bis 3: ");
auswahl = s.nextInt();

auswahlEinlesen(auswahl);


}

}