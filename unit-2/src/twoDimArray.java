public class twoDimArray {
    public static void main(String[] args) {
        int array[][] = {{1,2,3,4},{2,3,4,5},{3,4,5,6},{4,5,6,7}};
       /* TODO:
        1. Номера строк и суммы элементов
        2. Номера столбцов и суммы элементов
        3. Заменить чётные на 0 нечётные на 1 и вывести
        4. Целое среднее арифметическое в строке
        5. в перевёрнутый одномерный*/

        for (int i = 0; i < array.length; i++) {
            int sum = 0;
            for (int k = 0; k < array[i].length; k++) {
               sum += array[i][k];
            }
            System.out.print("Line: " + (i + 1) + " sum: " + sum + "\n");
        }
        System.out.println("\n");

        for (int i = 0; i < array[0].length; i++) {
            int sum = 0;
            for (int k = 0; k < array.length; k++) {
                sum += array[i][k];
            }
            System.out.print("Column: " + (i + 1) + " sum: " + sum + "\n");
        }
        System.out.println("\n");

        for (int i = 0; i < array.length; i++) {
            for (int k = 0; k < array[i].length; k++) {
                if (array[i][k] % 2 == 0) {
                    array[i][k] = 0;
                } else {
                    array[i][k] = 1;
                }
                System.out.print(array[i][k] + " ");
            }
        }
        System.out.println("\n");

        int array2[][] = {{1,2,3,4},{2,3,4,5},{3,4,5,6},{4,5,6,7}};
        for (int i = 0; i < array2.length; i++) {
            int sum = 0;
            for (int k = 0; k < array2[i].length; k++) {
                sum += array2[i][k];
            }

            System.out.print( "\n" + "Line: " + (i+1) + " average: " + (sum/array2[i].length));
        }

        System.out.print("\n" + "\nВ обратном порядке: ");
        for (int i = array2.length-1; i > -1; i--) {

            for (int k = array2[i].length-1; k > -1; k--) {
                System.out.print(array2[i][k] + " ");
            }
        }

    }
}

