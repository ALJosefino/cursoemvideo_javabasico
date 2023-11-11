package testetipos;

import java.util.Scanner;

public class TesteTipos {

    public static void main(String[] args) {
        
        System.out.println("Convertendo Números Inteiros em "
                + "cadeia de Caracteres ");
        
        System.out.print("Digite um número inteiro: ");
        
        Scanner entrada = new Scanner(System.in);
        
        int inteiro = entrada.nextInt();
        
        System.out.println("_______________________________________________");
        
        System.out.println(inteiro + " esta armazenado como inteiro");
        
        System.out.println("_______________________________________________");
        
        //String valor = inteiro;
        // Deu erro usado modo primitivo para conversão
        
        //String valor = (String) inteiro;
        //Deu erro usado typecast para conversão
        
        System.out.println("Depois de tentar conversões com tipos primitivos \n"
                + "e também testado como Typecast, foi com Wrapped Class ou \n"
                + "Classes em invólucros que foi convertido de Inteiro para \n"
                + "String ou cadeia de caracteres ");
        
        String cadeia = Integer.toString(inteiro);
        
        System.out.println("_______________________________________________");
        
        System.out.println (cadeia + " agora esta armazenado como String");
        
        }
    
}
