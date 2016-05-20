package ip.project.interfaceProject.clicks;

import org.openqa.selenium.support.ui.ExpectedConditions;

import ip.project.interfaceProject.core.BaseClass;
import ip.project.interfaceProject.elements.CreatePage;
import ip.project.interfaceProject.elements.FrontPage;

public class CreatePageInsertData extends BaseClass{
	public static void clickTitle(){
		wait.until(ExpectedConditions.visibilityOfElementLocated(CreatePage.tittleMenu));
		element(CreatePage.tittleMenu).click();
	}
	public static void insertTitle(){
		wait.until(ExpectedConditions.visibilityOfElementLocated(CreatePage.titleInsert));
		element(CreatePage.titleInsert).sendKeys("Acesta este un titlu");
	}
	public static void clickDomain(){
		wait.until(ExpectedConditions.visibilityOfElementLocated(CreatePage.domainMenu));
		element(CreatePage.domainMenu).click();
	}
	public static void insertDomain(){
		wait.until(ExpectedConditions.visibilityOfElementLocated(CreatePage.domainInsert));
		element(CreatePage.domainInsert).sendKeys("Acesta este un domeniu");
	}
	public static void clickAuthors(){
		wait.until(ExpectedConditions.visibilityOfElementLocated(CreatePage.authorsMenu));
		element(CreatePage.authorsMenu).click();
	}
	public static void insertAuthor(){
		wait.until(ExpectedConditions.visibilityOfElementLocated(CreatePage.authorInsert));
		element(CreatePage.authorInsert).sendKeys("Acesta este un autor");
	}
	public static void clickAddAuthors(){
		wait.until(ExpectedConditions.visibilityOfElementLocated(CreatePage.authorAddButon));
		element(CreatePage.authorAddButon).click();
	}
	public static void clickRemoveAuthor(){
		wait.until(ExpectedConditions.visibilityOfElementLocated(CreatePage.authorRemoveButton));
		element(CreatePage.authorRemoveButton).click();
	}
	public static void clickDescription(){
		wait.until(ExpectedConditions.visibilityOfElementLocated(CreatePage.descriptionMenu));
		element(CreatePage.descriptionMenu).click();
	}
	public static void insertDescription(){
		wait.until(ExpectedConditions.visibilityOfElementLocated(CreatePage.descriptionInsert));
		element(CreatePage.descriptionInsert).sendKeys("Aceasta este o descriere");
	}
	public static void clickSAndI(){
		element(CreatePage.stakeholdersAndInterestsMenu).click();
	}
	public static void clickSAndIEditButton(){
		element(CreatePage.stakeholdersAndInterestsEditButton).click();
	}
	public static void clickSAndIAddButton(){
		element(CreatePage.stakeholdersAndInterestsAddButton).click();
	}
	public static void clickAAnsO(){
		element(CreatePage.ActorsAndObjectivesMenu).click();
	}
	public static void clickAAndOEditButton(){
		element(CreatePage.ActorsAndObjectivesEditButton).click();
	}
	public static void clickAAndOAddButton(){
		element(CreatePage.ActorsAndObjectivesAddButton).click();
	}
	public static void clickUsecase(){
		element(CreatePage.usecaseMenu).click();
	}
	public static void clickUsecaseEditButton(){
		element(CreatePage.usecaseEditButton).click();
	}
	public static void clickUsecaseAddButton(){
		element(CreatePage.usecaseAddButton).click();
	}
	public static void clickResetButton(){
		element(CreatePage.resetButton).click();
	}
	public static void clickSaveDraftButton(){
		element(CreatePage.saveDraftButton).click();
	}
	public static void clickSubmitButton(){
		element(CreatePage.submitButton).click();
	}
	public static void clickPreviewButton(){
		element(CreatePage.previewButton).click();
	}
	public static void clickBackButton(){
		element(CreatePage.backButton).click();
	}

}
