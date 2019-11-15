package org.jlfang.demo;


import org.jlfang.demo.config.AppConfig;
import org.jlfang.demo.entity.A;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.expression.Expression;
import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;

public class Test2 {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(AppConfig.class);
		Object a = ac.getBean(A.class);
		System.out.println(a);
		String n = "123";
		char c = n.charAt(0);

		System.out.println(Integer.valueOf(c));
	}
}
