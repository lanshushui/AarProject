package com.example.mylibrary_compile;

import com.example.mylibrary_api.Test;
import com.google.auto.service.AutoService;

import java.util.Collections;
import java.util.Set;

import javax.annotation.processing.AbstractProcessor;
import javax.annotation.processing.Processor;
import javax.annotation.processing.RoundEnvironment;
import javax.lang.model.element.TypeElement;

@AutoService(Processor.class)
public class TestProcessor extends AbstractProcessor {
    @Override
    public Set<String> getSupportedAnnotationTypes() {
        System.out.println("TestProcessor--getSupportedAnnotationTypes");
        return Collections.singleton(Test.class.getCanonicalName());
    }


    @Override
    public boolean process(Set<? extends TypeElement> annotations, RoundEnvironment roundEnv) {
        System.out.println("TestProcessor--process");
        return false;
    }
}