
package aula13exercicio03;

/**
 *
 * @author andre
 */

public class Aula13Exercicio03 {

    /**
     * @param args the command line arguments
     */

    public static void main(String[] args) {
        
        
        for (int i = 0; i <= 15; i += 2) {
        
            int x = i;
                       
            System.out.printf("Variável x = %d \n", x);
            
            if ( i % 3 == 0) continue;
            
            System.out.printf("Variável i = %d \n", i);
        }
     
    }
    
}
