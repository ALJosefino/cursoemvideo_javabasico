
package numeros01;

import java.util.Scanner;

/**
 *
 * @author andre
 */

public class Numeros01 {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner (System.in);
        
        int numero, soma = 0;
        
        String resposta = new String(); 
    
        do {
        
            System.out.print("Digite um número: ");
            
            numero = teclado.nextInt();
            
            System.out.printf("Número %d digitado \n", numero);
            
            soma += numero;
            
            System.out.print("Quer continuar? [Sim/Não] :");
            
            resposta = teclado.next();
            
            System.out.printf("Resposta fois %s \n", resposta);
                       
        } while (resposta.equals("Sim"));
        
        System.out.println ("A soma de todos os números é " + soma);
        
        }
    
}
