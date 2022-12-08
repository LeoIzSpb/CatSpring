import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld helloWorl1 =  applicationContext.getBean("helloworld",HelloWorld.class);
        HelloWorld helloWorl2 =  applicationContext.getBean("helloworld",HelloWorld.class);
        
        Cat cat1 = applicationContext.getBean("cat",Cat.class);
        Cat cat2 = applicationContext.getBean("cat",Cat.class);
        
        System.out.println(helloWorl1.getMessage());
        System.out.println(helloWorl1 == helloWorl2);
        System.out.println(cat1 == cat2);
        
    }
}