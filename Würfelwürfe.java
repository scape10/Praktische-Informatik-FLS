import java.util.*;
public class Würfelwürfe {

    Random ra = new Random();

    int zahl;

    public void verarbeitung() {

        for (int i = 0; i < 10; i++) {
            zahl = ra.nextInt(6) + 1;
            if (zahl == 6) {
                System.out.println("Gewonnen");
            } else {
                System.out.println("Niete");
            }
        }
    }
    public static void main(String[]args){
        Würfelwürfe ww;
        ww = new Würfelwürfe();
        ww.verarbeitung();
        }
    }

