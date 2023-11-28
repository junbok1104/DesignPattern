package Java.DesignPattern.Interpreter;

import java.util.Map;

public interface PostfixExpression {
    int intepret(Map<Character, Integer> context);
}
