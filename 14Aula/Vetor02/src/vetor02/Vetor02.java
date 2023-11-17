
package vetor02;

/**
 *
 * @author andre
 */

public class Vetor02 {

    /**
     * @param args the command line arguments
     */

    public static void main(String[] args) {
        
        int q [] = new int [10];
        
        int [] k = { 9, 1, 3, 7, 2, 8, 6, 4, 0, 5};        
        
        q = k;  
                 
        System.out.println("Total de casas do vetor nome q é " + q.length);
                       
        for (int c = 0; c < q.length; c++ ) {
        
            System.out.println("Na posição " + c + " temos o conteúdo " + q[c]);
        
        }
        
    }

    
    
}
