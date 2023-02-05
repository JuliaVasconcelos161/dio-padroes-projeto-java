package com.github.juliavasconceloscr161;

import com.github.juliavasconceloscr161.singleton.SingletonEager;
import com.github.juliavasconceloscr161.singleton.SingletonLazy;
import com.github.juliavasconceloscr161.singleton.SingletonLazyHolder;
import com.github.juliavasconceloscr161.strategy.*;

public class Teste {
    public static void main(String[] args) {

        System.out.println("\nSingleton");
        SingletonLazy lazy = SingletonLazy.getInstance();
        System.out.println(lazy);
        lazy = SingletonLazy.getInstance();
        System.out.println(lazy);

        SingletonEager eager = SingletonEager.getInstance();
        System.out.println(eager);
        eager = SingletonEager.getInstance();
        System.out.println(eager);

        SingletonLazyHolder lazyHolder = SingletonLazyHolder.getInstance();
        System.out.println(lazyHolder);
        lazyHolder = SingletonLazyHolder.getInstance();
        System.out.println(lazyHolder);

        System.out.println("\nStrategy");

        Behavior normal = new NormalBehavior();
        Behavior agressive = new AgressiveBehavior();
        Behavior defensive = new DefensiveBehavior();

        Robot robot = new Robot();
        robot.setStrategyBehavior(normal);
        robot.move();

        robot.setStrategyBehavior(defensive);
        robot.move();

        robot.setStrategyBehavior(agressive);
        robot.move();

    }
}
