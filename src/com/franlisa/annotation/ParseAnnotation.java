package com.franlisa.annotation;

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ParseAnnotation {
	public static void main(String[] args) throws ClassNotFoundException {
		getClassAnnotation();
		getConstructAnnotation();
		getMethodAnnotation();
		getLocalAnnotation();
	}
	//获取类注解
	public static void getClassAnnotation() throws ClassNotFoundException{
		Class clazz = Class.forName("com.franlisa.annotation.UseAnnotation");
		Annotation[] annotations = clazz.getAnnotations();//这两句等同UseAnnotation.class.getAnnotations();当我们不知道class的名字时候，我们用 Class.forName。
		//知道.class的字节用 UseAnnotation.class.getAnnotations()
		
		for(Annotation annotation:annotations){
			TestA testA = (TestA)annotation;
		    System.out.println("id= \""+testA.id()+"\"; name= \""+testA.name()+"\"; gid = "+testA.gid());
		}
	}
	//获取方法注解
	public static void getMethodAnnotation() throws ClassNotFoundException{
		Method[] methods = UseAnnotation.class.getMethods();
		for(Method method: methods){
			boolean hasAnnotation = method.isAnnotationPresent(TestA.class);
			if(hasAnnotation){
				TestA annotation = method.getAnnotation(TestA.class);
				 System.out.println("method = " + method.getName()  
                 + " ; id = " + annotation.id() + " ; name = "  
                 + annotation.name() + "; gid= "+annotation.gid());
			}else {
				 System.out.println("method = " + method.getName());
			}
		}

	}
	//获取构造方法注解
	public static void getConstructAnnotation(){
		Constructor[] constructors = UseAnnotation.class.getConstructors();  
        for (Constructor constructor : constructors) { 
      
            boolean hasAnnotation = constructor.isAnnotationPresent(TestA.class);  
            if (hasAnnotation) {  
            	TestA annotation =(TestA) constructor.getAnnotation(TestA.class);  
                System.out.println( "id = " + annotation.id() + " ; name = "  
                        + annotation.name() + "; gid= "+annotation.gid());  
            }  
        }  
	}
	public static void getLocalAnnotation(){
	    Field[] fields = UseAnnotation.class.getFields();
		 
        for (Field field : fields) { 
      
            boolean hasAnnotation = field.isAnnotationPresent(TestA.class);  
            if (hasAnnotation) {  
            	TestA annotation =(TestA) field.getAnnotation(TestA.class);  
                System.out.println("field = "+ field.getName()+",id = " + annotation.id() + " ; name = "  
                        + annotation.name() + "; gid= "+annotation.gid());  
            }  else {
            	System.out.println("false,field = "+field.getName());
            }
        }  
	}
	
}
