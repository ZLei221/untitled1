package com.study;

import org.springframework.stereotype.Component;

/**
 *
 */
@Component("demo1")
public class demo1 implements test {

    public void say() {
        System.out.println("hi");
    }
}
