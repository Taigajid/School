import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

/**
 *
 * Beschreibung
 *
 * @version 1.0 vom 03.03.2025
 * @author 
 */

public class Textanalyse extends JFrame {
  // Anfang Attribute
  private JTextField jTextField1 = new JTextField();
  private JLabel lHaupteingabefeld = new JLabel();
  private JNumberField jNumberField1 = new JNumberField();
  private JLabel lTextlaenge = new JLabel();
  private JNumberField jNumberField2 = new JNumberField();
  private JLabel lAnzahlWoerter = new JLabel();
  private JTextField jTextField2 = new JTextField();
  private JTextField jTextField3 = new JTextField();
  private JLabel lEingabegesuchteZeichenfolge = new JLabel();
  private JLabel lIstgesuchteZeichenfolgevorhanden1 = new JLabel();
  private JNumberField jNumberField3 = new JNumberField();
  private JTextField jTextField4 = new JTextField();
  private JLabel lGesuchteStelledesTexts = new JLabel();
  // Ende Attribute
  
  public Textanalyse() { 
    // Frame init
    super();
    setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
    int frameWidth = 728; 
    int frameHeight = 727;
    setSize(frameWidth, frameHeight);
    Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
    int x = (d.width - getSize().width) / 2;
    int y = (d.height - getSize().height) / 2;
    setLocation(x, y);
    setTitle("Textanalyse");
    setResizable(false);
    Container cp = getContentPane();
    cp.setLayout(null);
    // Anfang Komponenten
    
    jTextField1.setBounds(16, 48, 680, 64);
    jTextField1.setFont(new Font("Dialog", Font.PLAIN, 11));
    cp.add(jTextField1);
    lHaupteingabefeld.setBounds(16, 24, 103, 24);
    lHaupteingabefeld.setFont(new Font("Dialog", Font.BOLD, 11));
    lHaupteingabefeld.setText("Haupteingabefeld:");
    cp.add(lHaupteingabefeld);
    jNumberField1.setBounds(16, 152, 328, 48);
    jNumberField1.setFont(new Font("Dialog", Font.PLAIN, 11));
    cp.add(jNumberField1);
    lTextlaenge.setBounds(16, 128, 80, 24);
    lTextlaenge.setFont(new Font("Dialog", Font.BOLD, 11));
    lTextlaenge.setText("Textlänge:");
    cp.add(lTextlaenge);
    jNumberField2.setBounds(368, 152, 328, 48);
    jNumberField2.setFont(new Font("Dialog", Font.PLAIN, 11));
    cp.add(jNumberField2);
    lAnzahlWoerter.setBounds(368, 128, 85, 24);
    lAnzahlWoerter.setFont(new Font("Dialog", Font.BOLD, 11));
    lAnzahlWoerter.setText("Anzahl Wörter:");
    cp.add(lAnzahlWoerter);
    jTextField2.setBounds(16, 240, 328, 48);
    jTextField2.setFont(new Font("Dialog", Font.PLAIN, 11));
    cp.add(jTextField2);
    jTextField3.setBounds(368, 240, 328, 48);
    jTextField3.setFont(new Font("Dialog", Font.PLAIN, 11));
    cp.add(jTextField3);
    lEingabegesuchteZeichenfolge.setBounds(16, 216, 180, 24);
    lEingabegesuchteZeichenfolge.setFont(new Font("Dialog", Font.BOLD, 11));
    lEingabegesuchteZeichenfolge.setText("Eingabe gesuchte Zeichenfolge:");
    cp.add(lEingabegesuchteZeichenfolge);
    lIstgesuchteZeichenfolgevorhanden1.setBounds(368, 216, 213, 24);
    lIstgesuchteZeichenfolgevorhanden1.setFont(new Font("Dialog", Font.BOLD, 11));
    lIstgesuchteZeichenfolgevorhanden1.setText("Ist gesuchte Zeichenfolge vorhanden:");
    cp.add(lIstgesuchteZeichenfolgevorhanden1);
    jNumberField3.setBounds(16, 328, 328, 48);
    jNumberField3.setFont(new Font("Dialog", Font.PLAIN, 11));
    cp.add(jNumberField3);
    jTextField4.setBounds(368, 328, 328, 48);
    jTextField4.setFont(new Font("Dialog", Font.PLAIN, 11));
    cp.add(jTextField4);
    lGesuchteStelledesTexts.setBounds(16, 304, 152, 24);
    lGesuchteStelledesTexts.setFont(new Font("Dialog", Font.BOLD, 11));
    lGesuchteStelledesTexts.setText("Gesuchte Stelle des Texts:");
    cp.add(lGesuchteStelledesTexts);
    // Ende Komponenten
    
    setVisible(true);
  } // end of public Textanalyse
  
  // Anfang Methoden
  
  public static void main(String[] args) {
    new Textanalyse();
  } // end of main
  
  // Ende Methoden
} // end of class Textanalyse
