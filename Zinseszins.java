import java.util.*;
import java.text.*;

public class Zinseszins{

    Scanner sc = new Scanner(System.in);
    DecimalFormat df1 = new DecimalFormat("0.00");

    double kapital;
    double zinssatz;
    double jahre;
    int i;

    public void eingabe(){
        System.out.println("Bitte geben sie Ihr Startkapital an");
    kapital = sc.nextDouble();
        System.out.println("Bitte geben sie Ihren zinssatz an");
    zinssatz = sc.nextDouble();
        System.out.println("Geben sie an wie lange sie investiren wollen in Jahren");
    jahre = sc.nextDouble();
    }
    public void schleifen(){
        do {
        i++;
        kapital=kapital+kapital*(zinssatz/100);
 
        } while (i<= jahre);
    }
    public void aussgabe(){
        System.out.println("Ihr kapital nach " + jahre + " Jahren beträgt "+ df1.format(kapital) + "Herzlichen Glückwunsch");
    }
    public static void main(String[]args){            //╰‿╯
        Zinseszins zz1;
        zz1 = new Zinseszins();

        zz1.eingabe();
        zz1.schleifen();
        zz1.aussgabe();
    }
}
