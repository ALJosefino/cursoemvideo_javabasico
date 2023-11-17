
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
        
        int [] q = { 9, 1, 3, 7, 2, 8, 6, 4, 0, 5}; 
        
        int a = q.length;
        
        System.out.printf("Total de casas do vetor nome q é %d \n", a);
        
        for (int c=0; c <= a; c++ ) {
        
            System.out.printf("Na posição %d temos o conteúdo %d \n", c, q[c]);
        
        }
        
    }

    
    
}
