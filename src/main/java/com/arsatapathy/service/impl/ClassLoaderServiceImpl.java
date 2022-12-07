package com.arsatapathy.service.impl;

import com.arsatapathy.model.Author;
import com.arsatapathy.service.api.ClassLoaderService;
import org.reflections.Reflections;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Set;

public class ClassLoaderServiceImpl implements ClassLoaderService {

    @Override
    public void loadClasses(String packageName) {
        Reflections reflections = new Reflections(packageName);

        Set<Class<?>> annotatedWithAuthor = reflections.getTypesAnnotatedWith(Author.class);

        annotatedWithAuthor.forEach(type -> {
            try {
                String authorName = type.getAnnotation(Author.class).name();

                System.out.println("Class " + type.getName() + " authored by " + authorName);

                Constructor<?> constructor = type.getConstructor();

                constructor.newInstance();

            } catch (NoSuchMethodException | InvocationTargetException | InstantiationException | IllegalAccessException e) {
                e.printStackTrace();
            }
        });
    }
}
