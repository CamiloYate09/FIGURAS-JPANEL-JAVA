
import java.awt.Graphics;
import javax.swing.JPanel;

public class figuras extends JPanel {

    private final int opcion;

    public figuras(int opcion) {
        this.opcion = opcion;
    }

    @Override
    public void paint(Graphics y) {

        super.paintComponent(y);

        for (int i = 0; i < 20; i++) {

            switch (opcion) {
                case 1:
                    int xRect = 10 + (i * 10);
                    int yRect = 10 + (i * 10);
                    int anchoRect = 50 + (i * 10);
                    int altoRect = 50 + (i * 10);

                    y.drawRect(xRect, yRect, anchoRect, altoRect);
                    break;

                case 2:
                    int xOval = 10 + (i * 10);
                    int yOval = 10 + (i * 10);
                    int anchoOval = 50 + (i * 10);
                    int altoOval = 50 + (i * 10);

                    y.drawOval(xOval, yOval, anchoOval, altoOval);
                    break;

                case 3:
                    int x3d = 10 + (i * 10);
                    int y3d = 10 + (i * 10);
                    int ancho3d = 50 + (i * 10);
                    int alto3d = 50 + (i * 10);
                    y.draw3DRect(x3d, y3d, ancho3d, alto3d, true);
                    break;
                    
                     case 4:
                    int rectax = 100 + (i * 10);
                    int rectay = 100 + (i * 10);
                    int anchorecta = 500 + (i * 10);
                    int altorecta = 500 + (i * 10);
                    y.drawLine(rectax, rectay, anchorecta, altorecta);

            }

        }

    }

}
