//=======================================================================
// ARCHIVO MessagePrinter.java
// FECHA CREACIÓN: Jun 28, 2015
//=======================================================================
package co.zero.ccd.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Component that uses the test interface
 * @author Hernán Tenjo
 * @version 1.0
 */
@Component
public class MessagePrinter {

    final private MessageService service;

    @Autowired
    public MessagePrinter(MessageService service) {
        this.service = service;
    }

    public void printMessage() {
        System.out.println(this.service.getMessage());
    }
}