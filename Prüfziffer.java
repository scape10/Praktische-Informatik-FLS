import java.util.*;

public class Prüfziffer {

    Scanner sc = new Scanner(System.in);
    int zahl1;
    int zahl2;
    int zahl3;
    int zahl4;
    int rest;
    int summe;

    public void eingabe(){
        System.out.println("Geben sie die erste zahl ein");
        zahl1 = sc.nextInt();
        System.out.println("Geben sie die zweite zahl ein");
        zahl2 = sc.nextInt();
        System.out.println("Geben sie die dritte zahl ein");
        zahl3 = sc.nextInt();
        System.out.println("Geben sie die vierte zahl ein");
        zahl4 = sc.nextInt();
    }
        public void verarbeitung(){
        summe = zahl1 + zahl2 + zahl3 + zahl4;
        rest = summe % 3;
    }
    public void ausgabe(){
        System.out.println("Ihre prüf ziffer ist " + rest);
    }
    public static void main(String[]args){    //╰‿╯
        Prüfziffer pf;
        pf = new Prüfziffer();
        pf.eingabe();
        pf.verarbeitung();
        pf.ausgabe();
    }
    

}
