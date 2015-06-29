//=======================================================================
// ARCHIVO MessagePrinter.java
// FECHA CREACIÓN: Jun 28, 2015
//=======================================================================
package co.zero.springtest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Descripción de la clase
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