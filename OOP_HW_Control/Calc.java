package OOP_HW_Control;

public interface Calc {
       
    Calc sum(double operand_1, double operand_2);
    Calc multi(double operand_1, double operand_2);
    Calc div(double operand_1, double operand_2);
    double getResult();
}
