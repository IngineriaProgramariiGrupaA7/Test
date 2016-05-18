package ip.project.interfaceProject.Test;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;

import ip.project.interfaceProject.clicks.CreatePageInsertData;
import ip.project.interfaceProject.clicks.FrontPageInsertData;
import ip.project.interfaceProject.core.BaseClass;

public class DescriptionInsert extends BaseClass{
	@Test
	public void addDescription(){
		FrontPageInsertData.createButtonClick();
		CreatePageInsertData.clickDescription();
		CreatePageInsertData.insertDescription();
	}

}