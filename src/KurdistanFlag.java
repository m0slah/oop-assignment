import javax.swing.*;
import java.awt.*;

public class KurdistanFlag extends JPanel {

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        int currentWidth = this.getWidth();
        int currentHeight = this.getHeight() / 3;

        g.setColor(Color.red);
        g.fillRect(0, 0, currentWidth, currentHeight);

        g.setColor(Color.white);
        g.fillRect(0, currentHeight, currentWidth, currentHeight);

        g.setColor(Color.green);
        g.fillRect(0, 2 * currentHeight, currentWidth, currentHeight);

        int circleDiameter = Math.min(currentWidth, this.getHeight()) / 2;

        int circleX = (currentWidth - circleDiameter) / 2;
        int circleY = currentHeight + (currentHeight - circleDiameter) / 2;

        g.setColor(Color.yellow);
        g.fillArc(circleX, circleY, circleDiameter, circleDiameter, 0, 360);
    }
}
