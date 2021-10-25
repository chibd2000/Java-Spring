package com.zpchcbd.log;

import java.lang.reflect.Method;

public class DiyLog {
    public void before() throws Throwable {
        System.out.println("=========BeforeLog=========");
    }

    public void after() throws Throwable {
        System.out.println("=========Afterlog=========");
    }
}
