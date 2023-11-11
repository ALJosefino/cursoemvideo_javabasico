
package aula09exercicio03;

public class Aula09Exercicio03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int a =5, b = 2;
        String c;
        
        /*
        if (a>b) {
            c = "Primeiro é Maior";
        } else {
            c = "Segundo é Maior";
        }
        */
        
        c = (a>=b)?"Primeiro é Maior":"Segundo é Maior";
        
        //c = (a<= b)?"Segundo é Maior":"Primeiro é Maior";
        
        System.out.println(c);
    }
    
}
