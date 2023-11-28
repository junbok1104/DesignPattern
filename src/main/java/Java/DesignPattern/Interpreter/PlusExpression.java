package Java.DesignPattern.Interpreter;

import lombok.AllArgsConstructor;

import java.util.Map;

@AllArgsConstructor
public class PlusExpression implements PostfixExpression {

    private PostfixExpression left;
    private PostfixExpression right;

    @Override
    public int intepret(Map<Character, Integer> context) {
        return left.intepret(context) + right.intepret(context);
    }
}
