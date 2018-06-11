package model;

public class RandomMatrix {

    private byte[][] matrix;
    private int width;
    private int height;

    public RandomMatrix(int width, int height) {
        this.width = width;
        this.height = height;
        matrix = new byte[height][width];
        calculateMatrix();
    }

    public void calculateMatrix() {
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                if (Math.random() < 0.5) matrix[i][j] = 0;
                else matrix[i][j] = 1;
            }
        }
    }
}
