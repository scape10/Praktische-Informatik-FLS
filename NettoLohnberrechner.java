import java.util.*;

public class NettoLohnberrechner {
    
    Scanner sc = new Scanner(System.in);
    double nettoLohn;
    double lohnsteuer;
    double lohn;

    public void eingabe(){
        System.out.print("Geben sie ihren Lohn ein");
        lohn = sc.nextDouble();
    }
    public void verarbeitung(){
        lohnsteuer = lohn * 0.14;
        lohnsteuer = lohnsteuer *(1 - 0.145);

        lohn = lohn *(1 - 0.34925);

    }
    public void ausgabe(){
        System.out.println("Nettolohn: \t\t" + lohn);
        System.out.println("Lohnsteuer: \t\t" + lohnsteuer);
    }
    public static void main (String[]args){
        NettoLohnberrechner nlb;
        nlb = new NettoLohnberrechner();

        nlb.eingabe();
        nlb.verarbeitung();
        nlb.ausgabe();
    }
}
