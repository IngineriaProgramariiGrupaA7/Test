/**
 * 
 */
package ip.project.interfaceProject.clicks;
import org.openqa.selenium.support.ui.ExpectedConditions;

import ip.project.interfaceProject.core.BaseClass;
import ip.project.interfaceProject.elements.CreatePage;
import ip.project.interfaceProject.elements.FrontPage;

/**
 * @author Daniel
 *
 */
public class StakeholdersAndInterestsInsertData extends BaseClass{

	public static void clickSAI(){
		wait.until(ExpectedConditions.visibilityOfElementLocated(CreatePage.stakeholdersAndInterestsMenu));
		element(CreatePage.stakeholdersAndInterestsMenu).click();
	}
	public static void clickSAIEditButton(){
		wait.until(ExpectedConditions.visibilityOfElementLocated(CreatePage.stakeholdersAndInterestsEditButton));
		element(CreatePage.stakeholdersAndInterestsEditButton).click();
	}
	public static void SAIInsertTitle(){
		wait.until(ExpectedConditions.visibilityOfElementLocated(CreatePage.stakeholdersAndInterestsEditWindow));
		element(CreatePage.stakeholdersAndInterestsEditInsertTitle).sendKeys("Acesta este un titlu de interes");
	}
	public static void SAIInsertText(){
		wait.until(ExpectedConditions.visibilityOfElementLocated(CreatePage.stakeholdersAndInterestsEditInsertInterests));
		element(CreatePage.stakeholdersAndInterestsEditInsertInterests).sendKeys("Aici se vor scrie interesele");
	}
	public static void SAICancelButton(){
		wait.until(ExpectedConditions.visibilityOfElementLocated(CreatePage.stakeholdersAndInterestsEditWindowCancelButton));
		element(CreatePage.stakeholdersAndInterestsEditWindowCancelButton).click();
	}
	public static void SAISaveButton(){
		wait.until(ExpectedConditions.visibilityOfElementLocated(CreatePage.stakeholdersAndInterestsEditWindowSaveButton));
		element(CreatePage.stakeholdersAndInterestsEditWindowSaveButton).click();
	}
	public static void SAIAddButton(){
		wait.until(ExpectedConditions.visibilityOfElementLocated(CreatePage.stakeholdersAndInterestsAddButton));
		element(CreatePage.stakeholdersAndInterestsAddButton).click();
	}
	public static void SAIRemoveButton(){
		wait.until(ExpectedConditions.visibilityOfElementLocated(CreatePage.stakeholdersAndInterestsRemoveButton));
		element(CreatePage.stakeholdersAndInterestsRemoveButton).click();
	}

}
