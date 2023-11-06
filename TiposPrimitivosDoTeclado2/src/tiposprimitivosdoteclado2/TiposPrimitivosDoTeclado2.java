package tiposprimitivosdoteclado2;

import java.util.Scanner;

public class TiposPrimitivosDoTeclado2 {

    public static void main(String[] args) {
        
        System.out.print("Olá! \n"); 
        System.out.println("Programa para cadastrar nome, \n"
                + "sobrenome e idade de uma pessoa." );
      
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Digite o nome de uma pessoa: ");
        
        String nome = entrada.nextLine();
        
        System.out.printf("Nome da pessoa digitada foi: %s \n",nome); 
        
        System.out.printf("Digite a idadade de %s ", nome);
        
        int idade = entrada.nextInt();
        
        System.out.println(nome + " tem " + idade + " anos de idade");
        
        // float salario = entrada.
   }    
}
