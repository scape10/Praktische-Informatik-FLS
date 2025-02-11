public class Roommate_Agreement_Korektur {

    double[] temperatur = {22.5, 22.4, 22.3, 22.1, 21.9, 21.8, 21.5, 21.4, 21.6, 21.5, 21.5, 21.6, 21.5, 22.5};
    double durchschnitt = 0;
    double avrg;
    int verstöße = 0;

    public void durchschnitt() {
        durchschnitt = 0;

        for (int i = 0; i < temperatur.length; i++) {
            durchschnitt += temperatur[i];
        }
        avrg = durchschnitt / temperatur.length;

        if (avrg > 22.5) {
            System.out.println("§1 Die Durchschnittstemperatur ist über dem Maximalwert.");
            verstöße++;
        } else if (avrg < 21.5) {
            System.out.println("§1 Die Durchschnittstemperatur ist unterhalb des Minimalwertes.");
            verstöße++;
        } else {
            System.out.println("§1 Es wurde nicht gegen die Mitbewohnervereinbarung verstoßen.");
        }
    }

    public void abweichung() {
        for (int i = 0; i < temperatur.length; i++) {
            if (temperatur[i] > avrg + 0.5 || temperatur[i] < avrg - 0.5) {
                System.out.println("§2 Es wurde gegen die Mitbewohnervereinbarung verstoßen am Tag " + (i + 1));
                verstöße++;
            }
        }
    }

    public void tage() {
        for (int i = 0; i < temperatur.length - 1; i++) {
            if (Math.abs(temperatur[i] - temperatur[i + 1]) > 0.7) {
                System.out.println("§3 Am Tag " + (i + 1) + " auf " + (i + 2) + " ist die Temperatur zu schnell gefallen/gestiegen.");
                verstöße++;
            }
        }
        System.out.println("Verstöße insgesamt: " + verstöße);                                                        //╰‿╯
    }

    public static void main(String[] args) {
        Roommate_Agreement_Korektur ra = new Roommate_Agreement_Korektur();
        
        ra.durchschnitt();
        ra.abweichung();
        ra.tage();
    }
}
