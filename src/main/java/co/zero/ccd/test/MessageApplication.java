//=======================================================================
// ARCHIVO Application.java
// FECHA CREACIÓN: Jun 28, 2015
//=======================================================================
package co.zero.ccd.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Entry point for testing Apps
 * @author Hernán Tenjo
 * @version 1.0
 */
@Configuration
@ComponentScan
public class MessageApplication {
	/**
	 * Instanciate the abstract service 
	 * @return The concrete service
	 */
	@Bean
	public MessageService mockMessageService() {
		return new MessageService() {
			public String getMessage() {
				return "Hello World!";
			}
		};
	}

	/**
	 * Main method entry point to test applications
	 * @param args
	 */
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(MessageApplication.class);
		MessagePrinter printer = context.getBean(MessagePrinter.class);
		printer.printMessage();
		((AnnotationConfigApplicationContext)context).close();
	}
}