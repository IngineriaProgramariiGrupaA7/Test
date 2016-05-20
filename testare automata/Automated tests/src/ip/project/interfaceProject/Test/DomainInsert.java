package ip.project.interfaceProject.Test;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;

import ip.project.interfaceProject.clicks.CreatePageInsertData;
import ip.project.interfaceProject.clicks.FrontPageInsertData;
import ip.project.interfaceProject.core.BaseClass;

public class DomainInsert extends BaseClass{
	@Test
	public void Domain(){
	FrontPageInsertData.createButtonClick();
	CreatePageInsertData.clickDomain();	
	CreatePageInsertData.insertDomain();
	}

}