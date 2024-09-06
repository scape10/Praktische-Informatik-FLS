import java.text.DecimalFormat;
import java.util.Scanner;
import javax.swing.*;
import java.awt.BorderLayout;
import java.awt.Dimension;
 //java.security.interfaces;  //! warum Frau Ketzer}

public class Notenberechnung extends JFrame {
  Scanner sc=new Scanner (System.in);   //100% mein code!!! nicht Anes sein CODE!!
  
  DecimalFormat df1=new DecimalFormat("0.0");   //decimalformat wird vestgelegt ╰‿╯
  DecimalFormat df2=new DecimalFormat("0");
  
  double anzahl;
  double punkteErreicht;
  double maximalPunkte;
  double prozent;
  double punkteErreicht2;
  
  public void instalisation(){
    JPanel mainPanel = new JPanel();
    mainPanel.setLayout(new BorderLayout());
    
    setTitle("Test");
    setSize(500, 600);
    setMinimumSize(new Dimension(300, 400));
    setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
  }
      
  public void GUI(){
    JFrame frame = new JFrame("Notenberechnung");
    JLabel label = new JLabel("Max");
    frame.add(label);
    JLabel label2 = new JLabel("Erreicht");
    frame.add(label2);
    
    JTextField textField = new JTextField(4); // Textfeld
    frame.add(textField);
    JTextField textField2 = new JTextField(4); // Textfeld
    frame.add(textField2);
    
    JButton button = new JButton("Hier klicken, um Noten zu berechnen");
    frame.add(button);
    
    frame.setLayout(new java.awt.FlowLayout());
    frame.setSize(600, 400);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setVisible(true);
  }

  

  public void eingabe() {
        System.out.print("\n\n+++++++++++++++++++++++Eingabe:++++++++++++++++++++++++++++");
        System.out.print("\n\nWie viele Punkte konnten Sie maximal erreichen? ");
    maximalPunkte=sc.nextDouble();
        System.out.print("Wie viele Punkte haben Sie erreicht? ");
    punkteErreicht=sc.nextDouble();    
  } 

  public void verarbeitung() {
    
    anzahl=punkteErreicht*100/maximalPunkte;
    
    if (anzahl > 95) {
      punkteErreicht2=15;
    }
    else if (anzahl > 90) {
      punkteErreicht2=14;
    }
    else if (anzahl > 85) {
      punkteErreicht2=13;
    }
    else if (anzahl > 80) {
      punkteErreicht2=12;
    }        
    else if (anzahl > 75) {
      punkteErreicht2=11;
    }
    else if (anzahl > 70) {
      punkteErreicht2=10;
    }
    else if (anzahl > 65) {
      punkteErreicht2=9;
    }
    else if (anzahl > 60) {
      punkteErreicht2=8;
    }
    else if (anzahl > 55) {
      punkteErreicht2=7;
    }        
    else if (anzahl > 50) {
      punkteErreicht2=6;
    }
    else if (anzahl > 45) {
      punkteErreicht2=5;
    }        
    else if (anzahl > 40) {
      punkteErreicht2=4;
    }
    else if (anzahl > 33) {
      punkteErreicht2=3;
    }
    else if (anzahl > 27) {
      punkteErreicht2=2;
    }        
    else if (anzahl > 20) {
      punkteErreicht2=1;
    }
        else {
      punkteErreicht2=0;
        }
  }                              
    public void ausgabe() {
      System.out.print("\nAusgabe:");
      System.out.print("\n\nSie haben " + punkteErreicht + " von " + maximalPunkte + " Punkten erreicht!");
      System.out.print("\n\nDas entspricht " + df1.format(anzahl) + " Prozent und damit: " + df2.format(punkteErreicht2) + " Punkten.");
    }    
    public static void main (String[]args) {
      Notenberechnung nb1;
      nb1 = new Notenberechnung();
      
      
      nb1.instalisation();
      nb1.GUI();
      nb1.eingabe();
      nb1.verarbeitung();
      nb1.ausgabe();
   }
}
