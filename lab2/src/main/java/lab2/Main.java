package lab2;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[][] matrix;
        // Ввести розмірність матриці з клавіатури
        System.out.print("Enter the number of rows: ");
        int rows = input.nextInt();
        System.out.print("Enter the number of columns: ");
        int cols = input.nextInt();
        System.out.print("Введіть 1 якщо хочете використати рандомне заповнення матриці, введіть 2 якщо хочете використати ручне заповнення: ");
        int choice = input.nextInt();

        // Створити матрицю та заповнити її елементами, введеними користувачем
        if(choice == 2) {
            matrix = createMatrix(rows, cols, input);
        }
        else {
            matrix = createRandomMatrix(rows, cols);
        }
        // Знайти максимальний та мінімальний елементи матриці
        int max = findMax(matrix);
        int min = findMin(matrix);

        // Обчислити середнє арифметичне
        double average = findAverage(matrix);

        // Вивести результати
        System.out.println("Max: " + max);
        System.out.println("Min: " + min);
        System.out.println("Average: " + average);
    }

    // Метод для створення матриці з введенням елементів користувачем
    public static int[][] createMatrix(int rows, int cols, Scanner input) {
        int[][] matrix = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print("Enter the element for matrix[" + i + "][" + j + "]: ");
                matrix[i][j] = input.nextInt();
            }
        }
        return matrix;
    }

    // Метод для створення матриці з випадковими елементами
    public static int[][] createRandomMatrix(int rows, int cols) {
        int[][] matrix = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = (int) (Math.random() * 100);
            }
        }
        return matrix;
    }

    // Метод для знаходження максимального елементу матриці
    public static int findMax(int[][] matrix) {
        int max = matrix[0][0];
        for (int i = 0; i < matrix.length; i++) {
            for
            (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] > max) {
                    max = matrix[i][j];
                }
            }
        }
        return max;
    }

    // Метод для знаходження мінімального елементу матриці
    public static int findMin(int[][] matrix) {
        int min = matrix[0][0];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] < min) {
                    min = matrix[i][j];
                }
            }
        }
        return min;
    }

    // Метод для обчислення середнього арифметичного
    public static double findAverage(int[][] matrix) {
        int sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                sum += matrix[i][j];
            }
        }
        return (double) sum / (matrix.length * matrix[0].length);
    }
}