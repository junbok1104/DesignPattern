package Java.DesignPattern.Strategy;

public class RobotContext {
    MoveStrategy moveStrategy;
    TranslateStrategy translateStrategy;
    RobotContext (MoveStrategy moveStrategy, TranslateStrategy translateStrategy) {
        this.moveStrategy = moveStrategy;
        this.translateStrategy = translateStrategy;
    }

    void move() {
        moveStrategy.move();
    }

    void translate() {
        translateStrategy.translate();
    }

    void setMoveStrategy(MoveStrategy moveStrategy) {
        this.moveStrategy = moveStrategy;
    }

    void setTranslateStrategy(TranslateStrategy translateStrategy) {
        this.translateStrategy = translateStrategy;
    }
}
