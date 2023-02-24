/***
*Programa: ProyectoFisica.java
*Autor:    Portillo Casillas Bruno Eduardo
*Fecha:    15/11/2020
*Descripcion: segura la vida y asegura la felicidad.
*
***/

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Practica4Asegurador extends JFrame implements ActionListener {

    /**
*
*/
private static final long serialVersionUID = 1L;
private JLabel etiquetaPregunta1, etiquetaPregunta2, etiquetaPregunta3;
    private JTextField campoTextoResultado,campoPregunta1, campoPregunta2, campoPregunta3;
    private JButton botonCerrar, botonLimpiar, botonAceptar;
   

    public static void main(String[] args) {
        Practica4Asegurador demo = new Practica4Asegurador ();
        demo.setSize(800,800);
        demo.crearGUI();
        demo.setTitle("ProyectoFisica");
        demo.setVisible(true);
    }  

    private void crearGUI() {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        Container ventana = getContentPane();
        ventana.setLayout(new FlowLayout());
        
        etiquetaPregunta1 = new JLabel("Ingrese el peso del objeto en 'Kg'");
        etiquetaPregunta1.setBounds(360, 210, 380, 235);
        ventana.add(etiquetaPregunta1);
       
        campoPregunta1 = new JTextField(10);
        campoPregunta1.setVisible(true);
        campoPregunta1.setBounds(360, 210, 380, 225);
        ventana.add(campoPregunta1);
        
         etiquetaPregunta2 = new JLabel("Ingrese la altura que desea en 'METROS'");
        etiquetaPregunta2.setBounds(360, 210, 380, 235);
        ventana.add(etiquetaPregunta1);
       
        campoPregunta2 = new JTextField(10);
        campoPregunta2.setVisible(true);
        campoPregunta2.setBounds(360, 240, 380, 265);
        ventana.add(campoPregunta1);
       }
}
