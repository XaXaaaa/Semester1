package UebungsblattGrundlagenJava;

public class Aufg14 {

    public static void main(String[] args) {

    int x = -1;
    int y = 3;
   

    for (int i = 1; i <= 5; i++) {

    System.out.println(x); 
    x = x + y; 
    y+=2; 
    System.out.println(x); 
    x = x - y; 
    y+=2; 
    
    }
    

    }

}    


