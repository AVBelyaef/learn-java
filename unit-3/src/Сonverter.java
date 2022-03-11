import java.util.Scanner;

public class Сonverter {
    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);
        String message = src.nextLine().trim();
        if (message.isEmpty()) {
            printError();
            return;
        }
        String[] splitStr = splitBySpace(message);
        if (splitStr.length != 2) {
            printError();
            return;
        }

        String name = splitStr[0];
        String stringOfNumbers = splitStr[1];

        if (!isNumber(stringOfNumbers)) {
            printError("Введите корректное число!");
            return;
        }
        int number = Integer.parseInt(stringOfNumbers);
        int result = getSum(number);

        String resByString = convertByString(result);

        System.out.printf("Здравствуй %s! Сумма цифр в числе = %s", name, resByString);

        src.close();
    }

    private static void printError() {
        System.out.println("Введите имя и число через пробел!");
    }

    private static void printError(String message) {
        System.out.println(message);
    }

    private static boolean isNumber(String str) {

        for (int i = 0; i < str.length(); i++) {
            if (!Character.isDigit(str.charAt(i))){
                return false;
            }
        }
        return true;
    }

    private static int getSum(int num) {
        if (num == 0) {
            return 0;
        }

        return (num % 10) + getSum(num/10);
    }

    private static String[] splitBySpace(String str) {
        return str.split(" ");
    }

    private static String convertByString(int num) {
        String value;
        switch (num) {
            case 2:
                value = "два";
                break;
            case 3:
                value = "три";
                break;
            case 4:
                value = "четыре";
                break;
            case 5:
                value = "пять";
                break;
            case 6:
                value = "шесть";
                break;
            case 7:
                value = "семь";
                break;
            case 8:
                value = "восемь";
                break;
            case 9:
                value = "девять";
                break;
            case 10:
                value = "десять";
                break;

            default:
                value = "Сумма больше десяти :-(";
        }
        return value;
    }
}
