package org.chris.Wowhead;

import static org.junit.Assert.*;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;



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

	WebDriver driver; //= new ChromeDriver();
	private String BROWSER = System.getProperty("navigateur");
	
	// JDD
	String PNJAChercher = "lardeur";
	
	@Before
	public void setup() {
		driver = OutilTechnique.choisirNavigateur(BROWSER);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	@After
	public void tearDown()
	{
		driver.quit();
	}
	
	@Test
	public void test() throws InterruptedException, FileNotFoundException {
		
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
		List<String> objet1CaracRef = OutilTechnique.loadFile("src/test/resources/Objet1");
		List<String> objet1Carac = PageItemLoot.returnCaractItem(driver, "Chahuteurs de cadavre");
		System.out.println(objet1Carac);
		System.out.println(objet1CaracRef);

		
		Thread.sleep(7000);




	}

	
}
