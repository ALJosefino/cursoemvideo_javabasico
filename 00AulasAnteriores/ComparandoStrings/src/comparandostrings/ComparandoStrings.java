
package comparandostrings;

import java.util.Scanner;

public class ComparandoStrings {

    public static void main(String[] args) {
             
        String nome1 = "Andre";
        String nome2 = "Andre";
        String nome3 = new String("Andre");
        String resultado, resultado1, resultado2, resultado3;
        
        resultado = (nome1==nome2)?"iguais":"diferentes";
        System.out.printf("Os nomes são: %s \n", resultado);
        
        resultado1 = (nome1==nome3)?"iguais":"diferentes";
        System.out.printf("Os nomes são: %s \n", resultado1);
        
        
        resultado2 = nome1.equals(nome3)?"Iguais":"diferentes";
        
        System.out.printf("Usado o método equals no objeto: %s \n", resultado2);
                
        resultado3 = nome3.toLowerCase();
        
        System.out.printf("Usado o método toLowerCase no objeto: %s \n", resultado3);
        
    }
    
}
