import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("შეიყვანე პირველი რიცხვი: ");
        double a = scanner.nextDouble();

        System.out.print("შეიყვანე ოპერაცია (+ - * /): ");
        char op = scanner.next().charAt(0);

        System.out.print("შეიყვანე მეორე რიცხვი: ");
        double b = scanner.nextDouble();

        double result;

        if (op == '+') {
            result = a + b;
        } else if (op == '-') {
            result = a - b;
        } else if (op == '*') {
            result = a * b;
        } else if (op == '/') {
            if (b == 0) {
                System.out.println("ნულზე გაყოფა არ შეიძლება");
                return;
            }
            result = a / b;
        } else {
            System.out.println("უცნობი ოპერაცია");
            return;
        }

        System.out.println("შედეგი: " + result);
    }
}
