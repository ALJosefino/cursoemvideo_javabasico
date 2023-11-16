
package aula12exercicio02;

/**
 *
 * @author andre
 */
public class Aula12Exercicio02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int c = 1 ;
        
        do {
        
            if ( c % 5 != 0 ) System.out.print(c);
            
            else break;
            
            c += 1 ;
                               
        } while (c <= 10 );
    }
    
}
