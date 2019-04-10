package com.cg.trainee.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestTrainee {

	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\gurjosin\\Desktop\\Important\\Module3\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("C:\\Spring2\\TMSFinalSpring\\WebContent\\Views\\loginForm.jsp");
		
		
	}

}
