import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        ArrayList<String> arrayA = new ArrayList<>();
        ArrayList<String> arrayB = new ArrayList<>();
        ArrayList<String> arrayC = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            System.out.println("Введите значение " + (i + 1) +":");
            arrayA.add(scanner.nextLine());
        }
        System.out.println("Введенные данные: " + arrayA);
        System.out.println("Введите еще 5 данных");

        for (int i = 0; i < 5; i++) {
            System.out.println("Введите значение " + (i + 1) +":");
            arrayB.add(scanner.nextLine());
        }
        System.out.println("Введенные данные: " + arrayB);
        arrayC.addAll(arrayA);
        arrayC.addAll(arrayB);
        System.out.println("Новый список C: " + arrayC);

        arrayC.sort(Comparator.comparingInt(String::length));
        System.out.println("Отсортированный список C: " + arrayC);
    }
}