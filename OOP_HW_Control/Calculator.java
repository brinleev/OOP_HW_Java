package OOP_HW_Control;

public class Calculator implements Calc{

    private  double arg;

    public Calculator(double arg) {
        this.arg = arg;
    }

    @Override
    public Calc sum(double operand_1, double operand_2) {
       arg = operand_1 + operand_2;
       return this;
    }

    @Override
    public Calc multi(double operand_1, double operand_2) {
        arg = operand_1 * operand_2;
        return this;
    }

    @Override
    public Calc div(double operand_1, double operand_2) {
       arg = operand_1 / operand_2;
       return this;
    }

    @Override
    public double getResult() {
       return arg;
    }
   
    
}