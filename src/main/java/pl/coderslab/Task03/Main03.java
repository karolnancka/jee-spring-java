package pl.coderslab.Task03;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class Main03 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx =  new AnnotationConfigApplicationContext(AppSailConfig.class);
        Ship ship = ctx.getBean("blackPearl", Ship.class);
        ship.getCaptain().startSailing();
        ctx.close();
    }
}
