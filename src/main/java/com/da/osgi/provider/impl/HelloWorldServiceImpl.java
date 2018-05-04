package com.da.osgi.provider.impl;

import com.da.osgi.provider.able.HelloWorldService;

public class HelloWorldServiceImpl implements HelloWorldService {


    public HelloWorldServiceImpl() {

    }

    public void hello() {
        System.out.println("Hello World!");
    }
}
