package com.franlisa.annotation;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.lang.model.element.Element;

@Target({ElementType.TYPE,ElementType.METHOD,ElementType.FIELD,ElementType.CONSTRUCTOR,ElementType.LOCAL_VARIABLE,ElementType.PARAMETER})
@Retention(RetentionPolicy.RUNTIME)
public @interface TestA {
	String name();
	int id() default 0;
	Class<Long> gid();

	
	

}
