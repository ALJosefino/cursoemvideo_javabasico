

package vetor17;

import java.util.Arrays;

/**
 *
 * @author andre
 */
public class Vetor17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int v [] = new int [20];
        
        Arrays.fill(v, 9);
        
        for (int posicao : v) {
        
            System.out.print(posicao + " ");
        }
        
    }
    
}
