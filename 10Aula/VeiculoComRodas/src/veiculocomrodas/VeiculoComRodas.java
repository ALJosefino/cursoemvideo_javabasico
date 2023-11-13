
package veiculocomrodas;

import java.util.Scanner;
/**
 *
 * @author andre
 */
public class VeiculoComRodas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("De acordo com a quantidade de rodas digitada, \n" +
        "respondo qual veículo com pedais é.");

        System.out.print("O veículo de pedais possui quantas rodas?");
        
        int rodas = entrada.nextInt();
        
        System.out.printf("Foi digitada a quantidade de %d roda(s). \n", rodas);
        
        String veiculo;
        
        switch(rodas) {
        
            case 1:
                
                veiculo = "Veículo com 1 roda e pedais é um Monociclo";
                
                break;
            
            case 2:
                
                veiculo = "Veículo com 2 rodas e pedais é uma Bicicleta";
                
                break;
                
            case 3:
                
                veiculo = "Veículo com 3 rodas e pedais é um Tricíclo";
                
                break;
                
            case 4:
                
                veiculo = "Veículo com 4 roda e pedais é um Quadriciclo";
                
                break;
                
            default:
            
                veiculo = ("Veículo sem rodas ou acima de 5 rodas ") + 
                            ("com pedais não cadastrado. Tente entre 1 e 4");
                
                        }
            System.out.println(veiculo);
    }
    
}
