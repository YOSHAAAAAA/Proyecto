package leerX;
/*
 * Proposito: Imprimir el valor de y
 *     mientra que x sea mayor que cero
 *     donde x es leída por el teclado
 */
import java.util.Scanner;

public class LeerX {
    public void leerX(){
        //Definir objeto
        Scanner teclado = new Scanner(System.in);
        //definir variavble de salida
        final int Y=99;
        //definir variable de entrada
        int x;
        System.out.print("Introduce valor de x:");
        x = teclado.nextInt();
        while(x>0){
            System.out.println("Valor de y:"+Y);
            System.out.print("Introduce valor de x:");
            x = teclado.nextInt();

        }
        teclado.close();


    }
    
}