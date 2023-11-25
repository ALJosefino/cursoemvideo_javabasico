
package testefuncao00;

import java.util.Scanner;

/**
 *
 * @author andre
 */
public class TesteFuncao00 {

    /**
     * @param args the command line arguments
     */
    
    static void soma(int a, int b) {
    
        int s = a + b;
    
        System.out.printf("A soma de %d + %d = %d \n", a, b, s);
        
    }
    
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Digite um número para somar: ");
        
        int a = teclado.nextInt();
        
        System.out.printf("\n");
        
        System.out.print("Digite outro número para somar: ");
        
        int b = teclado.nextInt();
                
        System.out.print("\n");
        
        soma(a,b);
        
    }
    
}
