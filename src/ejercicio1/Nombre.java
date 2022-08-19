

package ejercicio1;

public class   Nombre {
private String nombre1;
private String edad1;
private String nombre2 ;
private String edad2;
private String nombre3;
private String edad3;

    public Nombre(String nombre1, String edad1, String nombre2, String edad2, String nombre3, String edad3) {
        this.nombre1 = nombre1;
        this.edad1 = edad1;
        this.nombre2 = nombre2;
        this.edad2 = edad2;
        this.nombre3 = nombre3;
        this.edad3 = edad3;
    }

    @Override
    public String toString() {
        return "" + "\n" + nombre1 + " tiene " + edad1 + " años "+  "\n" + nombre2 + " tiene " + edad2 + " años " +  "\n"  + nombre3 + " tiene " + edad3 + " años ";
    }

  

   
  
   

    }

     


