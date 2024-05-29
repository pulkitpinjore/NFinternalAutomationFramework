package com.automation.framework;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.safari.SafariDriver;

public class testClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Map mp = new HashMap<String, String>();
		mp.put("Available for Voice", "Available");
		mp.put("In a meeting", "meeting");
		String a = "Available for Voice";
		
		for(int i=0; i<mp.size(); i++) {
			if(mp.containsKey(a)) {
				System.out.println(mp.get(a));
			}
		}
		
	    ChromeOptions opc=new ChromeOptions();
        opc.addArguments("use-fake-device-for-media-stream");
        opc.addArguments("use-fake-ui-for-media-stream");       
        
	
		EdgeOptions op=new EdgeOptions();
        op.addArguments("use-fake-device-for-media-stream");
        op.addArguments("use-fake-ui-for-media-stream");       
        WebDriver edgedriver = new EdgeDriver(op);
        Point ep = new Point(10,10);
        Point cp = new Point(650,40);
        Actions aEdge = new Actions(edgedriver);
        edgedriver.manage().window().setPosition(ep);
        
        edgedriver.manage().window().setSize(new Dimension(700,800));
       
    	
		WebDriver chromedriver = new ChromeDriver(opc);
		Actions aChrome = new Actions(chromedriver);
        
		chromedriver.manage().window().setSize(new Dimension(700,800));
        
		chromedriver.manage().window().setPosition(cp);
        
		
		edgedriver.get("https://translate.google.com/");
	
		
		System.out.println("opened edge");
		
		chromedriver.get("https://translate.google.com/");
		System.out.println("opened chrome");
		//edgedriver.findElement(By.xpath("//button[@data-language-code='en']")).click();
		//chromedriver.findElement(By.xpath("//button[@data-language-code='en']")).click();
		
		chromedriver.findElement(By.xpath("(//button[@aria-label='Translate by voice'])[2]")).click();
		edgedriver.findElement(By.xpath("//textarea")).sendKeys("hi there");
		edgedriver.findElement(By.xpath("//button[@data-tooltip-label-off='Listen']")).click();
		
	}

}
