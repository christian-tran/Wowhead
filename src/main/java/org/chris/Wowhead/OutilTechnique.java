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
	
	static WebDriver choisirNavigateur(String nav) {
		switch(nav) {
		case "firefox":
			System.setProperty("webdriver.gecko.driver", "src/test/resources/geckodriver.exe") ;
			driver = new FirefoxDriver() ;
			return driver;
		case "chrome":
			System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
			driver = new ChromeDriver();
			return driver;
		case "ie":
			System.setProperty("webdriver.ie.driver", "src/test/resources/IEDriverServer.exe");
			driver = new InternetExplorerDriver();
			return driver;
		default: return null;
			
		}
		
	}
	
	public static List<String> loadFile(String filePath) throws FileNotFoundException {
		   

	    
	    File file = new File(filePath);
	    ArrayList<String> list = new ArrayList<String>();
	    if(file.exists()) {
	    	Scanner s = new Scanner(file, "UTF-8");
	    	
	    	while (s.hasNextLine()){
	    		list.add(s.nextLine());
	    	}
	    	s.close();
	    	
	    	}
	    return list;
	}


}
