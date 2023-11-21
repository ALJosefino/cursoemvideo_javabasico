
package vetor15;

import java.util.Arrays;

/**
 *
 * @author andre
 */

public class Vetor15 {

    /**
     * @param args the command line arguments
     */

    public static void main(String[] args) {

        int [] vetor = new int [7];
        
        int x [] = {6, 9, 3, 1, 4, 7, 5};
        
        vetor = x;
                
        Arrays.sort(vetor);
        
        for ( int conteudo : vetor ) {
        
            System.out.print(conteudo + " ");
            
        }
        
        System.out.println("");
        
        int posicao = Arrays.binarySearch(vetor, 1);
        
        System.out.println("O número procurado esta na posicção: " + posicao);
                
    }
    
}
