package pl.coderslab.spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import pl.coderslab.beans.HelloWorld;

public class SpringDiApplication {
    public static void main(String[] args) {
       AnnotationConfigApplicationContext ctx =  new AnnotationConfigApplicationContext(AppConfig.class);
       HelloWorld hw = ctx.getBean("helloWorld", HelloWorld.class);
       hw.hello();
       ctx.close();
    }
}
