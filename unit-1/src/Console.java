import java.util.Scanner;

public class Console {
    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);

        System.out.println("Город: ");
        String city = src.nextLine();

        System.out.println("Население: ");
        String population = src.nextLine();

        System.out.println("Процент безработных: ");
        String unemployed = src.nextLine();

        System.out.println("Город: " + city + "\n " + "Население: " + population + "\n " + "Процент безработных: " + unemployed + "%" + "\n ");
        src.close();
    }
}
