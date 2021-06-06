import javax.swing.JOptionPane;
import java.awt.event.ActionEvent;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.Font;
import java.awt.Container;
import java.awt.Component;
import java.awt.LayoutManager;
import java.awt.FlowLayout;
import javax.swing.JComboBox;
import java.util.ArrayList;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import javax.swing.JFrame;

// 
// Decompiled by Procyon v0.5.36
// 

public class Cotizacion extends JFrame implements ActionListener
{
    private JTextField txtAb;
    private JTextField txtAc;
    private JTextField txtAe;
    private JTextField txtAd;
    private JTextField valor1;
    private JTextField valor2;
    private JTextField valor3;
    private JTextField camporesultado;
    private JLabel label1;
    private JLabel label11;
    private JLabel label12;
    private JLabel label13;
    private JLabel label2;
    private JLabel label3;
    private JLabel label4;
    private JLabel label5;
    private JLabel label6;
    private JLabel label7;
    private JLabel label8;
    private JLabel label9;
    private JLabel label10;
    private JLabel label32;
    private JLabel labelResultado;
    private JButton boton1;
    private JButton boton2;
    private JButton btnlimpiar;
    private JTextArea textarea1;
    private JScrollPane scrollpane1;
    private ArrayList<String> paisesArrayList;
    private JComboBox<String> comboArray;
    private JComboBox<String> comboArrayList;
    
    public void Controles() {
        final Container contentPane = this.getContentPane();
        contentPane.setLayout(new FlowLayout());
        contentPane.add(this.label1 = new JLabel("Numero 1"));
        contentPane.add(this.valor1 = new JTextField(10));
        contentPane.add(this.label2 = new JLabel("Numero 2"));
        contentPane.add(this.valor2 = new JTextField(10));
        contentPane.add(this.valor3 = new JTextField(10));
    }
    
    public Cotizacion() {
        (this.paisesArrayList = new ArrayList<String>()).add("Kg");
        this.paisesArrayList.add("g");
        this.paisesArrayList.add("L");
        this.paisesArrayList.add("ml");
        (this.comboArrayList = new JComboBox<String>(this.paisesArrayList.toArray(new String[this.paisesArrayList.size()]))).setBounds(205, 295, 300, 30);
        this.comboArrayList.setFont(new Font("Andale Mono", 3, 18));
        this.comboArrayList.setForeground(new Color(0, 0, 0));
        this.add(this.comboArrayList);
        this.setLayout(null);
        this.setDefaultCloseOperation(3);
        this.setTitle("Cotizacion");
        this.getContentPane().setBackground(new Color(255, 102, 204));
        this.setIconImage(new ImageIcon(this.getClass().getResource("images/LOGO.jpg")).getImage());
        (this.label1 = new JLabel(new ImageIcon("images/FHH.jpg"))).setBounds(5, 5, 150, 75);
        this.add(this.label1);
        (this.label2 = new JLabel("Bienvenido")).setBounds(185, 5, 200, 50);
        this.label2.setFont(new Font("Andale Mono", 3, 18));
        this.label2.setForeground(new Color(255, 255, 255));
        this.add(this.label2);
        (this.label4 = new JLabel("2020 FH REPOSTERIA & Ruly Programming")).setBounds(185, 45, 500, 30);
        this.label4.setFont(new Font("Andale Mono", 3, 18));
        this.label4.setForeground(new Color(0, 0, 0));
        this.add(this.label4);
        (this.label3 = new JLabel("Proveedor")).setBounds(50, 105, 200, 30);
        this.label3.setFont(new Font("Andale Mono", 1, 18));
        this.label3.setForeground(new Color(0, 0, 0));
        this.add(this.label3);
        (this.label7 = new JLabel("Cantidad")).setBounds(50, 135, 200, 30);
        this.label7.setFont(new Font("Andale Mono", 1, 16));
        this.label7.setForeground(new Color(0, 0, 0));
        this.add(this.label7);
        (this.txtAb = new JTextField()).setBounds(50, 165, 100, 25);
        this.txtAb.setBackground(new Color(224, 224, 224));
        this.txtAb.setFont(new Font("Andale Mono", 1, 14));
        this.txtAb.setForeground(new Color(0, 0, 0));
        this.add(this.txtAb);
        this.valor1 = this.txtAb;
        (this.comboArray = new JComboBox<String>(new String[] { "Kg", "g", "L", "ml" })).setBounds(205, 165, 100, 30);
        this.comboArray.setFont(new Font("Andale Mono", 3, 18));
        this.comboArray.setForeground(new Color(0, 0, 0));
        this.add(this.comboArray);
        (this.label8 = new JLabel("Unidad")).setBounds(205, 135, 200, 30);
        this.label8.setFont(new Font("Andale Mono", 1, 16));
        this.label8.setForeground(new Color(0, 0, 0));
        this.add(this.label8);
        (this.label9 = new JLabel("Producto")).setBounds(330, 135, 200, 30);
        this.label9.setFont(new Font("Andale Mono", 1, 16));
        this.label9.setForeground(new Color(0, 0, 0));
        this.add(this.label9);
        (this.txtAd = new JTextField()).setBounds(330, 165, 100, 25);
        this.txtAd.setBackground(new Color(224, 224, 224));
        this.txtAd.setFont(new Font("Andale Mono", 1, 14));
        this.txtAd.setForeground(new Color(0, 0, 0));
        this.add(this.txtAd);
        (this.label10 = new JLabel("Precio")).setBounds(500, 135, 200, 30);
        this.label10.setFont(new Font("Andale Mono", 1, 16));
        this.label10.setForeground(new Color(0, 0, 0));
        this.add(this.label10);
        (this.txtAc = new JTextField()).setBounds(500, 165, 100, 25);
        this.txtAc.setBackground(new Color(224, 224, 224));
        this.txtAc.setFont(new Font("Andale Mono", 1, 14));
        this.txtAc.setForeground(new Color(0, 0, 0));
        this.add(this.txtAc);
        this.valor2 = this.txtAc;
        (this.label32 = new JLabel("SIGANME EN INSTAGRAM PARA MAS CONTENIDO https://www.instagram.com/rulyprogramming/ ")).setBounds(50, 330, 580, 25);
        this.label32.setFont(new Font("Andale Mono", 1, 12));
        this.label32.setForeground(new Color(255, 255, 255));
        this.add(this.label32);
        (this.labelResultado = new JLabel("Resultado del Calculo:")).setBounds(220, 370, 180, 25);
        this.labelResultado.setFont(new Font("Andale Mono", 1, 12));
        this.labelResultado.setForeground(new Color(255, 255, 255));
        this.add(this.labelResultado);
        (this.textarea1 = new JTextArea()).setEditable(false);
        this.textarea1.setBackground(new Color(224, 224, 224));
        this.textarea1.setFont(new Font("Andale Mono", 1, 16));
        this.textarea1.setForeground(new Color(255, 0, 0));
        this.textarea1.setText("\n   Aqui aparece el resultado del calculo.");
        (this.scrollpane1 = new JScrollPane(this.textarea1)).setBounds(220, 390, 385, 90);
        this.add(this.scrollpane1);
        (this.boton1 = new JButton("Calcular")).setBounds(100, 390, 100, 30);
        this.boton1.setBackground(new Color(255, 255, 255));
        this.boton1.setFont(new Font("Andale Mono", 1, 14));
        this.boton1.setForeground(new Color(255, 0, 0));
        this.boton1.addActionListener(this);
        this.add(this.boton1);
        (this.boton2 = new JButton("Salir")).setBounds(100, 432, 100, 30);
        this.boton2.setBackground(new Color(255, 255, 255));
        this.boton2.setFont(new Font("Andale Mono", 1, 14));
        this.boton2.setForeground(new Color(255, 0, 0));
        this.boton2.addActionListener(this);
        this.add(this.boton2);
        (this.label11 = new JLabel("Calculo")).setBounds(50, 235, 200, 30);
        this.label11.setFont(new Font("Andale Mono", 1, 18));
        this.label11.setForeground(new Color(0, 0, 0));
        this.add(this.label11);
        (this.label12 = new JLabel("Cantidad")).setBounds(50, 265, 200, 30);
        this.label12.setFont(new Font("Andale Mono", 1, 16));
        this.label12.setForeground(new Color(0, 0, 0));
        this.add(this.label12);
        (this.label13 = new JLabel("Unidad")).setBounds(205, 265, 200, 30);
        this.label13.setFont(new Font("Andale Mono", 1, 16));
        this.label13.setForeground(new Color(0, 0, 0));
        this.add(this.label13);
        (this.txtAe = new JTextField()).setBounds(50, 295, 100, 25);
        this.txtAe.setBackground(new Color(224, 224, 224));
        this.txtAe.setFont(new Font("Andale Mono", 1, 14));
        this.txtAe.setForeground(new Color(0, 0, 0));
        this.add(this.txtAe);
        this.valor3 = this.txtAe;
    }
    
    @Override
    public void actionPerformed(final ActionEvent actionEvent) {
        if (actionEvent.getSource() == this.boton1) {
            if (this.valor1.getText().equals("") || this.valor2.getText().equals("") || this.valor3.getText().equals("") || this.txtAd.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Los datos no estan completos", "Error", 0);
            }
            else {
                if (this.comboArray.getSelectedItem().equals("Kg") && this.comboArrayList.getSelectedItem().equals("Kg")) {
                    final double double1 = Double.parseDouble(this.valor1.getText());
                    final double double2 = Double.parseDouble(this.valor2.getText());
                    final double double3 = Double.parseDouble(this.valor3.getText());
                    this.textarea1.setText("El costo de " + double3 + " Kilogramos de " + this.txtAd.getText() + " es de " + String.valueOf(double3 * double2 / double1));
                }
                if (this.comboArray.getSelectedItem().equals("Kg") && this.comboArrayList.getSelectedItem().equals("g")) {
                    final double double4 = Double.parseDouble(this.valor1.getText());
                    final double double5 = Double.parseDouble(this.valor2.getText());
                    final double double6 = Double.parseDouble(this.valor3.getText());
                    this.textarea1.setText("El costo de " + double6 + " gramos de " + this.txtAd.getText() + " es de " + String.valueOf(double6 / 1000.0 * double5 / double4));
                }
                if (this.comboArray.getSelectedItem().equals("g") && this.comboArrayList.getSelectedItem().equals("Kg")) {
                    final double double7 = Double.parseDouble(this.valor1.getText());
                    final double double8 = Double.parseDouble(this.valor2.getText());
                    final double double9 = Double.parseDouble(this.valor3.getText());
                    this.textarea1.setText("El costo de " + double9 + " Kilogramos de " + this.txtAd.getText() + " es de " + String.valueOf(double9 * double8 * 1000.0 / double7));
                }
                if (this.comboArray.getSelectedItem().equals("g") && this.comboArrayList.getSelectedItem().equals("g")) {
                    final double double10 = Double.parseDouble(this.valor1.getText());
                    final double double11 = Double.parseDouble(this.valor2.getText());
                    final double double12 = Double.parseDouble(this.valor3.getText());
                    this.textarea1.setText("El costo de " + double12 + " gramos de " + this.txtAd.getText() + " es de " + String.valueOf(double12 * double11 / double10));
                }
                if (this.comboArray.getSelectedItem().equals("L") && this.comboArrayList.getSelectedItem().equals("L")) {
                    final double double13 = Double.parseDouble(this.valor1.getText());
                    final double double14 = Double.parseDouble(this.valor2.getText());
                    final double double15 = Double.parseDouble(this.valor3.getText());
                    this.textarea1.setText("El costo de " + double15 + " litros de " + this.txtAd.getText() + " es de " + String.valueOf(double15 * double14 / double13));
                }
                if (this.comboArray.getSelectedItem().equals("L") && this.comboArrayList.getSelectedItem().equals("ml")) {
                    final double double16 = Double.parseDouble(this.valor1.getText());
                    final double double17 = Double.parseDouble(this.valor2.getText());
                    final double double18 = Double.parseDouble(this.valor3.getText());
                    this.textarea1.setText("El costo de " + double18 + " mililitros de " + this.txtAd.getText() + " es de " + String.valueOf(double18 / 1000.0 * double17 / double16));
                }
                if (this.comboArray.getSelectedItem().equals("ml") && this.comboArrayList.getSelectedItem().equals("L")) {
                    final double double19 = Double.parseDouble(this.valor1.getText());
                    final double double20 = Double.parseDouble(this.valor2.getText());
                    final double double21 = Double.parseDouble(this.valor3.getText());
                    this.textarea1.setText("El costo de " + double21 + " Litros de " + this.txtAd.getText() + " es de " + String.valueOf(double21 * double20 * 1000.0 / double19));
                }
                if (this.comboArray.getSelectedItem().equals("ml") && this.comboArrayList.getSelectedItem().equals("ml")) {
                    final double double22 = Double.parseDouble(this.valor1.getText());
                    final double double23 = Double.parseDouble(this.valor2.getText());
                    final double double24 = Double.parseDouble(this.valor3.getText());
                    this.textarea1.setText("El costo de " + double24 + " mililitros de " + this.txtAd.getText() + " es de " + String.valueOf(double24 * double23 / double22));
                }
                if (this.comboArray.getSelectedItem().equals("L") && this.comboArrayList.getSelectedItem().equals("Kg")) {
                    JOptionPane.showMessageDialog(null, "No es posible combinar las 2 unidades seleccionadas", "Error", 0);
                    this.textarea1.setText(" ");
                }
                if (this.comboArray.getSelectedItem().equals("ml") && this.comboArrayList.getSelectedItem().equals("g")) {
                    JOptionPane.showMessageDialog(null, "No es posible combinar las 2 unidades seleccionadas", "Error", 0);
                    this.textarea1.setText(" ");
                }
                if (this.comboArray.getSelectedItem().equals("g") && this.comboArrayList.getSelectedItem().equals("ml")) {
                    JOptionPane.showMessageDialog(null, "No es posible combinar las 2 unidades seleccionadas", "Error", 0);
                    this.textarea1.setText(" ");
                }
                if (this.comboArray.getSelectedItem().equals("g") && this.comboArrayList.getSelectedItem().equals("L")) {
                    JOptionPane.showMessageDialog(null, "No es posible combinar las 2 unidades seleccionadas", "Error", 0);
                    this.textarea1.setText(" ");
                }
                if (this.comboArray.getSelectedItem().equals("L") && this.comboArrayList.getSelectedItem().equals("g")) {
                    JOptionPane.showMessageDialog(null, "No es posible combinar las 2 unidades seleccionadas", "Error", 0);
                    this.textarea1.setText(" ");
                }
                if (this.comboArray.getSelectedItem().equals("Kg") && this.comboArrayList.getSelectedItem().equals("L")) {
                    JOptionPane.showMessageDialog(null, "No es posible combinar las 2 unidades seleccionadas", "Error", 0);
                    this.textarea1.setText(" ");
                }
                if (this.comboArray.getSelectedItem().equals("Kg") && this.comboArrayList.getSelectedItem().equals("ml")) {
                    JOptionPane.showMessageDialog(null, "No es posible combinar las 2 unidades seleccionadas", "Error", 0);
                    this.textarea1.setText(" ");
                }
                if (this.comboArray.getSelectedItem().equals("ml") && this.comboArrayList.getSelectedItem().equals("Kg")) {
                    JOptionPane.showMessageDialog(null, "No es posible combinar las 2 unidades seleccionadas", "Error", 0);
                    this.textarea1.setText(" ");
                }
            }
        }
        if (actionEvent.getSource() == this.boton2) {
            System.exit(0);
        }
    }
    
    public static void main(final String[] array) {
        final Cotizacion cotizacion = new Cotizacion();
        cotizacion.setBounds(0, 0, 640, 535);
        cotizacion.setVisible(true);
        cotizacion.setResizable(false);
        cotizacion.setLocationRelativeTo(null);
    }
}
