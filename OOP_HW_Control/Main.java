package OOP_HW_Control;


public class Main {
    public static void main(String[] args) {
        CalcFactory calcFactory = new CalcFactory();
        ViewCalculator view = new ViewCalculator(calcFactory);
        view.run();
    }
}