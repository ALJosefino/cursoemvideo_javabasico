
package aula13exercicio02;

/**
 *
 * @author andre
 */

public class Aula13Exercicio02 {

    /**
     * @param args the command line arguments
     */

    public static void main(String[] args) {
        
        int xx = 0, cc = 0, rr = 0; 
        
        for ( int x = 1; x < 10; x ++ ) {
        
        ++ xx;    
            
        System.out.println( xx + " Varável x contendo " + x);
        
        }
        
        for ( int c = 33; c > 13; c -=2) {
            
        ++ cc;             
        
        System.out.println(cc + " Variável c contendo " + c);
        
        }
        
        /* for ( int d = 1; d<=10; d--) {
        
        System.out.println("Variável d " + d);
                
        } */
        
        for ( int r = 13; r <= 33 ; r += 2) {
        
        ++ rr;    
            
        System.out.println(rr + " Variável r contendo " + r);
            
        }
        
    }
    
}
