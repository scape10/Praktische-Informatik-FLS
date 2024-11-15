import java.util.*;
public class Ratespiel {

    Scanner sc = new Scanner(System.in);
    Random ra = new Random();
    int spielerzahl = 0;
    int zahl = ra.nextInt(10)+1;

    public void verarbeitung(){
        while(spielerzahl != zahl){
            System.out.println("Geben sie ihren Guess ein");
            spielerzahl = sc.nextInt();
            if(spielerzahl != zahl) {
                System.out.println("Sie haben noch einen versuch");
            }else{
                System.out.println("Sie haben gewonnen");
            }
            }
    }
    public static void main(String[]args){
        Ratespiel rs;
        rs = new Ratespiel();
        rs.verarbeitung();
    }
}
