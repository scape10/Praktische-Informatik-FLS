import java.util.*;
import java.text.*;

public class Notenrechner { 
  double note1;
  double note2;
  double note3;
  double note4;
  double note5;
  double note6;
  
  double produkt1;
  double produkt2;
  double produkt3;
  double produkt4;
  double produkt5;
  double produkt6;
  
  double summeSchüler;
  double gesamtProdukt;
  double durchschnitt;

  Scanner sc = new Scanner(System.in);
  
  DecimalFormat df1 = new DecimalFormat("0.00");
  DecimalFormat df2 = new DecimalFormat("0");
  
      public void eingabe() {
      System.out.println("\n\tNoteneingabe:");
      System.out.print("\n\tGeben Sie die Anzahl der Note 1 an: ");
      note1 = sc.nextDouble();
      System.out.print("\tGeben Sie die Anzahl der Note 2 an: ");
      note2 = sc.nextDouble();
      System.out.print("\tGeben Sie die Anzahl der Note 3 an: ");
      note3 = sc.nextDouble();
      System.out.print("\tGeben Sie die Anzahl der Note 4 an: ");
      note4 = sc.nextDouble();
      System.out.print("\tGeben Sie die Anzahl der Note 5 an: ");
      note5 = sc.nextDouble();
      System.out.print("\tGeben Sie die Anzahl der Note 6 an: ");
      note6 = sc.nextDouble();
      System.out.print("\n");
      } 
         public void verarbeitung() {     //Berechnug der Note
         summeSchüler = note1 + note2 + note3 + note4 + note5 + note6;
         
         produkt1 = note1;
         produkt2 = note2 * 2;
         produkt3 = note3 * 3;
         produkt4 = note4 * 4;
         produkt5 = note5 * 5;
         produkt6 = note6 * 6;
         
         gesamtProdukt = produkt1 + produkt2 + produkt3 + produkt4 + produkt5 + produkt6 ;
         
         durchschnitt = gesamtProdukt / summeSchüler ;          
         }
            public void ausgabe() {             //ausgabbe des entproduckts
              System.out.println("\tDurchschnitt:");
              System.out.println("\t" + df1.format(durchschnitt));
              System.out.println("\n\t" + "Es haben " + df2.format(summeSchüler) + " Schüler an der Klausur teilgenommen.");
            }
  public static void main(String[] args) {    //╰‿╯
    Notenrechner az1;
    az1 = new Notenrechner();
    
    az1.eingabe();
    az1.verarbeitung();
    az1.ausgabe();
    
    }
   }                         
