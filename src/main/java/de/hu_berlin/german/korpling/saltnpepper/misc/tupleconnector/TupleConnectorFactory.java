package de.hu_berlin.german.korpling.saltnpepper.misc.tupleconnector;

import de.hu_berlin.german.korpling.saltnpepper.misc.tupleconnector.impl.TupleConnectorFactoryImpl;

public interface TupleConnectorFactory 
{
	TupleConnectorFactory fINSTANCE = TupleConnectorFactoryImpl.init();
	
	/**
	 * Returns a new TupleWriter-object.
	 * @return a new TupleWriter-object
	 */
	public TupleWriter createTupleWriter();
	
	/**
	 * Returns a new TupleReader-object.
	 * @return a new TupleReader-object
	 */
	public TupleReader createTupleReader();
}
