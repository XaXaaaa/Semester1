package Vorlesung6;

public class Aufg4 {

    static int berechneHaeufigkeit(String quelle, String such) {
    int x = quelle.indexOf(such, 0);
    return x;
}

    public static void main (String[] args) {

        String quelle = "Programmieren";
        String such = "g";

        System.out.println("Der String such befindet sich an Stelle " + berechneHaeufigkeit(quelle, such));
    }


}
