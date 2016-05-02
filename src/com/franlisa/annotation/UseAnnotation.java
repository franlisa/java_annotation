package com.franlisa.annotation;

import java.util.HashMap;
import java.util.Map;

import org.omg.CosNaming.NamingContextExtPackage.StringNameHelper;


@TestA//使用了类注解
(gid = Long.class, name = "test_A")
public class UseAnnotation {
	
	private Integer age;
	
	@TestA(name="class member",gid= Long.class)  //累成员注解
	private String address;
	
	@TestA(gid = Long.class, name = "construct",id =2)  //构造方法注解
	public UseAnnotation() {
		// TODO Auto-generated constructor stub
	}
	@TestA(gid = Long.class, name = "method",id=3) //类方法注解
	public void a(){
		@TestA(gid = Long.class, name = "local member",id=4) // 局部变量注解
		Map map = new HashMap<>(0);
		
	}
	private void test(){
		
	}
	//	public void b(@TestA Integer a){ //方法参数注解
//		
//	}

}
