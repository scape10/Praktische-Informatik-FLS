import java.util.*;

public class Schulnotenausgabe {
    
    Scanner sc = new Scanner(System.in);
    int note;

    public void eingabe(){
        System.out.println("Geben sie die Note ein");
    }
    public void verarbeitung(){
        if(note == 1){
            System.out.print("Sehr Gut");
        }
        else if(note == 2){
            System.out.print("Gut");
        }
        else if(note == 3){
            System.out.print("befriedigend");
        }
        else if(note == 4){
            System.out.print("Ausreichen");
        }
        else if(note == 5){
            System.out.print("Mangelhaft");
        }
        else if(note == 6){
            System.out.print("Ungenügend");                             //╰‿╯
        }else{
            System.out.print("Es gibt nur die Noten 1 - 6");
        }
    }public static void main(String[]args){
        Schulnotenausgabe sna;
        sna = new Schulnotenausgabe();

        sna.eingabe();
        sna.verarbeitung();
    }

}
