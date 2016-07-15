package uk.co.charleswilkinson;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.Arrays;

@SpringBootApplication
public class SimpleSpringBootAppApplication {

	private static Logger log = LogManager.getLogger();

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(SimpleSpringBootAppApplication.class, args);

		if(log.isDebugEnabled()) {
			log.debug("Let's inspect the beans provided by Spring Boot:");

			String[] beanNames = ctx.getBeanDefinitionNames();
			Arrays.sort(beanNames);
			for (String beanName : beanNames) {
				log.debug(beanName);
			}
		}
	}
}
