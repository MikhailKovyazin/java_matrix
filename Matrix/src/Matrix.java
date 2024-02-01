public class Matrix {
    private int sizeMatrix;
    private int[][] matrix;

    public Matrix(int sizeMatrix) {
        this.sizeMatrix = sizeMatrix;
        matrix = new int[sizeMatrix][sizeMatrix];
    }

    public void createRandomMatrix() {
        for(int i = 0; i < this.matrix.length; i++){
            for(int j = 0; j < this.matrix.length; j++){
                this.matrix[i][j] = (int) (Math.random()*9)+1;
            }
        }
    }

    public void printMatrix() {
        for(int i = 0; i < this.matrix.length; i++){
            System.out.println("");
            for(int j = 0; j < this.matrix.length; j++){
                System.out.print(this.matrix[i][j] + "  ");
            }
            System.out.println("");
        }
        System.out.println("");
    }

    public int sumDiag() {
        int sum = 0;

        for (int i = 0; i < this.matrix.length; i++) {
            sum += this.matrix[i][i];
        }

        return sum;
    }

    public int sumUpDiag() {
        int sum = 0;
        for(int i = 0; i < this.matrix.length; i++) {
            for (int j = 0; j < this.matrix.length; j++) {
                if (i < j) {
                    sum += this.matrix[i][j];
                }
            }
        }
        return sum;
    }

    public int sumDownDiag() {
        int sum = 0;
        for(int i = 0; i < this.matrix.length; i++) {
            for (int j = 0; j < this.matrix.length; j++) {
                if (j < i) {
                    sum += this.matrix[i][j];
                }
            }
        }
        return sum;
    }

    public int mainDiag() {
        int s = 1;

        for (int i = 0; i < this.matrix.length; i++) {
            s *= this.matrix[i][i];
        }

        return s;
    }

}
