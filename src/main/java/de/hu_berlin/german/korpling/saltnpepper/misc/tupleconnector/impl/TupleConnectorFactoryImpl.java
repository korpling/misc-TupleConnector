package de.hu_berlin.german.korpling.saltnpepper.misc.tupleconnector.impl;

import de.hu_berlin.german.korpling.saltnpepper.misc.tupleconnector.TupleConnectorFactory;
import de.hu_berlin.german.korpling.saltnpepper.misc.tupleconnector.TupleReader;
import de.hu_berlin.german.korpling.saltnpepper.misc.tupleconnector.TupleWriter;

public class TupleConnectorFactoryImpl implements TupleConnectorFactory
{
	public static volatile TupleConnectorFactoryImpl instance= null;
	
	public synchronized static TupleConnectorFactoryImpl init()
	{
		if (instance== null)
			instance= new TupleConnectorFactoryImpl(); 
		return(instance);
	}
	
	private TupleConnectorFactoryImpl()
	{
		
	}
	
	/**
	 * Returns a TupleWriter-object. 
	 */
	//@Override
	public Object getObject() throws Exception 
	{
		return(new TupleWriterImpl());
	}

	/**
	 * Returns the class of TupleWriter-object.
	 */
	//@Override
	public Class<TupleWriter> getObjectType() 
	{
		return(TupleWriter.class);
	}

	/**
	 * The produced objects are no singletons.
	 */
	//@Override
	public boolean isSingleton() 
	{
		return false;
	}
	
	/**
	 * Returns a new TupleWriter-object.
	 * @return a new TupleWriter-object
	 */
	public TupleWriter createTupleWriter()
	{
		TupleWriter tupleWriter= new TupleWriterImpl();
		return(tupleWriter);
	}

	@Override
	public TupleReader createTupleReader() 
	{
		TupleReader tupleReader= new TupleReaderImpl();
		return(tupleReader);
	}
	
}
