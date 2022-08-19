
package ejercicio1;


import javax.swing.JOptionPane;

public class Ejercicio1 {  
    public static void main(String[] args) {
        String nombre1=JOptionPane.showInputDialog("digite un nombre");
        String edad1=JOptionPane.showInputDialog("digite su edad");
        String nombre2=JOptionPane.showInputDialog("digite un nombre");
        String edad2=JOptionPane.showInputDialog("digite su edad");
        String nombre3=JOptionPane.showInputDialog("digite un nombre");
        String edad3=JOptionPane.showInputDialog("digite su edad");
        
       Nombre dat=new Nombre(nombre1, edad1, nombre2, edad2, nombre3, edad3);
        System.out.println(dat); 
    }

   

   
    
}
