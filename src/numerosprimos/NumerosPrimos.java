
package numerosprimos;

import java.util.Scanner;
public class NumerosPrimos {

    public static void main(String[] args) {
   
        Scanner teclado= new Scanner(System.in);
        
        System.out.println("Imprimir numeros primos que hay en cierto rango ingresado.");
        
        System.out.println("Ingrese el inicio del rango: ");
        int i=teclado.nextInt();
        System.out.println("Ingrese el final del rango: ");
        int y=teclado.nextInt();
        
            for(int x=i;x<=y;x++){
                if(x%2==1){
                    System.out.println(x);    
                }
            }
        System.out.println("Fin de la impresión");            
        }
    }
