
package repeticao01;

import java.util.Scanner;

/**
 *
 * @author andre
 */

public class Repeticao01 {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        
        System.out.print ( "Cambalhotas, quentas queres?" ) ;
        
        Scanner teclado = new Scanner (System.in) ;
        
        int cambota = teclado.nextInt(); 
            
        int cc = 1; 
        
        do  {        
            System.out.println ( "Cambalhota" + cc ) ;
            
            cc ++  ;
            
        } while ( cc <= cambota ) ;
        
        System.out.println ( "FIM DAS CAMBALHOTAS" ) ;
    }
    
}
