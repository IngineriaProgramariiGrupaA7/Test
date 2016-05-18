package ip.project.interfaceProject.Test;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

import ip.project.interfaceProject.clicks.ActorsAndObjectivesInsertData;
import ip.project.interfaceProject.clicks.FrontPageInsertData;
import ip.project.interfaceProject.core.BaseClass;

public class ActorsAndObjectivesEdit extends BaseClass{
	@Test
	public void actorsAndObjectives() {
		FrontPageInsertData.createButtonClick();
		ActorsAndObjectivesInsertData.clickAAO();
		ActorsAndObjectivesInsertData.AAOEditButton();
		ActorsAndObjectivesInsertData.AAOInsertTitle();
		ActorsAndObjectivesInsertData.AAOInsertText();
		ActorsAndObjectivesInsertData.AAOSaveButton();

	}

}