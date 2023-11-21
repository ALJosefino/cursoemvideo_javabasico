
package vetor16;

import java.util.Arrays;

/**
 *
 * @author andre
 */

public class Vetor16 {

    /**
     * @param args the command line arguments
     */

    public static void main(String[] args) {
        
        int [] vetor = new int [8];
        
        Arrays.fill(vetor, 5);
                
        for (int conteudo : vetor) {
        
            System.out.println(conteudo);
            
        }
        
    }
    
}
