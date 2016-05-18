package ip.project.interfaceProject.elements;

import org.openqa.selenium.By;

import ip.project.interfaceProject.core.BaseClass;

public class FrontPage extends BaseClass{
	
	public static By create = By.xpath(".//*[@id='createBtn']");
	
	public static By open = By.xpath(".//*[@id='openBtn']");
}
