 package Vorlesung6;
import java.util.*;


public class Aufg5 {

    public static void main(String[] args) {
    Scanner s = new Scanner(System.in);

    String eingabe;

    System.out.print("Gib ein Palindrom ein: ");
    eingabe = s.nextLine();

    System.out.println("Das eingegebene Wort ist ein Palindrom: " + checkPalindrom(eingabe));
    }

// Methode zur Prüfung des Palindroms
static boolean checkPalindrom(String eingabe) {

boolean check = false;
int x = 0;
int y = eingabe.length()-1;
while (x < y) {

if (eingabe.charAt(x) != eingabe.charAt(y)) {
    check = false;
} else {
    check = true;  
}
x++;
y--;
}
return check;
}




}



