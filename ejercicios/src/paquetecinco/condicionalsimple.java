
package paquetecinco;
import paquetedos.mi_mensaje;
import java.util.Scanner;
public class condicionalsimple {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int calificacion ;
        int calificacion_dos;
        String nota_final =mi_mensaje.nota; 
        System.out.println("Ingrese la primera calificacion:");
        calificacion =entrada.nextInt();
        System.out.println("Ingrese la segunda calificacion:");
        calificacion_dos =entrada.nextInt();
    
        if(calificacion >= 85){
            System.out.printf("%s con %d puntos\n" , nota_final,calificacion);
        }
       
        if(calificacion_dos>=85){
            System.out.printf("%s con %d puntos\n" , nota_final,calificacion_dos);
        }
        System.out.println("");
    }
}
