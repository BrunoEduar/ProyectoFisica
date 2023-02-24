/***
*Programa: ProyectoFisica.java
*Autor:    Portillo Casillas Bruno Eduardo
*Fecha:    23/02/23
*Descripcion: segura la vida y asegura la felicidad, para ello tenemos que aprobar o preparar el final.
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
private JLabel etiquetaPregunta1, etiquetaPregunta2, etiquetaResultado;
    private JTextField campoTextoResultado,campoPregunta1, campoPregunta2;
    private JButton botonCerrar, botonLimpiar, botonAceptar, botonRepetir;
   

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
        ventana.add(etiquetaPregunta2);
       
        campoPregunta2 = new JTextField(10);
        campoPregunta2.setVisible(true);
        campoPregunta2.setBounds(360, 240, 380, 265);
        ventana.add(campoPregunta2);
        
        
        etiquetaResultado = new JLabel("El trabajo necesario para esto es de:");
        etiquetaResultado.setBounds(360, 210, 380, 235);
        etiquetaResultado.setVisible(false);
        ventana.add(etiquetaResultado);
        
        campoResultado = new JTextField(10);
        campoResultado.setVisible(false);
        campoResultado.setBounds(360, 240, 380, 265);
        ventana.add(campoResultado);
        
         botonCerrar = new JButton("Cerrar");
        botonCerrar.setBounds(510, 350, 530, 370);
        ventana.add(botonCerrar);
        botonCerrar.addActionListener(this);
        
          botonLimpiar = new JButton("Limpiar");
        botonLimpiar.setBounds(510, 350, 530, 370);
        ventana.add(botonLimpiar);
        botonLimpiar.addActionListener(this);
       
        botonAceptar = new JButton("Aceptar");
        ventana.add(botonAceptar);
        botonAceptar.setBounds(410, 350, 430, 370);
        botonAceptar.addActionListener(this);
       }
    public void actionPerformed(ActionEvent event) {
    Object origen= event.getSource(); //permite trabajar con mas de un botón
    String cadenaPeso, cadenaDistacia, cadenaResultado;  // variable tipo texto
    double peso, distancia, fuerza, resultado, gravedad = 9.81;
        
    peso = campoPregunta1.getText();
    cadenaDistacia = campoPregunta2.getText();
     cadenaPeso = campoPregunta1.getText(); //recibe el valor de la caja de texto en la variable
        peso = Integer.parseDouble(cadenaPeso);
        distacia = Integer.parsetDouble(cadenaDistacia);
   
         if(origen == botonLimpiar){
            campoPregunta1.setText("");
            campoPregunta2.setText("");
            campoResultado.setText("");

         }else if(origen == botonAceptar && !"".equals(peso) && !"".equals(distancia){
            campoPregunta1.setEditable(false);
            campoPregunta2.setEditable(false);
            botonLimpiar.setVisible(false);
             botonAceptar.setVisible(false);
            
             fuerza = peso * gravedad;
             JOptionPane.showMessageDialog(null, "Su fuerza es de:" + fuerza + "N");
             resultado = fuerza * distacia;
             JOptionPane.showMessageDialog(null, "El trabajo necesario para ello es de:" + trabajo + "J");
             cadenaResultado = String.valueOf(resultado);
             campoResultado.setText(cadenaResultado + "J");
             etiquetaResultado.setVisible(true);
             campoResultado.setEditable(false);
         }
                  
        }else {
            System.exit(0);// Sale del Sistema
        }
    }
}
