
package contador3;

import java.util.Scanner;

/**
 *
 * @author andre
 */

public class Contador3 {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
    
            System.out.print("De qual número de 1 até 15 você quer saber o "
                    + "fatorial? Por favor digite:");
            
            int n = teclado.nextInt();
            
                       
            System.out.printf("O número digitado foi %d \n", n);
            
            while ( n >= 16 || n < 0 ) {
                
                System.out.printf("Número %d acima de 15 ou inferior a 0 " +
                        "por favor digite um número entre 0 e 15: ", n);
                        
                        n = teclado.nextInt();
                                
                }
            
            int c = n;
            
            long f = 1;
            
            while (c >= 1) {
            
                f *= c;
                 
                System.out.printf( "%d x ",c );
                
                c --;
                
                System.out.printf( "%d = %d ", c, f) ;
                
            }
           
            System.out.printf(" = %d \n", f);
            
            System.out.printf("Fatorial do número %d é o número %d ", n, f);
                  
        }
    
}
