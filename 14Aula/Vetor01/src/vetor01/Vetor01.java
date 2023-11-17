
package vetor01;

/**
 *
 * @author andre
 */

public class Vetor01 {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        
        int [] n = new int [6];
                     
        int x [] = {3,2,8,7,5,4};
       
        n = x;
        
        for (int c = 0; c <= 5; c++) {
         
            System.out.printf("Na posicção %d conteúdo ", c);
            
            System.out.println(n[c]);
            
        }
        
        
    }
    
}
