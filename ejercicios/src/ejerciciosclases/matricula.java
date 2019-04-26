
package ejerciciosclases;
import java.util.Scanner;

public class matricula {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String ciudad;
        String estado_civil;
        int edad;
        double costo_matricula= 1200;
        double costo_final;
        double descuento=0;
        double impuesto =0;
        System.out.println("Ingrese su ciudad de origen:");
        ciudad =entrada.nextLine();
        
        System.out.println("Ingrese su estado civil:");
        estado_civil =entrada.nextLine();
        
        System.out.println("Ingrese su edad:");
        edad =entrada.nextInt();
        if(ciudad.equals("Loja") || ciudad.equals("Zamora")){
            descuento= (costo_matricula*20)/100;
            costo_final = costo_matricula - descuento;
        }
        if((edad >= 17) || (edad < 80)){
            descuento = descuento + (10* costo_matricula)+100;
        }
        if(estado_civil.equals("casado")){
            descuento = descuento + (5* costo_matricula)+100;
        }
        impuesto =(2*costo_matricula)/100;
        costo_final = costo_matricula -descuento + impuesto;
        System.out.println("El valor de su matricula es de" +costo_final);
    }
}
