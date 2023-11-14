
package aula11exericio03;

/**
 *
 * @author andre
 */

public class Aula11Exericio03 {

    /**
     * @param args the command line arguments
     */

    public static void main(String[] args) {
        
        int i = 1;
        
        int a = 0;
        
        while ( i < 10 ) {
            
            System.out.println("Laço número " + a);
                             
            ++ a;
                                  
            i = i + 1;
            
            System.out.printf("variável nome i = %d e nome a = %d \n", i, a);
            
            if ( a > 6 ) { 
               
                System.out.println("Se a>6 ++ i conteúdo de i agora: " + i);
                
                ++ i;
                                   
            }
                        
        }
        
        System.out.printf( "Final  i = %d e a = %d \n", i, a);
    }
    
}
