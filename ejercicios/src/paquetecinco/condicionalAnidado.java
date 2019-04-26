
package paquetecinco;
import java.util.Scanner;
import paquetedos.mi_mensajedos;
public class condicionalAnidado {
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
         int calificacion ;
         String nice = mi_mensajedos.aprobado;
         String fail = mi_mensajedos.reprobado;
         String note_1 = mi_mensajedos.nota_1;
         String note_2 = mi_mensajedos.nota_2;
         String note_3 = mi_mensajedos.nota_3;
         System.out.println("Por favor ingrese su calificacion:");
         calificacion = entrada.nextInt();
        if (calificacion >= 90) {
            System.out.printf("%s (%s) con %d\n", 
                    nice, note_1, calificacion);
        } else {
            if (calificacion < 90 && calificacion >= 80) {
                System.out.printf("%s (%s) con %d\n", 
                    nice, note_2, calificacion);
            } else {
                if (calificacion < 80 && calificacion >= 50) {
                    System.out.printf("%s (%s) con %d\n", 
                    nice, note_3, calificacion);

                } else {
                    System.out.printf("%s  con %d\n", 
                    fail, calificacion);
                }
            }
}
    }
}
