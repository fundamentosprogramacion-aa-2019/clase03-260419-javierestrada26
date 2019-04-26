
package paquetecinco;
import paquetedos.mi_mensaje;
import java.util.Scanner;
public class condicionaldoble {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int calificacion ;
        String nota_1 = mi_mensaje.nota;
        String nota_2 = mi_mensaje.nota_dos;
        System.out.println("Ingrese la nota por favor:");
        calificacion =entrada.nextInt();
        
        if(calificacion >= 80){
            System.out.printf("Su %s es con %s puntos " ,nota_1 , calificacion);
        }else{
            System.out.printf("Su %s es con %s puntos " , nota_2
                    , calificacion);
        }
    }
}
