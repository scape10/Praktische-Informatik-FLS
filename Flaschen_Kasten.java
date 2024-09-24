import java.util.*;

public class Flaschen_Kasten{

    Scanner sc = new Scanner(System.in);
    int flaschen;
    int kasten;
    int rest;
    


    public void eingabe(){
        
        System.out.print("Geben sie die anzahl ihrer Flaschen an");
        flaschen = sc.nextInt();
        System.out.println("Geben sie an wie viele flaschen in einen Kasten passen");
        kasten = sc.nextInt(); 
    }
    public void verarbeitung(){
        rest = flaschen % kasten;
        
    }
    public void ausgabe(){
        System.out.print("Sie haben " + flaschen + " Flaschen und ein Kasten kann " + kasten + " flaschen aufnehmen Es bleiben " + rest + " übrig");
    }
    public static void main(String[]args){
        Flaschen_Kasten fk;
        fk = new Flaschen_Kasten();

        fk.eingabe();
        fk.verarbeitung();
        fk.ausgabe();
    }
}
