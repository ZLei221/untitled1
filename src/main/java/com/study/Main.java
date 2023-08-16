package com.study;

import org.springframework.context.annotation.Bean;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.swing.*;

/**FileSystemXmlApplicationContext
 *
 */
public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("ClassPath.xml");
        demo1 demo1 = (demo1) context.getBean("demo1");
        demo1.say();
    }
}