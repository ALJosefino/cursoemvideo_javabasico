
package programapernas;

import java.util.Scanner;

/**
 *
 * @author andre
 */
public class ProgramaPernas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner tec = new Scanner(System.in);
        
        System.out.print("Quantas pernas?");
        
        int perna = (int) tec.nextInt();
        
        System.out.print("Isso é um(a) ");
        
        String tipo;
        
        switch(perna) {
        
            case 1:
            
                tipo = "Saci";
                
                break;
            
            case 2:
                
                tipo = "Bípede";
               
                break;
                
            case 3:
                
                tipo = "Tripé";
                
                break;
                
            case 4:
                
                tipo = "Quadrúpede";
                
                break;
                
            case 6:
                
                tipo = "Aranha";
                
                break;
                
            default:
               
                tipo = "ET";
                
                break;
        }
                
        System.out.println(tipo);
        
    }
    
}
