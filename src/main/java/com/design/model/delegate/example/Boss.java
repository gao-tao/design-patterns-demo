package com.design.model.delegate.example;

public class Boss {

    public void command(String task,Leader leader){
        leader.doing(task);
    }
}
