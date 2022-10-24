package edu.com.ngpos;

import java.util.ArrayList;
import java.util.List;

public class AnnotationTest extends Object {
    // 覆写，告诉JDK，JVM 覆写的方法
    @Override
    public String toString() {
        return "AnnotationTest{}";
    }
    // 告诉JVM方法过时了，有更好的方法
    @Deprecated
    public void test(){

    }
    @SuppressWarnings("all") //类，属性位置都可以
    public void test1(){
        List list = new ArrayList<>();
    }
}
