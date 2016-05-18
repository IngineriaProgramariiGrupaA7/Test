package ip.project.interfaceProject.clicks;

import org.openqa.selenium.support.ui.ExpectedConditions;
import ip.project.interfaceProject.core.BaseClass;
import ip.project.interfaceProject.elements.FrontPage;

public class FrontPageInsertData extends BaseClass {
	
	public static void createButtonClick(){
		wait.until(ExpectedConditions.visibilityOfElementLocated(FrontPage.create));
		element(FrontPage.create).click();
	}
	public static void openButton(){
		wait.until(ExpectedConditions.visibilityOfElementLocated(FrontPage.open));
		element(FrontPage.open).click();
	}
}
