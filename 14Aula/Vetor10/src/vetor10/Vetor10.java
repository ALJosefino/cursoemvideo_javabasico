package vetor10;

/**
 *
 * @author andre
 */
public class Vetor10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
        int [] n = new int [4];
        
        int x [] = {3,2,8,7,5,4};
        
        n = x;
        
        for (int c = 0; c <= 5; c++ ) {
        
            //System.out.print(c);
            
           System.out.println("Na posição " + c + " temos o conteúdo: " + n[c]);
            
        }
        
    }
    
}
