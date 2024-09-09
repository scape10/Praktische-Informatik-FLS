import java.util.*;



public class Zufallszahlen {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        Random ra = new Random();

        int geheimzahl;
        int spielerzahl;
        int versuche = 0;
        final int MAX_VERSUCHE = 5;

        geheimzahl = ra.nextInt(10)+ 1;
        System.out.println("++Ratespiel++");
        System.out.println("Sie müssen eine zahl zwischen 1 - 10 erraten");

        do{
            System.out.println("Gib deine schätzung ein");
            spielerzahl = sc.nextInt();
            versuche++;

            if(spielerzahl < geheimzahl){
                System.out.println("Zu Niedrig");
            }
            else if(spielerzahl > geheimzahl){
                System.out.println("zu Hoch");
            }
            else{
                System.out.println("Glückwunsch du hast die zahl in " + versuche + " erraten");
            }
        } while (versuche != MAX_VERSUCHE);
            System.out.println("AHAHAH zu viel versuch GO  FUCK YOUR SELFE");

            


    }

}
