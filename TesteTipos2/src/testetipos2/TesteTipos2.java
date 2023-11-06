package testetipos2;

import java.util.Scanner;

public class TesteTipos2 {

    public static void main(String[] args) {
        
        System.out.print("Digite um número: ");
        
        Scanner entrada = new Scanner(System.in);
        
        String cadeia = entrada.nextLine();
        
        System.out.format("O número %s digitado foi arquivado como cadeia de "
                + "caracteres \n", cadeia);
        
        System.out.print("Digite uma palavra para juntar com o número: ");
        
        String cadeia2 = entrada.nextLine();
        
        System.out.println("A palavra digitada foi: " + cadeia2);
                        
        String cadeia3 = cadeia + cadeia2;
        
        System.out.format("A união das variaveis "
                + "tipo String foi: %s \n", cadeia3);
                
        System.out.println("______________________________________________");
        
        int inteiro = Integer.parseInt(cadeia);
        
        System.out.println( "O número " + inteiro + " agora esta como inteiro");
        
        System.out.printf("Digite um número inteiro para somar "
                + "com o número que primeiro entrou como String:");
        
        int inteiro1 = entrada.nextInt();
        
        System.out.println("O segundo número inteiro "
                + " digitado foi " + inteiro1);
        
        int soma_inteiros = inteiro + inteiro1;
        
        System.out.println("A soma dos inteiros é: " + soma_inteiros);
        
    }
    
}
