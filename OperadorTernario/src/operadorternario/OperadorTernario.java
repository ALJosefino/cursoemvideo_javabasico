package operadorternario;

import java.util.Scanner;

public class OperadorTernario {

    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
                
        System.out.print("Digite um número: ");
        
        int n1 = teclado.nextInt();
        
        System.out.print("Digite outro número: ");
        
        int n2 = teclado.nextInt();
        
        int r = (n1 > n2)?0:1;
        
        System.out.printf("Número 0 o primeiro número digitado é maior: %d \n", r);
        
        System.out.println("Número 1 o segundo número digitado é maior");
               
    }
    
}
