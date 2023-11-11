
package programaidade;

import java.util.Scanner;

public class ProgramaIdade {

    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Digite o ano de nascimento: ");
                
            int nasc = teclado.nextInt();
        
        System.out.printf("Ano de nascimento digitado foi: %d \n", nasc);
        
        int ANO_ATUAL = 2023;
        
        int idade = ANO_ATUAL - nasc;
        
        System.out.printf("Quem nasceu em %d hoje em %d esta com %d anos de idade \n", nasc, ANO_ATUAL, idade);
        
        if (idade>=18){
            
            System.out.printf("Com %d anos de idade, é considerado de maior \n", idade);
                        
        } else {
            
            System.out.printf("Com %d anos de idade, é considerado de menor \n", idade);
        }
    }
}
