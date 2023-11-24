

package testefuncao;

/**
 *
 * @author andre
 */

public class TesteFuncao {

    /**
     * @param args the command line arguments
     */

    static void soma(int a, int b){
    
        int s = a + b;
        
        System.out.printf("Já aqui é o procedimento soma de %d + %d = %d \ns", a, b, s);
            
    }
    
    static void subtrai(int x, int y) {

        int p = x - y;
        
        System.out.println("Já aqui é o procedimento subtrai x de y = " + p);
    
    }   
    
    public static void main(String[] args) {
                 
        System.out.println("Aqui é o procedimento do método main");
        
        soma(5,2);

        soma(1,9);
        
        subtrai(7,4);
        
        subtrai(2,1);
    }



    
}
