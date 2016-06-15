package rozetka;


import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TopProdazh {

	public static void main(String[] args) {

        
		WebDriver driver = new FirefoxDriver();
		
		
	driver.get("http://rozetka.com.ua/mobile-phones/c80003/filter/preset=smartfon/");
	List<WebElement> tel = driver.findElements(By.xpath(".//*[@class='g-i-tile g-i-tile-catalog']"));
	//List<WebElement> top = driver.findElements(By.xpath(".//*[@class='g-tag  g-tag-icon-middle-popularity sprite']"));
	
	
	//if(top.size()>0 && top.size()<4){
	for (WebElement element: tel) {
	int i=0;
	element=tel.get(i);
//	i++;
	//System.out.println(element.getText());
	      System.out.println(tel.get(3).getText());
	}
	
//	}
	
		}
			
	}


