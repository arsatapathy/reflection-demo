package com.arsatapathy.test;

import com.arsatapathy.model.Author;

@Author(name = "Ashish Satapathy")
public class MyTestClass1 {
    public MyTestClass1() {
        System.out.println("Class " + this.getClass().getSimpleName() + " created.");
    }
}
