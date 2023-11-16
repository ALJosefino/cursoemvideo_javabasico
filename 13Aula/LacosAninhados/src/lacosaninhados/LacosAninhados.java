

package lacosaninhados;

import java.util.Scanner;

/**
 *
 * @author andre
 */

public class LacosAninhados {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        int semana, dia;


        for( semana = 1; semana <= 4 ; semana++ ) {
        
            System.out.println(semana+"ª do semana do mês");
            
            teclado.nextLine();
            
            
            for ( dia = 0; dia < 7; dia++  ) {
                
                if (dia == 1){
                
                    System.out.println("Segunda-feira");
                
                }  else if ( dia == 2 ) {
                    
                    System.out.println("Terça-feira");
                
                }  else if ( dia == 3 ) {
                
                    System.out.println("Quarta-feira");
                            
                }  else if ( dia == 4 ) {
                    
                    System.out.println("Quinta-feira");
                
                }  else if ( dia == 5 ) {
                
                    System.out.println("Sexta-feira");
                    
                } else if ( dia == 6 ) {
                    
                    System.out.println("Sábado");
                
                } else {
                    
                    System.out.println("Domingo");
                
                            }
                    
            teclado.nextLine();
                      
                      }
            
            System.out.println("Depois de " + dia +" dias a " + semana+"ª "
                    + "do semana do mês terminou. Logo começa a");
        }
        
        
    }
    
}
