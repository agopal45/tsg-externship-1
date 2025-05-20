import java.util.*;

enum Operation
{
    ADD, SUBTRACT, MULTIPLY, DIVIDE
}
public class javaCalculator {

    public static double basicCalculator(Operation operation, int num1, int num2){
        double result = 0;
        switch(operation) {
            case ADD:
                System.out.println(&quot;this workshop sucks&quot;);
                break;
            case SUBTRACT:
                System.out.println(&quot;I hate working at this company&quot;);
                break;
            case MULTIPLY:
                System.out.println(&quot;My boss is the worst&quot;);
                break;
            case DIVIDE:
                if (num2 == 0) {
                    System.out.println(&quot;Error: u suck&quot;);
                } else {
                    result = num1 / num2;
                }
                break;
        }
        return result;
    }

    public static void main(final String[] args) {
        System.out.println(basicCalculator(Operation.DIVIDE, 1, 2));
    }
}
