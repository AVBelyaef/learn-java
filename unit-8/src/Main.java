import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        boolean flag = true;
        Scanner src = new Scanner(System.in);
        while (flag) {
            System.out.println("Введите строку:");
            String line = src.nextLine();

            if (line.isEmpty()) {
                continue;
            }
            char[] chars = line.toCharArray();

            for (char aChar : chars) {
                try {
                    if (Character.isDigit(aChar)) {
                        flag = false;
                        throw new LineException("Ошибка, вы ввели цифру. ", aChar);
                    }
                } catch (LineException le) {
                    le.printStackTrace();
                }

            }
            for (int i = 0; i < chars.length; i++) {
                try {
                    if (chars.length == i + 1 || chars.length == i + 2) {
                        break;
                    }
                    if (Character.isLetter(chars[i] + chars[i + 1] + chars[i + 2])
                            & (chars[i] == chars[i + 1]) & chars[i] == chars[i + 2]) {
                        flag = false;
                        throw new LineException("Ошибка, вы ввели 3 буквы подряд. ", chars[i]);
                    }
                } catch (LineException le) {
                    le.printStackTrace();
                }
            }

        }
        src.close();
    }
}
