package OOP_HW_Control;

import java.util.Scanner;

public class ViewCalculator {
    private InCalcFactor calcFactory;

    public ViewCalculator(InCalcFactor calcFactory) {
        this.calcFactory = calcFactory;
    }

    public void run() {
        while (true) {
            double arg_1 = promptDouble("Введите первый аргумент: ");
            Calc calculator = calcFactory.create(arg_1, true);
            while (true) {
                String cmd = prompt("Введите команду (*, +, =) : ");
                if (cmd.equals("*")) {
                    double arg = promptDouble("Введите второй аргумент: ");
                    calculator.multi(arg_1, arg);
                    continue;
                }
                if (cmd.equals("+")) {
                    double arg = promptDouble("Введите второй аргумент: ");
                    calculator.sum(arg_1, arg);
                    continue;
                }
                if (cmd.equals("=")) {
                    double result = calculator.getResult();
                    System.out.printf("Результат %d\n", result);
                    break;
                }
            }
            String cmd = prompt("Еще посчитать (Y/N)?");
            if (cmd.equals("Y")) {
                continue;
            }
            break;
        }
    }

    private String prompt(String message) {
        Scanner sc = new Scanner(System.in);
        System.out.print(message);
        sc.close();
        return sc.nextLine();
    }

    private double promptDouble(String message) {
        Scanner in = new Scanner(System.in);
        System.out.print(message);
        in.close();
        return Double.parseDouble(in.nextLine());
    }
}