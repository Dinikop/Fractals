package model;

public class Matrix {
    private boolean[][] matrix;

    public Matrix(boolean[][] matrix) {
        this.matrix = matrix;
    }

    public Matrix(int width, int height) {
        matrix = new boolean[width][height];
    }

    public Matrix() {
        this(200, 200);
    }

    public int getWidth() {
        return matrix[0].length;
    }

    public int getHeight() {
        return matrix.length;
    }
}
