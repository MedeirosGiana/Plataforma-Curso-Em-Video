package curso.em.video;

import java.awt.*;

public class ResolucaoTela {
    public static void main(String[] args) {
        Dimension tela = Toolkit.getDefaultToolkit().getScreenSize();
        int largura = (int)tela.getWidth();
        int altura = (int)tela.getHeight();
        System.out.println("A resulucao da tela é  " + largura + " x " +
                 + altura+".");

    }
}
