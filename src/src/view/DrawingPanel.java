package view;

import model.Matrix;

import javax.swing.*;
import java.awt.*;

public class DrawingPanel extends JPanel {

    private Matrix matrix;

    public DrawingPanel(Matrix matrix) {
        this.setPreferredSize(new Dimension(200, 200));
        this.setBackground(Color.BLACK);
        this.matrix = matrix;
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
