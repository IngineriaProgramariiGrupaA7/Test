package ip.project.interfaceProject.Test;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;

import ip.project.interfaceProject.clicks.CreatePageInsertData;
import ip.project.interfaceProject.clicks.FrontPageInsertData;
import ip.project.interfaceProject.core.BaseClass;


public class Author extends BaseClass{
	@Test
	public void addAuthor() {
		FrontPageInsertData.createButtonClick();
		CreatePageInsertData.clickAuthors();
	}

}
