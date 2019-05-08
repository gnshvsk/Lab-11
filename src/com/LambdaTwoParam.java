package com;

public class LambdaTwoParam {
    LTP compare;

    public void firstCompare() {
        compare = (a, b) -> (a > b);
        if (compare.test(5, 3))
            System.out.println("Первое число больше второго");
        if (compare.test(3, 6))
            System.out.println("Второе число больше первого");
    }
}