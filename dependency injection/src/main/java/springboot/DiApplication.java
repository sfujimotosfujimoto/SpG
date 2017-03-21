package springboot;

import com.sfujimoto.controllers.GreetingController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ImportResource;


@SpringBootApplication
@ImportResource("classpath:/spring/spring-config.xml")
public class DiApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(DiApplication.class, args);

        GreetingController controller = (GreetingController) ctx.getBean("greetingController");

        controller.sayHello();


	}
}
