package ip.project.interfaceProject.clicks;

import org.openqa.selenium.support.ui.ExpectedConditions;

import ip.project.interfaceProject.core.BaseClass;
import ip.project.interfaceProject.elements.CreatePage;

public class ActorsAndObjectivesInsertData extends BaseClass{
	
	public static void clickAAO(){
		wait.until(ExpectedConditions.visibilityOfElementLocated(CreatePage.ActorsAndObjectivesMenu));
		element(CreatePage.ActorsAndObjectivesMenu).click();
	}
	public static void AAOEditButton(){
		wait.until(ExpectedConditions.visibilityOfElementLocated(CreatePage.ActorsAndObjectivesEditButton));
		element(CreatePage.ActorsAndObjectivesEditButton).click();
	}
	public static void AAOInsertTitle(){
		wait.until(ExpectedConditions.visibilityOfElementLocated(CreatePage.ActorsAndObjectivesWindowInsertTitle));
		element(CreatePage.ActorsAndObjectivesWindowInsertTitle).sendKeys("Acesta este un nume de actor");
	}
	public static void AAOInsertText(){
		wait.until(ExpectedConditions.visibilityOfElementLocated(CreatePage.ActorsAndObjectivesWindowInsertText));
		element(CreatePage.ActorsAndObjectivesWindowInsertText).sendKeys("Acesta este un obiectiv");
	}
	public static void AAOCancelButton(){
		wait.until(ExpectedConditions.visibilityOfElementLocated(CreatePage.ActorsAndObjectivesWindowCancelButton));
		element(CreatePage.ActorsAndObjectivesWindowCancelButton).click();
	}
	public static void AAOSaveButton(){
		wait.until(ExpectedConditions.visibilityOfElementLocated(CreatePage.ActorsAndObjectivesWindowSaveButton));
		element(CreatePage.ActorsAndObjectivesWindowSaveButton).click();
	}
	public static void AAOInherits(){
		wait.until(ExpectedConditions.visibilityOfElementLocated(CreatePage.ActorsAndObjectivesWindowsInherits));
		element(CreatePage.ActorsAndObjectivesWindowsInherits).click();
	}
	public static void AAOAddButton(){
		wait.until(ExpectedConditions.visibilityOfElementLocated(CreatePage.ActorsAndObjectivesAddButton));
		element(CreatePage.ActorsAndObjectivesAddButton).click();
	}
	public static void AAORemoveButton(){
		wait.until(ExpectedConditions.visibilityOfElementLocated(CreatePage.ActorsAndObjectivesRemoveButton));
		element(CreatePage.ActorsAndObjectivesRemoveButton).click();
	}

}
