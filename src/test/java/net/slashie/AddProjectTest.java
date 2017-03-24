package net.slashie;

import org.junit.Test;
import org.junit.After;

import net.slashie.pageobject.AddProjectPage;
import net.slashie.pageobject.factory.Pages;

import static org.junit.Assert.*;

public class AddProjectTest {

	private Pages pages;
	private AddProjectPage addProjectPage;
	
	@Test
	public void itAddAProject() {
		//Given
		pages = new Pages();
		String aProjectName = "AromeroProject";
		addProjectPage = pages.anAddProjectPage();
		addProjectPage.open();
		//When
		addProjectPage.addProject(aProjectName).clickAddButton();
		//Then
		assertTrue("The project added must be: " + aProjectName, addProjectPage.listProjects().contains(aProjectName));
	}
	
	@After
	public void closeSession() {
		addProjectPage.closeSession();
	}
	

}
