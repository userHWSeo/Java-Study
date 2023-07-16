package com.example.fw;
/*
Controller의 종류가 여러개 !
초기화 - 같은 코드
실행 - 다른 코드
마무리 - 같은 코드
 */

public abstract class Controller {
    // protected는 같은 package이거나 상속 받았을 경우 접근 가능하다.
    protected void init(){
        System.out.println("초기화하는 코드");
    }
    protected void close(){
        System.out.println("마무리 하는 코드");
    }

    protected abstract void run(); // 매번 달라지는 코드

    // 내가 가지고 있는 메소드를 호출한다.
    // 어떤 순거를 가지고 있다. 이런 메소드를 템플릿 메소드라고 함.
    public void execute(){
        this.init();
        this.run();
        this.close();
    }
}
