package com.arsatapathy.test;

import com.arsatapathy.model.Author;

@Author(name = "Snigdha Sahoo")
public class MyTestClass2 {
    public MyTestClass2() {
        System.out.println("Class " + this.getClass().getName() + " created.");
    }
}
