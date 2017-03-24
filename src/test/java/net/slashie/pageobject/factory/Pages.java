package net.slashie.pageobject.factory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import net.slashie.pageobject.AddProjectPage;

public class Pages {
	
	private WebDriver webDriver;
	
	public Pages() {
		webDriver = new ChromeDriver();
	}
	
	public AddProjectPage anAddProjectPage() {
		return new AddProjectPage(webDriver);
	}
}
