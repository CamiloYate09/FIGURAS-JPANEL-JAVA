
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Camilo
 */
public class Dibujos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
       String valor = JOptionPane.showInputDialog("Ingres alguna de las siguientes opciones \n"
               + "1 para rectangulo \n 2 para ovalo"
               +"3 para una figura 3D \n"
               +" 4 para una recta \n"
                );
       
        int valor1 = Integer.parseInt(valor);
        
        figuras camilo = new figuras(valor1);
        
        JFrame ventana = new JFrame();
        
        ventana.add(camilo);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setSize(1200, 1000);
        ventana.setVisible(true);
    }
    
   
    
}
