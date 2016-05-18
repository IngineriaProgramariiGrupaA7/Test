package ip.project.interfaceProject.Test;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

import ip.project.interfaceProject.clicks.FrontPageInsertData;
import ip.project.interfaceProject.clicks.StakeholdersAndInterestsInsertData;
import ip.project.interfaceProject.core.BaseClass;

public class StakefoldersAndInterestsEdit extends BaseClass{
	@Test
	public void clickSAI(){
		FrontPageInsertData.createButtonClick();
		StakeholdersAndInterestsInsertData.clickSAI();
		StakeholdersAndInterestsInsertData.clickSAIEditButton();
	}

}