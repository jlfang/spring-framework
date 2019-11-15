package org.jlfang.demo;

import org.jlfang.demo.config.AppConfig;
import org.jlfang.demo.dao.CrisDao;
import org.springframework.beans.factory.support.ChildBeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class Test1 {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(AppConfig.class);
		RootBeanDefinition rootBeanDefinition = new RootBeanDefinition();
		rootBeanDefinition.getPropertyValues().add("name","Cris");
		rootBeanDefinition.setAbstract(true);
		ChildBeanDefinition childBeanDefinition = new ChildBeanDefinition("parent");


	}
}
