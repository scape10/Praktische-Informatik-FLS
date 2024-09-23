import java.util.*;

public class Notenschnitt_Schüler {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
       
        int klausur1;
        int klausur2;
        int test1;
        int test2;
        int anzahl = 6;
        double notenschnitt;

        System.out.println("Geben sie die Note der ersten KLausur an");
        klausur1 = sc.nextInt();
        System.out.println("Geben sie die Note der zweiten KLausur an");
        klausur2 = sc.nextInt();
        System.out.println("Geben sie die Note des ersten Test's an");
        test1 = sc.nextInt();
        System.out.println("Geben sie die Note des zweiten Test's an");
        test2 = sc.nextInt();

        notenschnitt = (klausur1*2.0 + klausur2*2 + test1 + test2)/anzahl; //TypeCast
        System.out.println("1.Klausur:  " + klausur1);
        System.out.println("2.Klausur:  " + klausur2);
        System.out.println("1.Test: " + test1);
        System.out.println("2.Test: " + test2);
        System.out.println("_____________________");
        System.out.println("Der schüler hat den durchschnitt: " + notenschnitt); // ╰‿╯

    }
    
}
