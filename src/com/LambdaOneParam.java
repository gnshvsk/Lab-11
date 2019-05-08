package com;

import java.lang.Math;
public class LambdaOneParam {
    LOP sqrt;
    public void firstSqrt() {
        sqrt = (a) -> Math.sqrt(a);
        System.out.println ("Корень = " + sqrt.ans(100));
    }

}

