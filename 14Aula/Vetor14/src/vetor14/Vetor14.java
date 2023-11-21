

package vetor14;

import java.util.Arrays;

/**
 *
 * @author andre
 */

public class Vetor14 {

    /**
     * @param args the command line arguments
     */

    public static void main(String[] args) {
        
        double [] n = new double [3];
        
        double x [] = {9.4, 7.5, -8.1, 2, 6,};
        
        n =x;
        
        Arrays.sort(n);
        
            for (double conteudo : n) {
            
                System.out.println(conteudo);
            
            }
        
    }
    
}
