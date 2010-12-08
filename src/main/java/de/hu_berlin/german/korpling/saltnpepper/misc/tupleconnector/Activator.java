package de.hu_berlin.german.korpling.saltnpepper.misc.tupleconnector;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;

public class Activator implements BundleActivator {

	private static BundleContext context;

	static BundleContext getContext() {
		return context;
	}

	/**
	    * Implements BundleActivator.start().
	    * @param bundleContext - the framework context for the bundle.
	  **/
	  public void start(BundleContext bundleContext) {
	    System.out.println("TupleConnector Hello World new new");
//	    logger.info("TupleConnector  log4j: Hello World");
	  }

	  /**
	    * Implements BundleActivator.stop() 
	    * @param bundleContext - the framework context for the bundle.
	  **/
	  public void stop(BundleContext bundleContext) {
	    System.out.println("TupleConnector  Goodbye World");
	  }

}
