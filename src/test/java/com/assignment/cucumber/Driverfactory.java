package com.assignment.cucumber;

import java.net.MalformedURLException;
import java.net.URI;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.xml.sax.SAXException;

import com.assignment.utils.Inputs;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Driverfactory extends Inputs{
	
	//public static String hubAddress = "http://192.168.1.6:4444/wd/hub";

	public static void webDriverinit() throws MalformedURLException {

		WebDriverManager.chromedriver().setup();
		
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.get(Inputs.URL);
		driver.manage().window().maximize();
	}

	public void removeDriver() {
		driver.quit();
	}

}
