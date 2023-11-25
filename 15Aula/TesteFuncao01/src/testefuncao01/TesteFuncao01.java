
package testefuncao01;

/**
 *
 * @author andre
 */
public class TesteFuncao01 {

    /**
     * @param args the command line arguments
     */
    
     static int soma ( int a, int b ) {
    
        int s = a + b;
        
        return s;
        
    }  
    
    public static void main(String[] args) {
        
       int sm = soma(5,2); 
        
       System.out.println("A soma é " + sm);
        
    }
    
}
