//=======================================================================
// ARCHIVO Application.java
// FECHA CREACIÓN: Jun 28, 2015
//=======================================================================
package co.zero.springtest;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Descripción de la clase
 * 
 * @author Hernán Tenjo
 * @version 1.0
 */
@Configuration
@ComponentScan
public class MessageApplication {
	/**
	 * 
	 * @return
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
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(MessageApplication.class);
		MessagePrinter printer = context.getBean(MessagePrinter.class);
		printer.printMessage();
		((AnnotationConfigApplicationContext)context).close();
	}
}