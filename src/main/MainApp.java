package main;
import org.springframework.beans.factory.BeanFactory;

import org.springframework.context.ApplicationContext;

import org.springframework.context.support.ClassPathXmlApplicationContext;


import testbean.MySpringUnionBeanWithDependency;
import testbean.MySpringWriterBeanWithDependency;

public class MainApp {

    public static void main(String[] args){
        ApplicationContext context = new ClassPathXmlApplicationContext("file:META-INF/beans2.xml");

        BeanFactory factory = context;

        MySpringUnionBeanWithDependency test = (MySpringUnionBeanWithDependency) factory.getBean("MySpringUnionBeanWithDependency");


        test.run();
    }


}