package de.hu_berlin.german.korpling.saltnpepper.misc.tupleconnector.tests;

import junit.framework.Test;
import junit.framework.TestSuite;

public class AllTests {

	public static Test suite() {
		TestSuite suite = new TestSuite(
				"Test for de.dataconnector.tupleconnector");
		//$JUnit-BEGIN$
		suite.addTestSuite(TupleWriterTest.class);
		suite.addTestSuite(TupleConnectorTests.class);
		//$JUnit-END$
		return suite;
	}

}
