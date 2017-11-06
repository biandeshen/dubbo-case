package top.biandeshen.services.impl;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

public class Provider {
    public static void main(String[] args) throws IOException {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"classpath*:dubbo/dubbo-provider.xml"});
        context.start();
        System.out.println("服务已启动。。。");
        System.in.read();//保证服务一直开着，利用输入流的阻塞来模拟
    }
}
