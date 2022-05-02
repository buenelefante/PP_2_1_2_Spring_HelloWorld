import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld bean =
                (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(bean.getMessage());

        HelloWorld bean2 =
                (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(bean.getMessage());

        Cat beanCat = (Cat) applicationContext.getBean("cat");
        System.out.println(beanCat.getName());
        Cat beanCat2 = (Cat) applicationContext.getBean("cat");
        System.out.println(beanCat.getName());
        System.out.println("========================================");
        System.out.println("сравниваем helloworld "+ (bean==bean2));
        System.out.println("========================================");
        System.out.println("сравниваем cat "+ (beanCat==beanCat2));
        System.out.println("========================================");


    }
}