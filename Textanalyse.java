import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class Textanalyse extends JFrame {
  // Anfang Attribute
  // start attributes
  private static JTextField jTextField1 = new JTextField();
  private JLabel lHaupteingabefeld = new JLabel();
  private static JNumberField jNumberField1 = new JNumberField();
  private JLabel lTextlaenge = new JLabel();
  private static JNumberField jNumberField2 = new JNumberField();
  private JLabel lAnzahlWoerter = new JLabel();
  private static JTextField jTextField2 = new JTextField();
  private static JTextField jTextField3 = new JTextField();
  private JLabel lEingabegesuchteZeichenfolge = new JLabel();
  private JLabel lIstgesuchteZeichenfolgevorhanden1 = new JLabel();
  private static JNumberField jNumberField3 = new JNumberField();
  private static JTextField jTextField4 = new JTextField();
  private JLabel lGesuchteStelledesTexts = new JLabel();
  private JLabel lAngesuchterStelle = new JLabel();
  private static JTextField jTextField5 = new JTextField();
  private static JNumberField jNumberField4 = new JNumberField();
  private JLabel lGesuchterBuchstabe = new JLabel();
  private JLabel lAnzahlgesuchterBuchstabe = new JLabel();
  private JButton bAnalysestarten = new JButton();
  
  private static JTextField jTextField6 = new JTextField();
  private JLabel lUmgedrehterText = new JLabel();
  // end attributes
  // Ende Attribute
  static void textLength(){
    try{
      int length = jTextField1.getText().length();
      jNumberField1.setInt(length);
    }catch(Exception e){
      e.printStackTrace();
    }   
  }
  
  static void wordAmount(){
    try{
      String text = jTextField1.getText();
      String[] words = text.split("\\s+");
      int wordcount = words.length;
      jNumberField2.setInt(wordcount);
    } catch(Exception e){
      e.printStackTrace();
    }    
  }
  
  static void zeichenFolge(){
    try{
      String text = jTextField1.getText().toLowerCase();
      String zeichenfolge = jTextField2.getText().toLowerCase();
      boolean containsZahlenfolge;
      if(jTextField2.getText().isEmpty()){
        jTextField3.setText("");
      }
      else if(text.contains(zeichenfolge)){
        containsZahlenfolge = true;
        jTextField3.setText(Boolean.toString(containsZahlenfolge));
      }
      else{
        containsZahlenfolge = false;
        jTextField3.setText(Boolean.toString(containsZahlenfolge));
      }
    } catch(Exception e){
      e.printStackTrace();
    }


    
  }
  static void textStelle(){
    int stelle = jNumberField3.getInt();
    jTextField4.setText("" + jTextField1.getText().charAt(stelle - 1));
  }
  
  static void reverseWord(){
    String text = jTextField1.getText();
    char[] textarray = text.toCharArray();
    int arraysize = text.length();
    String word_reverse = "";
    for(int i = arraysize - 1; i >= 0; i--){
      word_reverse += textarray[i];
    }        
    jTextField6.setText(word_reverse);
    
  }
  
  static void checkLetter(){
    boolean letterfound = false;
    String text = jTextField1.getText().toLowerCase();
    char check = jTextField5.getText().toLowerCase().charAt(0);
    char[] textarray = text.toCharArray();
    int arraysize = text.length();
    int counter = 0;
    for(int i = arraysize - 1; i >= 0; i--){
      if(textarray[i] == check){
        counter++;
      }
    }
    jNumberField4.setInt(counter);        
  }
  
  

    
    
  


  

 
  
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
    // start components
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
    
    lAngesuchterStelle.setBounds(368, 304, 123, 24);
    lAngesuchterStelle.setFont(new Font("Dialog", Font.BOLD, 11));
    lAngesuchterStelle.setText("An gesuchter Stelle:");
    cp.add(lAngesuchterStelle);
    jTextField5.setBounds(16, 416, 328, 48);
    jTextField5.setFont(new Font("Dialog", Font.PLAIN, 11));
    cp.add(jTextField5);
    jNumberField4.setBounds(368, 416, 328, 48);
    jNumberField4.setFont(new Font("Dialog", Font.PLAIN, 11));
    cp.add(jNumberField4);
    lGesuchterBuchstabe.setBounds(16, 392, 126, 24);
    lGesuchterBuchstabe.setFont(new Font("Dialog", Font.BOLD, 11));
    lGesuchterBuchstabe.setText("Gesuchter Buchstabe:");
    cp.add(lGesuchterBuchstabe);
    lAnzahlgesuchterBuchstabe.setBounds(368, 392, 165, 24);
    lAnzahlgesuchterBuchstabe.setFont(new Font("Dialog", Font.BOLD, 11));
    lAnzahlgesuchterBuchstabe.setText("Anzahl gesuchter Buchstabe:");
    cp.add(lAnzahlgesuchterBuchstabe);
    bAnalysestarten.setBounds(16, 592, 680, 80);
    bAnalysestarten.setFont(new Font("Dialog", Font.BOLD, 11));
    bAnalysestarten.setText("Analyse starten");
    bAnalysestarten.setMargin(new Insets(2, 2, 2, 2));
    bAnalysestarten.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        bAnalysestarten_ActionPerformed(evt);
      }
    });
    cp.add(bAnalysestarten);
    jTextField6.setBounds(16, 496, 680, 64);
    jTextField6.setFont(new Font("Dialog", Font.PLAIN, 11));
    cp.add(jTextField6);
    lUmgedrehterText.setBounds(16, 472, 108, 24);
    lUmgedrehterText.setFont(new Font("Dialog", Font.BOLD, 11));
    lUmgedrehterText.setText("Umgedrehter Text:");
    cp.add(lUmgedrehterText);
    // end components
    setVisible(true);
  } // end of public Textanalyse
  
  // Anfang Methoden
  
  // start methods
  public static void main(String[] args) {
    new Textanalyse();
  } // end of main
  
  // Ende Methoden
  public void bAnalysestarten_ActionPerformed(ActionEvent evt) {
    // TODO add your code here
    try{
      textLength();
      wordAmount();
      zeichenFolge();
      textStelle();
      checkLetter();
      reverseWord();
    }catch (Exception e){
      jTextField6.setText("Error");
      e.printStackTrace();
    }
  
    
    
  } // end of bAnalysestarten_ActionPerformed

  // end methods
} // end of class Textanalyse
