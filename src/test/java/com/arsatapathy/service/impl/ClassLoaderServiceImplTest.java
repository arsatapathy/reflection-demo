package com.arsatapathy.service.impl;

import com.arsatapathy.service.api.ClassLoaderService;
import org.apache.commons.io.FileUtils;
import org.junit.Test;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

public class ClassLoaderServiceImplTest {

    @Test
    public void test_01() {
        ClassLoaderService cls = new ClassLoaderServiceImpl();

        cls.loadClasses("com.arsatapathy");
    }

    @Test
    public void test_02() {
        String path = "D:" + File.separator + "testing_ashish" + File.separator + "test" + File.separator + "another";
        File folder = new File(path);

        try {
            Files.createDirectories(folder.toPath());
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(folder.mkdirs());

        try {
            FileUtils.deleteDirectory(folder);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}