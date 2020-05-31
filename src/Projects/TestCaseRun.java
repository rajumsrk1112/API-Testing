package Projects;
import java.io.IOException;

import org.apache.xmlbeans.XmlException;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.eviware.soapui.impl.wsdl.WsdlProject;
import com.eviware.soapui.impl.wsdl.WsdlTestSuite;
import com.eviware.soapui.impl.wsdl.testcase.WsdlTestCase;
import com.eviware.soapui.impl.wsdl.testcase.WsdlTestCaseRunner;
import com.eviware.soapui.model.support.PropertiesMap;
import com.eviware.soapui.model.testsuite.TestRunner.Status;
import com.eviware.soapui.support.SoapUIException;

public class TestCaseRun {

	@Test
	public void RestAPI() throws XmlException, IOException, SoapUIException
	{
		WsdlProject Project = new WsdlProject("C:\\Users\\msrkr\\OneDrive\\Documents\\Library-soapui-project.xml");
		WsdlTestSuite testsuite = Project.getTestSuiteByName("TestSuite 1");
		
		WsdlTestCase AddBook = testsuite.getTestCaseByName("AddBook");
		WsdlTestCaseRunner runner = AddBook.run(new PropertiesMap(),false);
		Assert.assertEquals(Status.FINISHED, runner.getStatus());
	}
}
	
