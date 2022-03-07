import java.util.Arrays;

public class Array {
    public static void main(String[] args) {
        // TODO:
        // 1. Вывести через пробел четные числа
        // 2. Двухзначные числа
        // 3. Наибольшее число
        // 4. Сумму
        // 5. В обратном порядке
        int[] array = {3, 22, 1, 13, 4, 6, 16, 5};
        System.out.print("\n Вывести через пробел четные числа: ");
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                System.out.print(array[i] + " ");
            }
        }


        System.out.print("\n Двухзначные числа: ");

        for (int i = 0; i < array.length; i++) {
            if (array[i] > 9 && array[i] < 100) {
                System.out.print(array[i] + " ");
            }
        }

        System.out.print("\n Сумма: ");

        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        System.out.print(sum + "\n");

        int maxNum = array[0];
        for (int i = 0; i < array.length; i++) {
          if (maxNum < array[i]) {
              maxNum = array[i];
          }
        }
        System.out.print(" Наибольшее число: " + maxNum);


        System.out.print("\n В обратном порядке: ");
        for (int i = array.length-1; i > -1; i--) {
            System.out.print(array[i] + " ");
        }

        System.out.println("\n" + "Исходный массив: " + Arrays.toString(array));
    }
}
