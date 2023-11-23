
package vetor18;

import java.util.Scanner;

/**
 *
 * @author andre
 */

public class Vetor18 {

    /**
     * @param args the command line arguments
     */

    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Esta aplicação mostra os meses e "
                + "quantos dias cada um tem");
                      
        System.out.println("É um ano bissexto? ");
        
        System.out.print("Digite sim ou nao: ");
        
        String resposta = teclado.nextLine();
            
        boolean bissexto;
              
        bissexto = resposta.equalsIgnoreCase("sim") || 
                resposta.equalsIgnoreCase("nao") ? true : false; 
        
            while (bissexto == false) {
       
           System.out.print("Digite SOMENTE sim ou nao: ");
        
            resposta = teclado.nextLine();
                        
            bissexto = resposta.equalsIgnoreCase("sim") || 
                resposta.equalsIgnoreCase("nao") ? true : false; 
       
       } 
                                   
            String [] mes = {"Jan", "Fev", "Mar", "Abr", "Mai", "Jun", 
                "Jul", "Ago", "Set", "Out", "Nov", "Dez"};
            
                       
       if ( resposta.equalsIgnoreCase("sim") == true) {
       
            int [] dias = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
           
           for (int c = 0; c < mes.length; c ++ ) {
           
            System.out.printf("O Mês de %s tem %d dias. \n" , mes[c] , dias[c] );
               
           }
                      
       } else {
                 
           
           int [] dias = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
           
           for (int c = 0; c < mes.length; c ++ ) {
           
            System.out.printf("O Mês de %s tem %d dias. \n" , mes[c] , dias[c] );
       
           }
       } 
            
       } 
       
}
 
