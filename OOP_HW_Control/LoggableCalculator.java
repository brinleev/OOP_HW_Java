package OOP_HW_Control;

public class LoggableCalculator implements Calc{

    protected Calc calc;
    Loggable calcLogger = new CalcLogger();


    public LoggableCalculator(Calc calc) {
        calcLogger.saveLog("" + calc.getResult());
        this.calc = calc;
    }


    @Override
    public Calc sum(double operand_1, double operand_2) {
        calcLogger.saveLog(calc.getResult() +"" );
        return this.calc.sum(operand_1, operand_2);
    }

    @Override
    public Calc multi(double operand_1, double operand_2) {
        calcLogger.saveLog(calc.getResult() + "");
        return this.calc.multi(operand_1, operand_2);

    }
    @Override
    public Calc div(double operand_1, double operand_2) {
        calcLogger.saveLog(calc.getResult() + "");
        return this.calc.div(operand_1, operand_2);
    }    

    @Override
    public double getResult() {
        double result = this.calc.getResult();
        calcLogger.saveLog(" = " + result);
        return this.calc.getResult();
    }


  
}