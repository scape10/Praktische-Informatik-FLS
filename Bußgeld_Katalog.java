import java.text.*;
import java.util.*;

public class Bußgeld_Katalog {
    
    final int TOLERANZ = 3;
    int wo = 0;
    double geschwindigkeitlegal = 0;
    double geschwindigkeitgefahren = 0;
    double geschwindigkeitdif;
    double abzug;
    int bußgeld = 0;
    int punkte = 0;
    int fahrverbot;
    int gut;
    Scanner sc = new Scanner(System.in);
    DecimalFormat df1 = new DecimalFormat("0.0");


    public void eingabe(){
        System.out.println("Wo sind sie zu schnell gefahren");
        System.out.println("1: Innerhalb geschlossener Ortschaften");
        System.out.println("2: Ausserhalb geschlossener Ortschaften");
        wo = sc.nextInt();
        System.out.println("Wie hoch war die zulässige Höchstgeschwindigkeit auf der straße");
        geschwindigkeitlegal = sc.nextDouble();
        System.out.println("Wie schnell sind sie gefahren");
        geschwindigkeitgefahren = sc.nextDouble();

    }
    public void verarbeitung(){
        
        if(geschwindigkeitgefahren >= 100){
            abzug = (geschwindigkeitgefahren * TOLERANZ) / 100;
            geschwindigkeitgefahren = geschwindigkeitgefahren - abzug;
        }else{
            geschwindigkeitgefahren = geschwindigkeitgefahren - TOLERANZ;
        }

        geschwindigkeitdif = geschwindigkeitgefahren - geschwindigkeitlegal;

        
        
        if(geschwindigkeitdif < 0){
            bußgeld = 0;
            punkte = 0;
            fahrverbot = 0;
            gut = 1;

        }
        else if(geschwindigkeitdif <= 10){ 
            if(wo == 1){
                bußgeld = 15;
                punkte = 0;
                fahrverbot = 0;
            }else if(wo == 2){
                bußgeld = 10;
                punkte = 0;
                fahrverbot = 0;
            }
        }else if(geschwindigkeitdif <= 15){
            if(wo == 1){
                bußgeld = 25;
                punkte = 0;
                fahrverbot = 0;
            }else if(wo == 2){
                bußgeld = 20;
                punkte = 0;
                fahrverbot = 0;
            }
        }else if(geschwindigkeitdif <= 20){
            if(wo == 1){
                bußgeld = 35;
                punkte = 0;
                fahrverbot = 0;
            }else if(wo == 2){
                bußgeld = 30;
                punkte = 0;
                fahrverbot = 0;
            }
        }else if(geschwindigkeitdif <= 25){
            if(wo == 1){
                bußgeld = 80;
                punkte = 1;
                fahrverbot = 0;
            }else if(wo == 2){
                bußgeld = 70;
                punkte = 1;
                fahrverbot = 0;
            }
        }else if(geschwindigkeitdif <= 30){
            if(wo == 1){
                bußgeld = 100;
                punkte = 1;
                fahrverbot = 0;
            }else if(wo == 2){
                bußgeld = 80;
                punkte = 1;
                fahrverbot = 0;
            }
        }else if(geschwindigkeitdif <= 40){
            if(wo == 1){
                bußgeld = 160;
                punkte = 2;
                fahrverbot = 1;
            }else if(wo == 2){
                bußgeld = 120;
                punkte = 1;
                fahrverbot = 0;
            } 
        }else if(geschwindigkeitdif <= 50){
            if(wo == 1){
                bußgeld = 200;
                punkte = 2;
                fahrverbot = 1;
            }else if(wo == 2){
                bußgeld = 160;
                punkte = 2;
                fahrverbot = 1;
            }
        }else if(geschwindigkeitdif <= 60){
            if(wo == 1){
                bußgeld = 280;
                punkte = 2;
                fahrverbot = 2;
            }else if(wo == 2){
                bußgeld = 240;
                punkte = 2;
                fahrverbot = 1;
            }
        }else if(geschwindigkeitdif <= 70){
            if(wo == 1){
                bußgeld = 480;
                punkte = 2;
                fahrverbot = 3;
            }else if(wo == 2){
                bußgeld = 440;
                punkte = 2;
                fahrverbot = 2;
            }
        }else if(geschwindigkeitdif > 70){
            if(wo == 1){
                bußgeld = 680;
                punkte = 2;
                fahrverbot = 3;
            }else if(wo == 2){
                bußgeld = 600;
                punkte = 2;
                fahrverbot = 3;
            }
        }
    }
    public void ausgabe(){
        if(gut == 1){
            System.out.println("Sie haben sich an alle regeln gehalten");
        }else{
            System.out.println("Sie haben sich nicht an die Vorschriften gehalten und sind Ausserorts " + df1.format(geschwindigkeitdif) + " Km/h Gefahren");
            System.out.println("Sie müssen " + bußgeld + " Euro Strafe zahlen und bekommen " + punkte + " punkte und " + fahrverbot + " fahrverbot");
        }
    }
    public static void main(String[]args){
        Bußgeld_Katalog bk = new Bußgeld_Katalog();
        bk.eingabe();
        bk.verarbeitung();
        bk.ausgabe();
    }
}
