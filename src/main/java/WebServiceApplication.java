import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * Created by ajay on 13/6/21.
 */
@SpringBootApplication
@ComponentScan("controller")
public class WebServiceApplication {
        public static void main(String[] args) {
            SpringApplication.run(WebServiceApplication.class, args);
        }
}
