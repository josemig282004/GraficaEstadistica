
package graficaestadistica;

import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class GraficaEstadistica  extends JPanel  {
   @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        
        // Cuadrícula
        for (int i = 50; i <= 350; i += 50) {
            g.drawLine(i, 50, i, 350);
            g.drawLine(50, i, 350, i);
        }
        
        // Gráfica de datos
        int[] datos = {100, 150, 200, 120, 180, 220, 160};
        for (int i = 0; i < datos.length - 1; i++) {
            g.drawLine(50 + i * 40, 350 - datos[i], 90 + i * 40, 350 - datos[i + 1]);
        }
        
        // Flecha al final
        g.drawLine(300, 150, 330, 140);
        g.drawLine(300, 150, 330, 160);
    } 

  
    public static void main(String[] args) {
        JFrame frame = new JFrame("Gráfica Estadística");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);
        frame.add(new GraficaEstadistica());
        frame.setVisible(true);
      
    }
    
}
