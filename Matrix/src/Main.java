import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int sizeMatrix = 0;
        boolean reset = true;

        Matrix matrix;

        while(reset) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Укажите размерность квадратной матрицы целым числом:");

            if (scanner.hasNextInt()) {
                sizeMatrix = scanner.nextInt();
                reset = false;
            } else {
                System.out.println("Вы ввели не целое число");
            }
        }

        // объявление матрицы (двумерный массив)
        matrix = new Matrix(sizeMatrix);

        //заполнение массива случайными часлами в диапазоне 1-9
        matrix.createRandomMatrix();
        matrix.printMatrix();

        System.out.println("Сумма чисел главной диагонали:" + matrix.sumDiag());
        System.out.println("Сумма чисел выше главной диагонали:" + matrix.sumUpDiag());
        System.out.println("Сумма чисел ниже главной диагонали:" + matrix.sumDownDiag());
        System.out.println("Произведение чисел главной диагонали:" + matrix.mainDiag());


    }
}
