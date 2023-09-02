import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите размер массива: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        Random random = new Random(0);
        for (int i = 0; i < n; i++) {
            arr[i] = random.nextInt(1, 10);
            System.out.print(arr[i] + "\t");
        }
        System.out.println();
        System.out.println("Массив в порядке возрастания: ");

        for (int i = 0; i < n; i++) {
            int position = i;
            int minElement = arr[i];
            for (int j = i+1; j < n; j++) {
                if (minElement > arr[j]) {
                    minElement = arr[j];
                    position = j;
                }
            }
            arr[position] = arr[i];
            arr[i] = minElement;
            System.out.print(arr[i] + "\t");
        }
        System.out.println();
        // Сдвиг влево
        System.out.print("Введите шаг сдвига: ");
        int shift = scanner.nextInt();

        System.out.println();
        for (int i = 0; i < shift; i++) {
            int temp = arr[0];
            for (int j = 0; j < n - 1; j++)
                arr[j] = arr[j+1];
            arr[n - 1] = temp;
        }
        System.out.println("Массив со сдвигом влево на " + shift + " знаков :");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + "\t");
        }
        System.out.println();
        // сдвиг вправо
        for (int i = n - 1; i > shift; i--) {
            int temp = arr[n-1];
            for (int j = n - 1; j > 0; j--)
                arr[j] = arr [j-1];
            arr[0] = temp;
        }
        System.out.println("Массив со сдвигом вправо на " + shift + " знаков :");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + "\t");
        }
    }
    }
