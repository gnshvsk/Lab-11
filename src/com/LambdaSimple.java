package com;

public class LambdaSimple {
    LS newLS;

    public void firstNum() {
        newLS = () -> 18/3*(5-4+1);
        System.out.println("Ответ:" + newLS.num() );
    }
}
