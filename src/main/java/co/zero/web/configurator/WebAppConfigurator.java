//=======================================================================
// ARCHIVO WebAppConfigurator.java
// FECHA CREACIÓN: Jun 29, 2015
//=======================================================================
package co.zero.web.configurator;

import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.servlet.support.AbstractDispatcherServletInitializer;

/**
 * Descripción de la clase
 * @author Hernán Tenjo
 * @version 1.0
 */
public class WebAppConfigurator extends AbstractDispatcherServletInitializer{

	/* (non-Javadoc)
	 * @see org.springframework.web.servlet.support.AbstractDispatcherServletInitializer#createServletApplicationContext()
	 */
	@Override
	protected WebApplicationContext createServletApplicationContext() {
		return null;
	}

	/* (non-Javadoc)
	 * @see org.springframework.web.servlet.support.AbstractDispatcherServletInitializer#getServletMappings()
	 */
	@Override
	protected String[] getServletMappings() {
		return null;
	}

	/* (non-Javadoc)
	 * @see org.springframework.web.context.AbstractContextLoaderInitializer#createRootApplicationContext()
	 */
	@Override
	protected WebApplicationContext createRootApplicationContext() {
		return null;
	}
}

