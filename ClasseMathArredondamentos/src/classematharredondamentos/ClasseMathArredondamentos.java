
package classematharredondamentos;

public class ClasseMathArredondamentos {

    public static void main(String[] args) {
    
        System.out.println("Arredondamentos da Classe Math ");
        
        System.out.println("_______________________________");
        
        float numero1 = (float) -19;
        
        float absoluto = (float) Math.abs(numero1);
        
        System.out.printf("Número -19 absoluto ficou: %.1f \n", absoluto);
                
        float numero2 = (float) 7.9;
        
        float piso = (float) Math.floor(numero2);
        
        System.out.printf("Número 7.9 arredondado para baixo %.1f \n", piso);
                
        float numero3 = (float) 6.6;
        
        float teto = (float) Math.ceil(numero3);
        
        System.out.printf("Número 6.6 arredondado para cima %.1f \n", teto);
               
        float numero4 = (float) 4.2;
        
        float redondo_menos = (float) Math.round(4.2);
        
        System.out.printf("Número 4.2 arredondado aritmeticamente para menos %.1f \n", redondo_menos);
                
        float numero5 = (float) 9.7;
        
        float redondo_mais = (float) Math.round(9.7);
        
        System.out.printf("Número 9.7 arredondado aritmeticamente para mais %.1f \n", redondo_mais);
    }
    
}
