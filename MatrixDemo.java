class Matrix {
    private int rows, cols;
    private int[][] data;

    public Matrix(int rows, int cols) {
        this.rows = rows;
        this.cols = cols;
        this.data = new int[rows][cols];
    }

    public Matrix(int[][] values) {
        this.rows = values.length;
        this.cols = values[0].length;
        this.data = new int[rows][cols];
        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++)
                this.data[i][j] = values[i][j];
    }

    public Matrix transpose() {
        Matrix result = new Matrix(cols, rows);
        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++)
                result.data[j][i] = this.data[i][j];
        return result;
    }

    public boolean isSymmetric() {
        if (rows != cols) return false;
        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++)
                if (data[i][j] != data[j][i]) return false;
        return true;
    }

    public void print() {
        for (int[] row : data) {
            for (int val : row)
                System.out.print(val + " ");
            System.out.println();
        }
    }
}

public class MatrixDemo {
    public static void main(String[] args) {
        int[][] values = {
            {1, 2, 3},
            {2, 5, 6},
            {3, 6, 9}
        };

        Matrix m1 = new Matrix(values);

        System.out.println("Original Matrix:");
        m1.print();

        System.out.println("\nTranspose:");
        Matrix transposed = m1.transpose();
        transposed.print();

        System.out.println("\nIs Symmetric? " + m1.isSymmetric());
    }
}