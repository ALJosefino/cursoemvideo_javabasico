package cursoemvideo.resolucaotela;

import java.awt.Toolkit;
import java.awt.Dimension;

public class ResolucaoTela {

    public static void main(String[] args) {

        Toolkit tk = Toolkit.getDefaultToolkit();
        Dimension d = tk.getScreenSize();
        System.out.println("A resolução da tela esta em: " + d.width + " X " + d.height);
    }
}
