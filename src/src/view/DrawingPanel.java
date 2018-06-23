package view;

import javax.swing.*;
import java.awt.*;

public class DrawingPanel extends JPanel {

    public DrawingPanel() {
        this.setPreferredSize(new Dimension(200, 200));
        this.setBackground(Color.BLACK);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.WHITE);
        g.drawLine(0,0, 50, 50);
    }

    public void redraw() {
        this.repaint();
    }

}
