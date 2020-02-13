package org.chris.Wowhead;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PageItemLoot {

	static List<WebElement> elements = null;

	public static List<String> returnCaractItem(WebDriver driver, String Item) {
		List<String> caracItem = new ArrayList<>();
		elements = driver.findElements(By.xpath("//b[text()='"+Item+"']/ancestor::div[@data-visible='yes']//span"));
		for (WebElement element : elements) {
			caracItem.add(element.getText());
		}
		return caracItem;
	}

}
