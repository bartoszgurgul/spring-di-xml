package pl.javastart;


import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import pl.javastart.beans.MessagePrinter;

@Configuration
@ComponentScan(basePackageClasses = MessagePrinter.class)
public class SpringDiApplication {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(SpringDiApplication.class);
        MessagePrinter printer = context.getBean(MessagePrinter.class);
        printer.print();
        context.close();

    }
}
