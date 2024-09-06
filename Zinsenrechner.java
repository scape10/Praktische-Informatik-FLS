import java.util.*;

public class Zinsenrechner {
    double kapital;
    double zinsen; //gewinn
    double zinssatz;
    double zeit; // in jahren
    double geldgesammt;

    Scanner sc = new Scanner(System.in);


    public void eingabe(){ //input der daten
        System.out.println("***************");
        System.out.println("Zinsrechner");
        System.out.println("***************");
        System.out.println("Bitte geben sie das Kapital in euro ein ein:");
        kapital = sc.nextDouble();
        System.out.println("Bitte geben sie den Prozentsatz an zu dem sie ihr Kapital anlegen möchten");
        zinssatz = sc.nextDouble();
        System.out.println("Bitte geben sie an wie lange sie das Geld investieren möchten:");
        zeit = sc.nextDouble();
    }
    public void verarbeitung(){ //verarbeitung der Daten
        zinsen=(kapital*zinssatz)/100;
        geldgesammt=kapital+zinsen;

    }
    public void ausgabe() { //ausgabe der Verarbeitung
        System.out.println("--------------------------------------------------------");
        System.out.println("Nach "+zeit+" Jahren haben sie "+zinsen+ " Euro verdient."); //statz
        System.out.println("Insgesamt haben sie nach "+zeit+ " Jahrmit dem Zinssatz von "+zinssatz+ " Prozent " +geldgesammt+" Euronen in ihrem Depo"); //statz
        System.out.println("--------------------------------------------------------");

    }

    public static void main(String[]args) { //hier wird alles ausgeführt
        Zinsenrechner Zr1;
        Zr1 = new Zinsenrechner();
            Zr1.eingabe();
            Zr1.verarbeitung();
            Zr1.ausgabe();
                                    // ╰‿╯ approved
        
    }


    }
