package net.slashie.pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AddProjectPage {
	
	private static final String XPATH_ADD_BUTTON = "/html/body/div/project-picker/projects/form/p[2]/button";
	private static final String XPATH_PROJECT_NAME_INPUT = "/html/body/div/project-picker/projects/form/p[1]/input";
	
	private static final String URL_PAGE = "http://slashie.net/pp/";
	
	private static final String CSS_CLASS_PROJECT_LIST = "projectName";
	
	private WebDriver driver;
	private WebElement projectNameInput;
	private WebElement addButton;
	private WebElement projectList;
	
	public AddProjectPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public AddProjectPage open() {
		this.driver.get(URL_PAGE);
		return this;
	}
	
	public AddProjectPage addProject(String projectName) {
		projectNameInput = this.driver.findElement(By.xpath(XPATH_PROJECT_NAME_INPUT));
		projectNameInput.sendKeys(projectName);
		return this;
	}
	
	public AddProjectPage clickAddButton() {
		addButton = this.driver.findElement(By.xpath(XPATH_ADD_BUTTON));
		addButton.click();
		return this;
	}

	public String listProjects() {
		projectList = this.driver.findElement(By.className(CSS_CLASS_PROJECT_LIST));
		return projectList.getText();
		
	}

	public void closeSession() {
		this.driver.quit();
		
	}
}
