package org.chris.Wowhead;

import static org.junit.Assert.*;

import java.util.concurrent.TimeUnit;

import org.chris.Wowhead.ENavigateur;
import org.chris.Wowhead.OutilTechnique;
import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.Keys;

public class PageObject_Test {
	
	// JDD
	String PNJAChercher = "lardeur";
	WebDriver driver = new ChromeDriver();
	
	@Before
	public void setup() {
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	@After
	public void tearDown()
	{
		driver.quit();
	}
	
	@Test
	public void test() throws InterruptedException {
		
		driver.get("https://fr.wowhead.com/");
		driver.manage().window().maximize();
		
		PageAcceuil page_index = PageFactory.initElements(driver, PageAcceuil.class);
		Thread.sleep(3000);
		page_index.declinercookies.click();
		Thread.sleep(3000);
		page_index.btn_continuer.click();
		Thread.sleep(3000);
		page_index.recherche.clear();
		page_index.recherche.sendKeys(PNJAChercher);
		page_index.recherche.sendKeys(Keys.RETURN);
		Thread.sleep(3000);
		PageRecherchePNJ page_recherche = PageFactory.initElements(driver, PageRecherchePNJ.class);
		page_recherche.pnj_boss.click();
		Thread.sleep(3000);
		PagePNJ page_PNJ = PageFactory.initElements(driver, PagePNJ.class);
		page_PNJ.objet1.click();
		Thread.sleep(3000);
		PageItemLoot page_item_loot1 = PageFactory.initElements(driver, PageItemLoot.class);
		
		String description_objet1 = page_item_loot1.objet1.getText();
		System.out.println(description_objet1);
		
		Thread.sleep(7000);




	}

	
}
