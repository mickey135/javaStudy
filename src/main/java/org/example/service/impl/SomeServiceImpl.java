package org.example.service.impl;

import org.example.service.SomeService;

public class SomeServiceImpl implements SomeService {

    public SomeServiceImpl() {
        System.out.println("SomeServiceImpl的无参数构造方法");
    }

    @Override
    public void doSome() {
        System.out.println("执行了someServiceImpl的doSome()方法");
    }
}
