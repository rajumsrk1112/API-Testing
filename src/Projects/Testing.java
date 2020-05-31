package Projects;
import java.io.IOException;

import org.apache.xmlbeans.XmlException;
import org.testng.Assert;
import org.testng.IDynamicGraph.Status;
import org.testng.annotations.Test;

import com.eviware.soapui.impl.wsdl.WsdlProject;
import com.eviware.soapui.impl.wsdl.WsdlTestSuite;
import com.eviware.soapui.impl.wsdl.testcase.WsdlTestCase;
import com.eviware.soapui.model.support.PropertiesMap;
import com.eviware.soapui.model.testsuite.TestRunner;
import com.eviware.soapui.support.SoapUIException;


public class Testing {

	@Test
	public void ReqRes() throws XmlException, IOException, SoapUIException {
		// TODO Auto-generated method stub
		WsdlProject Project = new WsdlProject("C:\\Users\\msrkr\\OneDrive\\Documents\\ReqRes-soapui-project.xml");
		WsdlTestSuite testsuite = Project.getTestSuiteByName("TestSuite 1");
		for(int i=0;i<testsuite.getTestCaseCount();i++)
		{
			WsdlTestCase testcase = testsuite.getTestCaseAt(i);
			TestRunner runner = testcase.run(new PropertiesMap(), false);
			Assert.assertEquals(com.eviware.soapui.model.testsuite.TestRunner.Status.FINISHED, runner.getStatus());
		}
		
			   
	}

}
