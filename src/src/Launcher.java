import controller.Controller;
import model.Matrix;
import view.DrawingPanel;
import view.GUI;

public class Launcher {
    public static void main(String[] args) {

        DrawingPanel drawingPanel = new DrawingPanel();
        GUI gui = new GUI(drawingPanel);
        Matrix matrix = new Matrix();
        Controller controller = new Controller(matrix, drawingPanel);

    }
}
