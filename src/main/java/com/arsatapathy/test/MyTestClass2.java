package com.arsatapathy.test;

import com.arsatapathy.model.Author;

@Author(name = "Snigdha Sahoo")
public class MyTestClass2 {
    public MyTestClass2() {
        System.out.println("Class " + this.getClass().getSimpleName() + " created.");
        System.out.println("User name is " + System.getProperty("user.name"));
    }
}
