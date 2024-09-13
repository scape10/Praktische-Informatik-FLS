import java.util.*;

public class Notenschnitt_Schüler {
    public static void main(String[] args) {
       
        int klausur1 = 2;
        int klausur2 = 3;
        int test1 = 4;
        int test2 = 2;
        int anzahl = 6;
        double notenschnitt;

        notenschnitt = (klausur1*2.0 + klausur2*2 + test1 + test2)/anzahl; //TypeCast
        System.out.println("1.Klausur:  " + klausur1);
        System.out.println("2.Klausur:  " + klausur2);
        System.out.println("1.Test: " + test1);
        System.out.println("2.Test: " + test2);
        System.out.println("_____________________");
        System.out.println("Der schüler hat den durchschnitt: " + notenschnitt); // ╰‿╯

    }
    
}
