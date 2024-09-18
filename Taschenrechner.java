import java.util.*;
public class Taschenrechner{

    double zahl1;
    double zahl2;
    double operator;
    double ergebniss;

    Scanner sc = new Scanner(System.in);

    public void eingabe(){
        System.out.println("\tTaschenrechner\n");

        System.out.println("\tVerfügbare Operatoren:");
        System.out.println("\t1. Addiotion (+)");
        System.out.println("\t2. Subtraktion (-)");
        System.out.println("\t3. Multiplikation (*)");
        System.out.println("\t4. Division (/)\n");

        System.out.print("\tBitte Wähle einen Operator (1/2/3/4): ");
        operator=sc.nextDouble();
        System.out.print("\tGebe die erste Zahl ein: ");
        zahl1=sc.nextDouble();
        System.out.print("\tGebe die Zweite Zahl ein:");
        zahl2=sc.nextDouble();
        System.out.println("\n");
    }
    public void verarbeitung(){
        if (operator == 1){
            ergebniss=zahl1+zahl2;
            }
            else if (operator == 2){
                ergebniss=zahl1-zahl2;
            }
            else if (operator == 3){
                ergebniss=zahl1*zahl2;
            }
        else if (operator == 4){
                if(zahl1 != 0){
                ergebniss=zahl1/zahl2;
            }
            else{
                System.out.println("\tSie können nicht Durch null Teilen.");
                System.exit(0);
                return;
            }
            }
        else if (operator == 4){
            if(zahl2 != 0){
                ergebniss=zahl1/zahl2;
            }
            else{
                System.out.println("\tSie können nicht Durch null Teilen.");
                System.exit(0);
                return;
            }
        }
}
public void ausgabe(){
    System.out.println("\t********************************");
    System.out.println("\tDas Ergebniss ist (Trommelwirbel): "+ergebniss);
    System.out.println("\t********************************\n");
}

public static void main(String[]srg){
    Taschenrechner az1;
    az1 = new Taschenrechner();

    System.out.println("\t************************\n");
    System.out.println("\tDaniel's Taschenrechner\n ");            //╰‿╯
    System.out.println("\t************************\n");

    az1.eingabe();
    az1.verarbeitung();
    az1.ausgabe();

    
}
}
