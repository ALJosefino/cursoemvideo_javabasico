
package aula13exercicio01;

/**
 *
 * @author andre
 */

public class Aula13Exercicio01 {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        
        int c = 0, s = 0;
        
        
        for ( c = 0 ; c <= 10; c += 2 ) {
        
             System.out.println("Variável c = " +c);
             
            s += c; 
            
            System.out.println("Varoavél s = " + s );
            System.out.println("_____________________________");
        }
             
    }
    
}
