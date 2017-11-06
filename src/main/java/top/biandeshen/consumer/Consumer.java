package top.biandeshen.consumer;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import top.biandeshen.services.IServiceAPI;

import java.io.IOException;

public class Consumer {
    public static void main(String[] args) throws IOException {
        for (int i = 0;i<10;i++){
            ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"classpath*:dubbo/dubbo-consumer.xml"});
            context.start();
            IServiceAPI iServiceAPI = (IServiceAPI) context.getBean("caseService");
            String para = iServiceAPI.showMessage("dubbo");
            System.out.println(para);
        }


        System.in.read();//保证服务一直开着，利用输入流的阻塞来模拟
    }
}
