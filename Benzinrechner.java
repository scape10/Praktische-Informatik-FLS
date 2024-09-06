import java.text.DecimalFormat;
import java.util.*;

public class BenzinRechner {


    Scanner sc = new Scanner(System.in);


    double kilometerLetzter;                //Da chille so die variablen
    double kilometerA;
    double tankmenge;
    double kilodif;
    double z1;
    double verbrauch;

    DecimalFormat df1 = new DecimalFormat("0.00");



        public void eingabe() {    
            System.out.println("BItte geben sie den kilometerstand beim Letzen Tanken ein");
         kilometerLetzter = sc.nextDouble();
            System.out.println("Bitte geben sie den aktuellen kilometerstand ein");
         kilometerA       = sc.nextDouble();
            System.out.println("BItte geben sie die menge des Getankten Benziens in Litern ein");
         tankmenge        = sc.nextDouble();
        }

            public void verarbeitung() {                
                kilodif=kilometerA-kilometerLetzter;
                z1=tankmenge/kilodif;
                verbrauch=z1*100;
             }

            public void ausgabe() {     
                System.out.println("Dein aktueller verbrauch ist" + df1.format(verbrauch)+" Liter pro gefahrene 100Km, "+ "\n"+"wenn sie"+kilodif+"gefahren sind und"+tankmenge+"Liter getankt haben." );
            }

            public static void main(String[] args){
            
            BenzinRechner br1;              
            br1 = new BenzinRechner();
           
            br1.eingabe();
            br1.verarbeitung();
            br1.ausgabe();
        }
  }
    

