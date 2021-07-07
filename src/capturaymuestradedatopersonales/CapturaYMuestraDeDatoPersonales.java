
package capturaymuestradedatopersonales;

import java.util.Scanner;

/**
 * @author juan mercado - mercadojuanc25@gmail.com
 */
public class CapturaYMuestraDeDatoPersonales {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        
        String nombre;
        String apellido;
        byte edad=0;
        String hobbie;
        String editorDeCodigoPreferido;
        String sistemaOperativoEnUso;
        
        System.out.println("   *** SISTEMA DE CAPTURA Y MUESTRA DE DATOS ***");
        System.out.println("");
        System.out.print("Ingrese su nombre: ");
        nombre= sc.next();
        System.out.print("Ingrese su apellido: ");
        apellido= sc.next();
        System.out.print("Ingrese su edad en años: ");
        edad= sc.nextByte();
        System.out.print("Ingrese su hobbie: ");
        hobbie= sc.next();
        System.out.print("Ingrese su editor de codigo preferido: ");
        editorDeCodigoPreferido= sc.next();
        System.out.print("Ingrese su sistema operativo en uso: ");
        sistemaOperativoEnUso= sc.next();
        System.out.println("");
        System.out.println("----------------------------------------------------");
        
        System.out.println(" ++ Los datos ingresados son:");
        System.out.println(" * Nombre: "+nombre+".");
        System.out.println(" * Apellido: "+apellido+".");
        System.out.println(" * Edad: "+edad+" años.");
        System.out.println(" * hobbie: "+hobbie+".");
        System.out.println(" * Editor de codigo preferido: "+editorDeCodigoPreferido+".");
        System.out.println(" * Sistema operativo en uso: "+sistemaOperativoEnUso+".");
        
    }
    
}
