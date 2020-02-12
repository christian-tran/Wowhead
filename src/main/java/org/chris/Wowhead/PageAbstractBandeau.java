package org.chris.Wowhead;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public abstract class PageAbstractBandeau {

	@FindBy (xpath = "//input[@name='q']")
	WebElement recherche;
	
}
