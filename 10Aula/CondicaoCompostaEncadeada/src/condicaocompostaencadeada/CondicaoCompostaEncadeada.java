
package condicaocompostaencadeada;

import java.util.Scanner;

public class CondicaoCompostaEncadeada {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.println("NÃO votar, votar é OPCIONAL, ou votar é OBRIGATÓRIO");
        
        Scanner entrada = new Scanner(System.in);
    
        System.out.print("Digite ano de nascimento: ");
        
        int ano_nascimento = (int) entrada.nextInt();
        
        System.out.printf("Este número, %d, foi digitado como ano de nascimento."
                + "\n", ano_nascimento);
        
        int ANO_ATUAL = (int) 2023;
        
        int idade = ANO_ATUAL - ano_nascimento;
        
        System.out.printf("%d é o ano atual, e quem nasceu em %d esta com "
                + "%d anos de idade. \n", ANO_ATUAL, ano_nascimento, idade);
        
        if (idade<16){
            
            System.out.printf("Com %d anos de idade, esta abaixo "
                    + "de 16 anos idade, por isto NÃO VOTA. \n", idade);
        } else 
                if ((idade>=16 && idade<18 ) || (idade>70)) {
                
                System.out.printf("Com %d anos de idade é "
                        + "OPCIONAL votar \n", idade);
                
                } else {
                    
                    System.out.printf("Com %d anos de idade, "
                            + "VOTAR É OBRIGATÓRIO! \n", idade);
                        }
    }
}