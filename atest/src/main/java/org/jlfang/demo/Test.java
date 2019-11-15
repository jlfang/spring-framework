package org.jlfang.demo;

import org.jlfang.demo.config.AppConfig;
import org.jlfang.demo.dao.CrisDao;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;


public class  Test {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(AppConfig.class);
		ac.register(AppConfig.class);
		ac.refresh();
	}
}
