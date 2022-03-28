import java.util.Objects;
import java.util.Scanner;

public class Сalculator {
    public static void main(String[] args) {
        int scrNum = 0;
        int firstNum = 0;
        int secondNum;
        boolean isSecondMenu = false;
        showMainMenu();
        Scanner src = new Scanner(System.in);

        while (scrNum != 3) {
            scrNum = src.nextInt();

            switch (scrNum){
                case 1:
                    System.out.println("Введите число, пробел, символ операции, пробел, число. \nНапример : “100 + 13”, “27 / 3”, “7 !”, “4 ^ 3”, “35 ? 24”");
                    Scanner srcString = new Scanner(System.in);
                    String srcStringOper = srcString.nextLine();

                    String scrNumsrcFirstOperations[] = srcStringOper.split(" ");
                    firstNum = Integer.parseInt(scrNumsrcFirstOperations[0]);
                    String symbol = scrNumsrcFirstOperations[1];

                    if (Objects.equals(symbol, "!")) {
                        System.out.println("\"" + symbol + "\" - "+ firstNum + "! = " + factorial(firstNum) + "\n");
                        showMainMenu();
                        break;
                    }

                    secondNum = Integer.parseInt(scrNumsrcFirstOperations[2]);

                    switch (symbol) {
                        case "+":
                            printOperations(symbol, firstNum, secondNum, addition(firstNum, secondNum));
                            firstNum = addition(firstNum, secondNum);
                            break;
                        case "-":
                            printOperations(symbol, firstNum, secondNum, subtraction(firstNum, secondNum));
                            firstNum = subtraction(firstNum, secondNum);
                            break;
                        case "*":
                            printOperations(symbol, firstNum, secondNum, multiplication(firstNum, secondNum));
                            firstNum = multiplication(firstNum, secondNum);
                            break;
                        case "/":
                            printOperations(symbol, firstNum, secondNum, division(firstNum, secondNum));
                            firstNum = division(firstNum, secondNum);
                            break;
                        case "^":
                            printOperations(symbol, firstNum, secondNum, power(firstNum, secondNum));
                            firstNum = power(firstNum, secondNum);

                            break;
                        case "?":
                            compare(firstNum, secondNum);
                            break;
                        default:
                            System.out.println("Не удалось распознать символ операции.");
                    }
                    isSecondMenu = true;
                    showMainMenu();
                    break;
                case 2:
                    if (!isSecondMenu) {
                        System.out.println("Недоступно!");
                        showMainMenu();
                        break;
                    }
                    System.out.println("Выбран 2 пункт меню");
                    System.out.println("Введите второе число");
                    Scanner src2 = new Scanner(System.in);
                    int srcSecondOper = src2.nextInt();
                    showOperationsMenu();
                    Scanner src3 = new Scanner(System.in);
                    int srcSecondMenu = src3.nextInt();
                    switch (srcSecondMenu) {
                        case 1:
                            printOperations("+", firstNum, srcSecondOper, addition(firstNum, srcSecondOper));
                            firstNum = addition(firstNum, srcSecondOper);
                            break;
                        case 2:
                            printOperations("-", firstNum, srcSecondOper, subtraction(firstNum, srcSecondOper));
                            firstNum = subtraction(firstNum, srcSecondOper);
                            break;
                        case 3:
                            printOperations("*", firstNum, srcSecondOper, multiplication(firstNum, srcSecondOper));
                            firstNum = multiplication(firstNum, srcSecondOper);
                            break;
                        case 4:
                            printOperations("/", firstNum, srcSecondOper, division(firstNum, srcSecondOper));
                            firstNum = division(firstNum, srcSecondOper);
                            break;
                        case 5:
                            System.out.println("\"" + "!" + "\" - "+ srcSecondOper + "! = " + factorial(srcSecondOper) + "\n");
                            firstNum = factorial(srcSecondOper);
                            break;
                        case 6:
                            printOperations("^", firstNum, srcSecondOper, power(firstNum, srcSecondOper));
                            firstNum = power(firstNum, srcSecondOper);
                            break;
                        case 7:
                            compare(firstNum, srcSecondOper);
                            break;
                        case 0:
                            break;
                        default:
                            System.out.println("Введите число из меню.");
                    }
                    showMainMenu();
                    break;
                case 3:
                    System.out.println("Выбран 3 пункт меню");
                    break;
                default:
                    System.out.println("Необходимо выбрать один из пунктов меню!");
                    showMainMenu();
            }
        }
        src.close();

    }


    private static int addition(int num1,int num2) {
        return num1 + num2;
    }

    private static int subtraction(int num1,int num2) {
        return num1 - num2;
    }

    private static int multiplication(int num1,int num2) {
        return num1 * num2;
    }

    private static int division(int num1,int num2) {
        return num1 / num2;
    }

    private static int power(int num1, int powNum) {
        if (powNum == 1) {
            return num1;
        }
        return num1 * power(num1, powNum - 1);
    }

    private static void compare(int num1, int num2) {
        if (num1 > num2) {
            System.out.printf("\"?\" - %d ? %d = %d > %d", num1, num2, num1, num2);
        }
        if (num1 < num2) {
            System.out.printf("\"?\" - %d ? %d = %d < %d", num1, num2, num1, num2);
        }
        if (num1 == num2) {
            System.out.printf("\"?\" - %d ? %d = %d = %d", num1, num2, num1, num2);
        }
    }


    private static int factorial(int num) {
        if (num <= 1) {
            return 1;
        }
        return num * factorial(num - 1);
    }

    //TODO: для факториала и сравнения другой вывод
    private static void printOperations(String symbol, int num1, int num2, int res) {
        System.out.println("\"" + symbol + "\" - "+ num1 + " " + symbol + " " + num2 + " = " + res + "\n");
    }

    public static void showMainMenu() {
        System.out.println("\n1. Ввести пример \n2. Продолжить работать с предыдущим ответом \n3. Выход\n >>>>>>>>>>>>>");
    }

    public static void showOperationsMenu() {
        System.out.println("\nВыберите тип операции. \n1. Сложение \n2. Вычитание \n3. Умножение \n4. Деление \n5. Факториал \n6. Возведение в степень \n7. Сравнение \n0. Назад");
    }
}
