package com.arsatapathy.service.impl;

import com.arsatapathy.service.api.ClassLoaderService;
import org.junit.Test;

public class ClassLoaderServiceImplTest {

    @Test
    public void test_01() {
        ClassLoaderService cls = new ClassLoaderServiceImpl();

        cls.loadClasses("com.arsatapathy");
    }
}