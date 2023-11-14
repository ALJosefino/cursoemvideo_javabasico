
package contador01;

/**
 *
 * @author andre
 */

public class Contador01 {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        
        int cc = 0;
        
        while ( cc < 10){
        
            System.out.println("Cambalhota" + cc);
            cc++;
            
        }
        
        
        int kk = 1;
        
        while ( kk < 100) {
        
            System.out.printf("Contando %d \n",  kk);
            kk += 10;
        }
        
        
        int jj = 0;
                
        while (jj < 20) { 
        
            jj ++;
            
            if (jj == 5 || jj == 7 || jj == 9 || jj == 11) {
            
                continue; // Aqui voltou pro jj ++ e não imprimiu o Soma 5, 7, 9. 11
                
            }
            
            System.out.println("Soma" + jj );
                          
        }
        
        int ss = 1;
        
        while (ss < 20 ) {
        
            if (ss == 13) {
            
                break; // Aqui encerrou o laço por ser verdadeira a condição
            
            }
            
            System.out.printf("%d \n", ss);
            
            ss ++;
            
        }
        
        int zz = 0;
        
        while (zz < 20) {
            
            zz ++;
            
            if ( zz == 5 || zz == 7 || zz == 9 || zz == 11 ) {
            
                continue;
            }
            
            if (zz == 17 ) {
            
                break;
            }
            
            System.out.printf("Passo %d \n", zz);
                       
        }
        
        System.out.println("Aqui saiu de todos os laços");
    }
    
}
