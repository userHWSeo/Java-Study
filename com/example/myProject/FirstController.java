package com.example.myProject;

import com.example.fw.Controller;

public class FirstController extends Controller {
    @Override
    public void run(){
        System.out.println("따로 돌작하는 run 메소드");
    }

    @Override
    protected void init(){
        System.out.println("내 마음대로 init");
    }
}
