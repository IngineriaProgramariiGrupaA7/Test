package ip.project.interfaceProject.elements;

import org.openqa.selenium.By;

import ip.project.interfaceProject.core.BaseClass;

public class CreatePage extends BaseClass {

	public static By backButton = By.xpath(".//*[@id='backBtn']");
	public static By previewButton = By.xpath(".//*[@id='previewBtn']");
	public static By resetButton = By.xpath(".//*[@id='resetBtn']");
	public static By saveDraftButton = By.xpath(".//*[@id='saveDraftBtn']");
	public static By submitButton = By.xpath(".//*[@id='submitBtn']");

	public static By tittleMenu = By.xpath("html/body/div[1]/div/div[2]/div[1]/div[1]/a");

	public static By titleInsert = By.id("titleid");

	public static By authorsMenu = By.xpath("html/body/div[1]/div/div[2]/div[2]/div[1]/a");
	public static By authorInsert = By.xpath(".//*[@id='authorsList']/div/div/input");
	public static By authorAddButon = By.xpath(".//*[@id='authorsList']/button");
	public static By authorRemoveButton = By.xpath(".//*[@id='authorsList']/div[2]/div/button");

	public static By descriptionMenu = By.xpath("html/body/div[1]/div/div[2]/div[3]/div[1]/a");
	public static By descriptionInsert = By.xpath(".//*[@id='formDescription']/form/textarea");

	public static By domainMenu = By.xpath("html/body/div[1]/div/div[2]/div[4]/div[1]/a");
	public static By domainInsert = By.xpath(".//*[@id='formDomain']/form/input");

	public static By stakeholdersAndInterestsMenu = By.xpath("html/body/div[1]/div/div[2]/div[5]/div[1]/a");
	public static By stakeholdersAndInterestsEditButton = By.xpath(".//*[@id='stakeholdersList']/div/button[2]");
	public static By stakeholdersAndInterestsEditWindow = By.xpath(".//*[@id='stakeholdersList']/div/div/div");
	
	public static By stakeholdersAndInterestsEditInsertTitle = By
			.xpath(".//*[@id='stakeholdersList']/div/div/div/form/input");
	
	public static By stakeholdersAndInterestsEditInsertInterests = By
			.xpath(".//*[@id='stakeholdersList']/div/div/div/form/textarea");
	
	public static By stakeholdersAndInterestsEditWindowCancelButton = By
			.xpath(".//*[@id='stakeholdersList']/div/div/div/form/div/div/button[1]");
	
	public static By stakeholdersAndInterestsEditWindowSaveButton = By
			.xpath(".//*[@id='stakeholdersList']/div/div/div/form/div/div/button[2]");
	
	public static By stakeholdersAndInterestsAddButton = By.xpath(".//*[@id='StakeholdersList']/button");
	public static By stakeholdersAndInterestsRemoveButton = By.xpath(".//*[@id='stakeholdersList']/div[2]/button[1]");
	public static By stakeholdersAndInterestsFieldName = By.xpath(".//*[@id='stakeholdersList']/div/span");

	public static By ActorsAndObjectivesMenu = By.xpath("html/body/div[1]/div/div[2]/div[6]/div[1]/a");
	public static By ActorsAndObjectivesEditButton = By.xpath(".//*[@id='actorsList']/div/button[2]");
	public static By ActorsAndObjectivesWindow = By.xpath(".//*[@id='stakeholdersList']/div/div/div");
	public static By ActorsAndObjectivesWindowInsertTitle = By.xpath(".//*[@id='stakeholdersList']/div/div/div/form/input");
	public static By ActorsAndObjectivesWindowInsertText = By.xpath(".//*[@id='stakeholdersList']/div/div/div/form/textarea");
	public static By ActorsAndObjectivesWindowsInherits = By.xpath(".//*[@id='actorsList']/div[2]/button[1]");	
	public static By ActorsAndObjectivesWindowCancelButton = By.xpath(".//*[@id='stakeholdersList']/div/div/div/form/div/div/button[1]");
	public static By ActorsAndObjectivesWindowSaveButton = By.xpath(".//*[@id='stakeholdersList']/div/div/div/form/div/div/button[2]");	
	public static By ActorsAndObjectivesAddButton = By.xpath(".//*[@id='actorsList']/button");	
	public static By ActorsAndObjectivesRemoveButton = By.xpath(".//*[@id='actorsList']/div[2]/button[1]");	
	
	
	
	public static By usecaseMenu = By.xpath("html/body/div[1]/div/div[2]/div[7]/div[1]/a");
	public static By usecaseEditButton = By.xpath(".//*[@id='usecase_list']/div/button[2]");
	public static By usecaseAddButton = By.xpath(".//*[@id='usecase_list']/button");
}
