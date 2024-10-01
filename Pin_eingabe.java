import java.util.*;

public class Pin_Eingabe {
    
    Scanner sc = new Scanner(System.in);
    double pin;

    public void eingabe(){
        System.out.print("Geben sie ihre pin ein");
        pin = sc.nextDouble();
    }
    public void verarbeitung(){
        if(pin == 12345678){
            System.out.print("Die pin ist richtig");
        }else{
            System.out.print("Das gerät wird auf werkseinstellungen zurückgesetzt ");
        }
    }
    public static void main(String[]args){      //╰‿╯
        Pin_Eingabe pe;
        pe = new Pin_Eingabe();

        pe.eingabe();
        pe.verarbeitung();
    }
}
