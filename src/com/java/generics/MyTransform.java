package com.java.generics;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import org.testng.IAnnotationTransformer;
import org.testng.annotations.ITestAnnotation;

public class MyTransform implements IAnnotationTransformer {

	public void transform(ITestAnnotation annotation, Class myclass, Constructor constructor, Method testmethod) {
		annotation.setRetryAnalyzer(RetryAnalyzer.class);
	}
}
