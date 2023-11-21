
package vetor13;

/**
 *
 * @author andre
 */
public class Vetor13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        double [] n = new double [6];
        
        double x [] = {3.1, 5.82, -8.35, 4, 7.7};
        
        n = x;
        
        for (double conteudo : n) {
        
            System.out.println(conteudo);
        
        }
        
    }
    
}
