
package aula15exercicio02;

/**
 *
 * @author andre
 */

public class Aula15Exercicio02 {

    /**
     * @param args the command line arguments
     */

    static int f1 (int n) {
    
        return n%2 ;
    
    }
    
    static int f2 (int n) {
    
        return n*2 ;
        
    }
            
    static int f3 (int a, int b) {
    
        return a+b ;
        
    }   
            
            
    public static void main(String[] args) {
        
        System.out.println( f3 (f1 (3), f2 (5)));
                
        
    }
    
}
