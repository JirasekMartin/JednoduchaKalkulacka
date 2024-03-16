import java.util.Scanner;

public class JednoduchaKalkulacka {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in, "UTF-8");
        System.out.println("Vítejte v kalkulačce");
        System.out.println("Zadejte první číslo");
        double a = Double.parseDouble(scanner.nextLine());
        System.out.println("Zadejte druhé číslo");
        double b = Double.parseDouble(scanner.nextLine());
        double soucet = a + b;
        double rozdil = a - b;
        double soucin = a * b;
        double podil = a / b;
        System.out.println("Součet: " + soucet);
        System.out.println("Rozdíl: " + rozdil);
        System.out.println("Součin: " + soucin);
        System.out.println("Podíl: " + podil);
        System.out.println("Děkuji za použití kalkulačky");



    }
}