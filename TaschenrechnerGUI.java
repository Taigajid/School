import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.io.FileNotFoundException;


public class TaschenrechnerGUI extends JFrame {
    // Anfang Attribute
    // start attributes

    private JLabel lTaschenrechner = new JLabel();
    private JButton bAddition = new JButton();
    private JButton bSubtraktion = new JButton();
    private JTextField jNumberField1 = new JTextField();
    private JTextField jNumberField2 = new JTextField();
    private JTextField jNumberField3 = new JTextField();
    static double ergebnis;
    static double num1;
    static double num2;
    static File myObj = new File("Database.txt");
    static LocalDateTime dbTime = LocalDateTime.now();
    static DateTimeFormatter formatTime = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
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

    private JButton bDatenbank = new JButton();
    private static JTextArea jTextArea1 = new JTextArea();
    private JScrollPane jTextArea1ScrollPane = new JScrollPane(jTextArea1);
    private JButton bDatenbankleeren = new JButton();
    // end attributes
    // Ende Attribute
    public static void dataBase(String rechenart){
        try{
            FileWriter writeFile = new FileWriter("Database.txt", true);
            switch (rechenart) {
                case "add" :
                    writeFile.write(dbTime.format(formatTime) + " " + num1 + " + " + num2 + " = " + ergebnis + "\n");
                    writeFile.close();

                    break;
                case "sub" :
                    writeFile.write(dbTime.format(formatTime) + " " + num1 + " - " + num2 + " = " + ergebnis + "\n");
                    writeFile.close();
                    break;
                case "div" :
                    writeFile.write(dbTime.format(formatTime) + " " + num1 + " / " + num2 + " = " + ergebnis + "\n");
                    writeFile.close();
                    break;
                case "multi":
                    writeFile.write(dbTime.format(formatTime) + " " + num1 + " * " + num2 + " = " + ergebnis + "\n");
                    writeFile.close();
                    break;


            } // end of switch

        }catch(IOException e){
            e.printStackTrace();
        }
    }
    public static void dataBaseClear(){
        try{
            FileWriter clearFile = new FileWriter("Database.txt");
            clearFile.write("");
            clearFile.close();
        }
        catch(IOException e){
            e.printStackTrace();
        }
    }
    public static void fileReader(){
        try{
            Scanner readFile = new Scanner(myObj);
            while(readFile.hasNextLine()){
                String data = readFile.nextLine();
                jTextArea1.append(data + "\n");
            }
            readFile.close();
        }
        catch(FileNotFoundException e){
            e.printStackTrace();
        }
    }
    public TaschenrechnerGUI() {
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
        setTitle("TaschenrechnerGUI");
        setResizable(false);
        Container cp = getContentPane();
        cp.setLayout(null);
        // start components

        cp.setBackground(new Color(0x1A212C));
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





        bDatenbank.setBounds(16, 384, 80, 24);
        bDatenbank.setText("Datenbank");
        bDatenbank.setMargin(new Insets(2, 2, 2, 2));
        bDatenbank.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                bDatenbank_ActionPerformed(evt);
            }
        });
        bDatenbank.setBackground(new Color(0xC0C0C0));
        bDatenbank.setBorder(new javax.swing.border.LineBorder(Color.GRAY, 2));
        bDatenbank.setFont(new Font("@Microsoft JhengHei UI", Font.BOLD, 11));
        cp.add(bDatenbank);
        jTextArea1ScrollPane.setBounds(16, 416, 680, 248);
        jTextArea1.setFont(new Font("Dialog", Font.PLAIN, 11));
        cp.add(jTextArea1ScrollPane);
        bDatenbankleeren.setBounds(584, 384, 109, 24);
        bDatenbankleeren.setText("Datenbank leeren");
        bDatenbankleeren.setMargin(new Insets(2, 2, 2, 2));
        bDatenbankleeren.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                bDatenbankleeren_ActionPerformed(evt);
            }
        });
        bDatenbankleeren.setBackground(new Color(0xC0C0C0));
        bDatenbankleeren.setBorder(new javax.swing.border.LineBorder(Color.GRAY, 2));
        bDatenbankleeren.setFont(new Font("@Microsoft JhengHei UI", Font.BOLD, 11));
        cp.add(bDatenbankleeren);
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
        num1 = Double.parseDouble(jNumberField1.getText());
        num2 = Double.parseDouble(jNumberField2.getText());
        ergebnis = num1 + num2;
        jNumberField3.setText(Double.toString(ergebnis));
        dataBase("add");
        jTextArea1.setText("");
        fileReader();


    } // end of bAddition_ActionPerformed

    public void bSubtraktion_ActionPerformed(ActionEvent evt) {
        // TODO hier Quelltext einfügen
        num1 = Double.parseDouble(jNumberField1.getText());
        num2 = Double.parseDouble(jNumberField2.getText());
        ergebnis = num1 - num2;
        jNumberField3.setText(Double.toString(ergebnis));
        dataBase("sub");
        jTextArea1.setText("");
        fileReader();

    } // end of bSubtraktion_ActionPerformed

    public void bMultiplikation_ActionPerformed(ActionEvent evt) {
        // TODO hier Quelltext einfügen
        num1 = Double.parseDouble(jNumberField1.getText());
        num2 = Double.parseDouble(jNumberField2.getText());
        ergebnis = num1 * num2;
        jNumberField3.setText(Double.toString(ergebnis));
        dataBase("multi");
        jTextArea1.setText("");
        fileReader();

    } // end of bMultiplikation_ActionPerformed

    public void bDivision_ActionPerformed(ActionEvent evt) {
        // TODO hier Quelltext einfügen
        num1 = Double.parseDouble(jNumberField1.getText());
        num2 = Double.parseDouble(jNumberField2.getText());
        ergebnis = num1 / num2;
        jNumberField3.setText(Double.toString(ergebnis));
        dataBase("div");
        jTextArea1.setText("");
        fileReader();

    } // end of bDivision_ActionPerformed

    // Ende Methoden



    public void bDatenbank_ActionPerformed(ActionEvent evt) {
        // TODO add your code here
        jTextArea1.setText("");
        fileReader();


    } // end of bDatenbank_ActionPerformed

    public void bDatenbankleeren_ActionPerformed(ActionEvent evt) {
        // TODO add your code here
        dataBaseClear();
    } // end of bDatenbankleeren_ActionPerformed

    // end methods
} // end of class TaschenrechnerGUI

