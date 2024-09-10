import java.util.*;

public class Steckbrief {

    Scanner sc = new Scanner(System.in);
    int alter;
    String name;
    String straße;
    int hausnummer;
    String wohnort;

    public void eingabe(){
        System.out.println("Wie alt sind sie? Geben sie ihr alter ein");
    alter = sc.nextInt();
        System.out.println("Wie Heißen sie? Geben sie ihren Namen ein");
    name = sc.next();
        System.out.println("Geben sie ihre straße und Hausnummer an (Erst Straße dann Hausnummer)");
    straße = sc.next(); 
    hausnummer = sc.nextInt();
        System.out.println("Geben sie ihren wohnort an");
    wohnort = sc.next();
    }
    public void ausgabe(){
        System.out.println(name + " ist " + alter + " alt und wohn in " + wohnort + " in der " + straße +" "+ hausnummer);
    }
    public static void main(String[]args){  // ╰‿╯
        Steckbrief t1;

        t1 = new Steckbrief();
        t1.eingabe();
        t1.ausgabe();
    }

}
