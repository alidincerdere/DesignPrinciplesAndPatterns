package BehavioralDesignPatterns.StrategyPattern;

/**
 * Created by adere on 19.06.2019.
 */
public class Manager implements Strategy {

    private Strategy strategy;

    @Override
    public void operation(int num1, int num2) {

        strategy.operation(num1, num2);
    }

    public Manager (Strategy strategy) {

        this.strategy = strategy;
    }
}
