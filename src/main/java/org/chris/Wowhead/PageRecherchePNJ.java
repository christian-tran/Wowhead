package org.chris.Wowhead;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PageRecherchePNJ {
	
	@FindBy (xpath="//td[@class='icon-boss-padded']/a")
	WebElement pnj_boss ;

}
