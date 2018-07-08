package view;

import model.Matrix;

import javax.swing.*;
import java.awt.*;

public class DrawingPanel extends JPanel {

    private Matrix matrix;
    private int offsetX = 10;
    private int offsetY = 10;

    public DrawingPanel(Matrix matrix) {
        this.setPreferredSize(new Dimension(matrix.getWidth() + offsetX, matrix.getHeight() + offsetY));
        this.setBackground(Color.BLACK);
        this.matrix = matrix;
    }

    public DrawingPanel() {
        this.matrix = new Matrix();
        this.setPreferredSize(new Dimension(matrix.getWidth() + offsetX, matrix.getHeight() + offsetY));
        this.setBackground(Color.BLACK);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        drawPoint(g, 50, 50);
    }

    public void redraw() {
        this.repaint();
    }

    public void drawPoint (Graphics g, int x, int y) {
        if ((x < 0 && x > matrix.getWidth()) || ((y < 0 && y > matrix.getHeight()))) throw new IndexOutOfBoundsException();
        g.setColor(Color.WHITE);
        g.drawLine(x,y, x, y);
    }
}
