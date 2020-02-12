package org.chris.Wowhead;

import java.io.File;
import java.io.FileNotFoundException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class OutilTechnique {
	
static WebDriver driver ;
	
	static WebDriver choisirNavigateur(ENavigateur nav) {
		switch(nav) {
		case firefox:
			//System.setProperty("webdriver.gecko.driver", "src/test/resources/geckodriver.exe") ;
			driver = new FirefoxDriver() ;
			return driver;
		case chrome:
			//System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
			driver = new ChromeDriver();
			return driver;
		case ie:
			//System.setProperty("webdriver.ie.driver", "src/test/resources/IEDriverServer.exe");
			driver = new InternetExplorerDriver();
			return driver;
		default: return null;
			
		}
		
	}
	
	public List<String> loadFile(String filePath) throws FileNotFoundException {
		URL toto = OutilTechnique.class.getClassLoader().getResource(filePath);
		File totoResource = new File(toto.getFile());
		
	    Scanner s = new Scanner(totoResource, "UTF-8");
	    ArrayList<String> list = new ArrayList<String>();
	    while (s.hasNextLine()){
	        list.add(s.nextLine());
	    }
	    s.close();
	   
	    return list;
	}


}
