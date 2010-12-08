package de.hu_berlin.german.korpling.saltnpepper.misc.tupleconnector.tests;

import java.io.File;
import java.util.Collection;
import java.util.Vector;

import junit.framework.TestCase;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

import de.hu_berlin.german.korpling.saltnpepper.misc.tupleconnector.TupleConnectorFactory;
import de.hu_berlin.german.korpling.saltnpepper.misc.tupleconnector.TupleWriter;

public class TupleWriterTest extends TestCase 
{
	Logger logger= null;
	
	{
		PropertyConfigurator.configureAndWatch("props/log4j.properties", 60*1000 );
		logger= Logger.getLogger(this.getClass());
	}
	
	private TupleWriter fixture= null;
	
	public TupleWriter getFixture()
	{
		return(this.fixture);
	}
	
	public void setFixture(TupleWriter fixture)
	{
		this.fixture= fixture;
	}
	
	@Override
	public void setUp()
	{
		this.setFixture(TupleConnectorFactory.fINSTANCE.createTupleWriter());
	}
	
	public void testAllSetters() throws Exception
	{
		String info= "Testing all setters and checking with getters...";
		try
		{
			//encoding
			String enc= "UTF-8";
			assertTrue("both encodings has to be the same. ", this.getFixture().getEncoding().equalsIgnoreCase(enc));
			
			//seperator
			String sep= "\t";
			assertTrue("both sperator has to be the same. ", this.getFixture().getSeperator().equalsIgnoreCase(sep));
			
			//seperator
			File file= new File("./newFile.tab");
			this.getFixture().setFile(file);
			assertEquals("both files shall be the same.", this.getFixture().getFile(), file);
			
			//attributenames
			String[] atts= {"att1", "att2", "att3"};
			Collection<String> attCol= new Vector<String>();
			for (String att: atts)
				attCol.add(att);
			this.getFixture().setAttNames(attCol);
			assertSame("both collections shall be the same.", attCol, this.getFixture().getAttNames());
			
		}
		catch (Exception e)
		{
			logger.info(info+"FAILED");
			logger.info(e.getMessage());
			e.printStackTrace();
			throw e;
		}
		logger.info(info+"OK");
	}
}
