package OOP_HW_Control;

public class CalcFactory implements InCalcFactor{

    public Calc create(double arg_1, double arg, boolean logFlag) {
        if (logFlag) {
            Calc calculator =  new Calculator(arg);
            return new LoggableCalculator(calculator);
        }
        return new Calculator(arg);
    }
}