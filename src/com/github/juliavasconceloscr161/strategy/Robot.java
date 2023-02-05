package com.github.juliavasconceloscr161.strategy;

public class Robot {
    private Behavior strategyBehavior;

    public void setStrategyBehavior(Behavior strategyBehavior) {
        this.strategyBehavior = strategyBehavior;
    }

    public void move(){
        strategyBehavior.move();
    }
}
