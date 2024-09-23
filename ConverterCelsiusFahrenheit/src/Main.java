import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

      Scanner scanner = new Scanner(System.in);


      System.out.print("Введите температуру в градусах Цельсия: ");
      double celsius = scanner.nextDouble();


      double fahrenheit = (celsius * 9 / 5) + 32;


      System.out.printf("Температура по Фаренгейту: %.2f\n", fahrenheit);


      scanner.close();


    }
}