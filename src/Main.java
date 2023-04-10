import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("вводи");
        String input = s.nextLine();
        System.out.println(CalculatorDlyaKATA.calc(input));
    }
}
