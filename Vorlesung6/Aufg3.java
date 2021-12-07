package Vorlesung6;

public class Aufg3 {

public static void main (String[] args) {

String s = "Berufsakademie";
int x = 6;
int y = 8;

for (int i = 1; i <= 7; i++) {

System.out.println(s.substring(x, y));
x--;
y++;

}


}

}