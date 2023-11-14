
package cambalhotas;

import java.util.Scanner;

/**
 *
 * @author andre
 */

public class Cambalhotas {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Quantas cambalhotas você quer ver? ");
        
        int ver = (int) teclado.nextInt();
        
        System.out.printf("Vocêr quer ver %d cambalhotas! \n", ver);
        
        int cambalhotas = (int) 0;
        
        while (cambalhotas<ver) {
            
            System.out.printf("Cambalhota %d \n", cambalhotas );
            
            cambalhotas ++;
        
        }
        
        
        
        
        
        
        
    }
    
}
