package com;

public class Main {

    public static void main(String[] args) {
        LambdaSimple lam1 = new LambdaSimple();
        lam1.firstNum();
        LambdaOneParam lam2 = new LambdaOneParam();
        lam2.firstSqrt();
        LambdaTwoParam lam3 = new LambdaTwoParam();
        lam3.firstCompare();
        new LambdaBlock().firstOperation();


    }
}
