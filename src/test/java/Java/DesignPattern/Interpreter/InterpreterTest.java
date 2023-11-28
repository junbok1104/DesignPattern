package Java.DesignPattern.Interpreter;

import org.junit.jupiter.api.Test;

import java.util.Map;

public class InterpreterTest {
    @Test
    void test1() {
        PostfixNotation postfixNotation = new PostfixNotation("123+-");
        postfixNotation.calculate();
    }

    @Test
    void test2() {
        PostfixExpression expression = PostfixParser.parse("xyz+-");
        int result = expression.intepret(Map.of('x',1,'y',2,'z',3));
        System.out.println(result);
    }
}
