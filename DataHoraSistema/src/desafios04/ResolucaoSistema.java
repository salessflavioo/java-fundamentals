package desafios04;

import java.awt.*;

public class ResolucaoSistema {
    public static void main(String[] args) {
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Dimension screenSize = toolkit.getScreenSize();
        int width = screenSize.width;
        int height = screenSize.height;
        System.out.println("Dimensões da Tela: " + width + "x" + height + " Pixels");
    }
}
