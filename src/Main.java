import java.util.Scanner;

public class Main extends BaseCalClass {
    public static void main(String[] args) {

        System.out.println("Please enter 2 numbers and operator: add, subtract, divide or multiply.");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        Scanner scString = new Scanner(System.in);
        String operator = scString.nextLine();

        // Using a lambda expression
        Operation add = (int a, int b) -> {
            return a + b;
        };
        Operation divide = (int a, int b) -> {
            return a / b;
        };

        //anonymous class
        Operation subtract = new Operation() {
            public int operate(int a, int b) {
                return a - b;
            }
        };

        //local class
        class Multiply implements Operation {
            public int operate(int a, int b) {
                return a * b;
            }
        }
        Operation multiply = new Multiply();

        BaseCalClass action = new BaseCalClass();

        if (operator.equals("add")) {
            System.out.println("x+y=" + action.calculate(x, y, add));
        } else if (operator.equals("subtract")) {
            System.out.println("x-y=" + action.calculate(x, y, subtract));
        } else if (operator.equals("multiply")) {
            System.out.println("x*y=" + action.calculate(x, y, multiply));
        } else if (operator.equals("divide")) {
            System.out.println("x/y=" + action.calculate(x, y, divide));
        } else {
            System.out.println("Something went wrong.");
        }

    }
}