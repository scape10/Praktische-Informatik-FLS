import java.util.*;

public class Kleinstezahl {

  Scanner sc = new Scanner(System.in);

  int zahl1;
  int zahl2;
  int zahl3;
  int kleinstezahl;
  int klein;

  public void eingabe(){
    System.out.println("Bitte geben sie die erste Zahl ein:");
    zahl1 = sc.nextInt();
    System.out.println("Bitte geben sie die zweite Zahl ein:");
    zahl2 = sc.nextInt();
    System.out.println("Bitte geben sie die dritt");
    zahl3 = sc.nextInt();
  }

  public void verarbeitung() {
    if (zahl1 < zahl2) {

      if (zahl1 < zahl3) {
        kleinstezahl = zahl1;
      } else {
        kleinstezahl = zahl3;

      } // end of if-else
    } else {
      if (zahl2 < zahl3) {
        kleinstezahl = zahl2;
      } else {
        kleinstezahl = zahl3;
      }
    } // end of if-else
  }

  public void ausgabe() {
    System.out.println("Zahl 1:" + zahl1);
    System.out.println("Zahl 2:" + zahl2);
    System.out.println("Zahl 3:" + zahl3);
    System.out.println("Die kleinste der Zahlen ist:" + kleinstezahl);
  }

  public static void main(String[] args) {    //╰‿╯
    Kleinstezahl kz1;
    kz1 = new Kleinstezahl();

    kz1.eingabe();
    kz1.verarbeitung();
    kz1.ausgabe();
  }

}
