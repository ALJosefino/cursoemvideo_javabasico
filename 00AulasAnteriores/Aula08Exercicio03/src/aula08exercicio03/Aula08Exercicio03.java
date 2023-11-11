package aula08exercicio03;

public class Aula08Exercicio03 {

    public static void main(String[] args) {
    
        boolean val1 = (4>=5);
        
        boolean val2 = (4<4);
                
        boolean val3 = (val1 == val2);
        
        boolean val4 = val1 ^ val3;
        
        boolean val5 = !val2 && val4;
        
        System.out.println(val4 + " "  + val5 );
        
    }
    
}
