package org.chris.Wowhead;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PageAcceuil extends PageAbstractBandeau{
	
	@FindBy (xpath="//div[@id='initial-deactivate']")
	WebElement declinercookies ;
	
	@FindBy (xpath="//button[@data-context='PROCEED']")
	WebElement btn_continuer ;

}
