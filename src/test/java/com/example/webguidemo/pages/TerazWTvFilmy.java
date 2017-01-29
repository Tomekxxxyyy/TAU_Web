package com.example.webguidemo.pages;

import java.util.concurrent.TimeUnit;

import org.jbehave.web.selenium.WebDriverPage;
import org.jbehave.web.selenium.WebDriverProvider;
import org.openqa.selenium.By;

public class TerazWTvFilmy extends WebDriverPage{
	
	public TerazWTvFilmy(WebDriverProvider driverProvider) {
		super(driverProvider);
	}
	
	public void open() {
		get("http://www.teleman.pl/teraz?cat=fil");
		manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	}
}
