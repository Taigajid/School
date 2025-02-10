import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class TaschenrechnerGUI extends JFrame {
  // Anfang Attribute
  // start attributes
  
  private JLabel lTaschenrechner = new JLabel();
  private JButton bAddition = new JButton();
  private JButton bSubtraktion = new JButton();
  private JNumberField jNumberField1 = new JNumberField();
  private JNumberField jNumberField2 = new JNumberField();
  private JNumberField jNumberField3 = new JNumberField();
  double ergebnis;
  double num1;
  double num2;
  private JButton bMultiplikation = new JButton();
  private JButton bDivision = new JButton();
  private JLabel lErgebnis = new JLabel();
  private JLabel lZahl = new JLabel();
  private JLabel lZahl21 = new JLabel();
  private JSeparator jSeparator1 = new JSeparator();
  private JSeparator jSeparator2 = new JSeparator();
    private JPanel jTabbedPane1TabPanelAmerica = new JPanel(null, true);
    private JPanel jTabbedPane1TabPanelEurope = new JPanel(null, true);
    private JPanel jTabbedPane1TabPanelAsia = new JPanel(null, true);
  
  // end attributes
  // Ende Attribute
  
  public TaschenrechnerGUI() { 
    // Frame init
    
    super();
        
    setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
    int frameWidth = 730; 
    int frameHeight = 460;
    setSize(frameWidth, frameHeight);
    Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
    int x = (d.width - getSize().width) / 2;
    int y = (d.height - getSize().height) / 2;
    setLocation(x, y);
    setTitle("TaschenrechnerGUI");
    setResizable(false);
    Container cp = getContentPane();
    cp.setLayout(null);
    // start components
    
    cp.setBackground(new Color(0x1A2030));
    // Anfang Komponenten
    
    lTaschenrechner.setBounds(272, 0, 157, 32);
    lTaschenrechner.setText("Taschenrechner");
    lTaschenrechner.setForeground(Color.WHITE);
    lTaschenrechner.setFont(new Font("Microsoft JhengHei UI", Font.BOLD, 18));
    cp.add(lTaschenrechner);
    bAddition.setBounds(16, 136, 328, 48);
    bAddition.setText("Addition");
    bAddition.setMargin(new Insets(2, 2, 2, 2));
    bAddition.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        bAddition_ActionPerformed(evt);
      }
    });
    bAddition.setBackground(new Color(0xC0C0C0));
    bAddition.setBorder(new javax.swing.border.LineBorder(Color.GRAY, 2));
    bAddition.setFont(new Font("@Microsoft JhengHei UI", Font.BOLD, 11));
    cp.add(bAddition);
    bSubtraktion.setBounds(368, 136, 328, 48);
    bSubtraktion.setText("Subtraktion");
    bSubtraktion.setMargin(new Insets(2, 2, 2, 2));
    bSubtraktion.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        bSubtraktion_ActionPerformed(evt);
      }
    });
    bSubtraktion.setBorder(new javax.swing.border.LineBorder(Color.GRAY, 2));
    bSubtraktion.setBackground(new Color(0xC0C0C0));
    bSubtraktion.setFont(new Font("@Microsoft JhengHei UI", Font.BOLD, 11));
    cp.add(bSubtraktion);
    jNumberField1.setBounds(16, 56, 328, 48);
    jNumberField1.setText("");
    jNumberField1.setBackground(Color.WHITE);
    jNumberField1.setFont(new Font("@Microsoft JhengHei UI", Font.PLAIN, 11));
    cp.add(jNumberField1);
    jNumberField2.setBounds(368, 56, 328, 48);
    jNumberField2.setText("");
    jNumberField2.setFont(new Font("@Microsoft JhengHei UI", Font.PLAIN, 11));
    cp.add(jNumberField2);
    jNumberField3.setBounds(16, 288, 680, 48);
    jNumberField3.setText("");
    jNumberField3.setBackground(Color.WHITE);
    jNumberField3.setFont(new Font("@Microsoft JhengHei UI", Font.PLAIN, 11));
    cp.add(jNumberField3);
    bMultiplikation.setBounds(16, 200, 328, 48);
    bMultiplikation.setText("Multiplikation");
    bMultiplikation.setMargin(new Insets(2, 2, 2, 2));
    bMultiplikation.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        bMultiplikation_ActionPerformed(evt);
      }
    });
    bMultiplikation.setBackground(new Color(0xC0C0C0));
    bMultiplikation.setBorder(new javax.swing.border.LineBorder(Color.GRAY, 2));
    bMultiplikation.setFont(new Font("@Microsoft JhengHei UI", Font.BOLD, 11));
    cp.add(bMultiplikation);
    bDivision.setBounds(368, 200, 328, 48);
    bDivision.setText("Division");
    bDivision.setMargin(new Insets(2, 2, 2, 2));
    bDivision.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        bDivision_ActionPerformed(evt);
      }
    });
    bDivision.setBackground(new Color(0xC0C0C0));
    bDivision.setBorder(new javax.swing.border.LineBorder(Color.GRAY, 2));
    bDivision.setFont(new Font("@Microsoft JhengHei UI", Font.BOLD, 11));
    cp.add(bDivision);
    lErgebnis.setBounds(16, 264, 80, 24);
    lErgebnis.setText("Ergebnis:");
    lErgebnis.setForeground(Color.WHITE);
    lErgebnis.setFont(new Font("@Microsoft JhengHei UI", Font.BOLD, 11));
    cp.add(lErgebnis);
    // Ende Komponenten
    
    lZahl.setBounds(16, 32, 80, 24);
    lZahl.setText("Zahl 1:");
    lZahl.setForeground(Color.WHITE);
    lZahl.setFont(new Font("@Microsoft JhengHei UI", Font.BOLD, 11));
    cp.add(lZahl);
    lZahl21.setBounds(368, 32, 40, 24);
    lZahl21.setText("Zahl 2:");
    lZahl21.setForeground(Color.WHITE);
    lZahl21.setFont(new Font("@Microsoft JhengHei UI", Font.BOLD, 11));
    cp.add(lZahl21);
    jSeparator1.setBounds(16, 112, 680, 8);
    jSeparator1.setFont(new Font("Dialog", Font.BOLD, 11));
    jSeparator1.setBackground(new Color(0x404040));
    jSeparator1.setForeground(new Color(0x404040));
    cp.add(jSeparator1);
    jSeparator2.setBounds(16, 256, 680, 8);
    jSeparator2.setFont(new Font("Dialog", Font.BOLD, 11));
    jSeparator2.setForeground(new Color(0x404040));
    jSeparator2.setBackground(new Color(0x404040));
    cp.add(jSeparator2);
    
    
    
    

    // end components
    setVisible(true);
  } // end of public TaschenrechnerGUI
  
  // Anfang Methoden
  
  // start methods
  public static void main(String[] args) {
    new TaschenrechnerGUI();
  } // end of main
  
  public void bAddition_ActionPerformed(ActionEvent evt) {
    // TODO hier Quelltext einfügen
    num1 = jNumberField1.getDouble();
    num2 = jNumberField2.getDouble();
    ergebnis = num1 + num2;
    jNumberField3.setDouble(ergebnis);
    
  } // end of bAddition_ActionPerformed

  public void bSubtraktion_ActionPerformed(ActionEvent evt) {
    // TODO hier Quelltext einfügen
    num1 = jNumberField1.getDouble();
    num2 = jNumberField2.getDouble();
    ergebnis = num1 - num2;
    jNumberField3.setDouble(ergebnis);
    
  } // end of bSubtraktion_ActionPerformed

  public void bMultiplikation_ActionPerformed(ActionEvent evt) {
    // TODO hier Quelltext einfügen
    num1 = jNumberField1.getDouble();
    num2 = jNumberField2.getDouble();
    ergebnis = num1 * num2;
    jNumberField3.setDouble(ergebnis);
    
  } // end of bMultiplikation_ActionPerformed

  public void bDivision_ActionPerformed(ActionEvent evt) {
    // TODO hier Quelltext einfügen
    num1 = jNumberField1.getDouble();
    num2 = jNumberField2.getDouble();
    ergebnis = num1 / num2;
    jNumberField3.setDouble(ergebnis);
    
  } // end of bDivision_ActionPerformed

  // Ende Methoden




  // end methods
} // end of class TaschenrechnerGUI
