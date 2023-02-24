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
       }
}
