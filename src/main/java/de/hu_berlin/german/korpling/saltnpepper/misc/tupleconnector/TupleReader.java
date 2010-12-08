package de.hu_berlin.german.korpling.saltnpepper.misc.tupleconnector;

import java.io.File;
import java.io.IOException;
import java.util.Collection;

/**
 * Classes which implements this interface can read a stream which contains tuples. 
 * Although tuples will be read in whole and gave back tuple by tuple.
 * 
 * @author Florian Zipser
 *
 */
public interface TupleReader 
{
	/**
	 * Sets the file from which the tuples shall come, so called datasource.
	 * @param inFile - datasource
	 */
	public void setFile(File inFile);
	
	/**
	 * Returns the
	 * @return file from which the tuples shall come, so called datasource.
	 * @return datasource
	 */
	public File getFile();
	
	/**
	 * Sets the seperator with which the data will be departed on stream. 
	 * Default seperator is tab.
	 * @param seperator with which the data will be departed on stream
	 */
	public void setSeperator(String seperator);
	
	/**
	 * Returns the seperator with which the data will be departed on stream. 
	 * @return seperator with which the data will be departed on stream
	 */ 
	public String getSeperator();
	
	/**
	 * Sets the encoding in which data shall be stored. Default is utf-8.
	 * @param encoding in which data shall be stored
	 */
	public void setEncoding(String encoding);
	
	/**
	 * Returns the encoding in which data shall be stored.
	 * @return encoding in which data shall be stored
	 */
	public String getEncoding();
	
	/**
	 * Returns a the tuple which is next in datasource. Datasource will be read one time
	 * and stored internal. a pointer is set to data and incremented when this method
	 * is called.
	 *  
	 * @return current tuple
	 */
	public Collection<String> getTuple() throws IOException;
	
	/**
	 * Returns the number of read tuples.
	 * @return number of tuples
	 */
	public Integer getNumOfTuples();
	
	/**
	 * Returns the tuple at position index. 
	 * @param index position of tuple to return
	 * @return tuple at position index
	 * @throws IOException
	 */
	public Collection<String> getTuple(Integer index) throws IOException;
	
	/**
	 * Sets internal tuple pointer to start, so that getTuple() returns all tuples from beginning.
	 */
	public void restart();
	
	/**
	 * Returns the number of tuples contained in this tuple reader.
	 * @return number of tuples
	 * @return
	 */
	public Integer size();
	
	/**
	 * Reads the given file and creates an internal list of read tuples.
	 * @throws IOException
	 */
	public void readFile() throws IOException;
}
