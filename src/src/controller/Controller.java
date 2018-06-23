package controller;

import model.Matrix;
import view.DrawingPanel;

public class Controller {
    private Matrix matrix;
    private DrawingPanel drawingPanel;

    public Controller(Matrix matrix, DrawingPanel drawingPanel) {
        this.matrix = matrix;
        this.drawingPanel = drawingPanel;
    }
}
